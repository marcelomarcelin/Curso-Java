package br.com.cod3r.Exerciciossb.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.cod3r.Exerciciossb.models.entities.Produto;
import br.com.cod3r.Exerciciossb.models.repositories.ProdutoRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	//@PostMapping
	@RequestMapping(method= {RequestMethod.POST, RequestMethod.PUT})
	public @ResponseBody Produto SalvarProduto(@Valid Produto produto) {
		
		/*public @ResponseBody Produto novoProduto(@RequestParam String nome, 
				@RequestParam double preco,
				@RequestParam double desconto) {
			Produto produto= new Produto(nome, preco,desconto);*/
		//precomenor=produto.PrecocomDesconto(preco,desconto);
		produtoRepository.save(produto);
		return produto;
	}
	
	// Esse tipo de consulta não é muito viavel
	@GetMapping
	public Iterable<Produto> ObterProdutos() {
		return produtoRepository.findAll();
	}
	
	//Consultas paginadas, por id ou com uma busca especifica se torna muito melhor ao sistema
	@GetMapping("/pagina/{numeroPagina}/{qtdPaginas}")
	public Iterable<Produto> ConsultaPaginada(@PathVariable int numeroPagina, 
												@PathVariable int qtdPaginas) {
		if(qtdPaginas>=5||qtdPaginas<=0)qtdPaginas=5;
		Pageable page=PageRequest.of(numeroPagina,qtdPaginas);
		return produtoRepository.findAll(page);
	}
	
	@GetMapping("/nome/{parteNome}")
	public Iterable<Produto> ObterProdutosPorNome(@PathVariable String parteNome) {
		return produtoRepository.findByNomeContainingIgnoreCase(parteNome);
	}
	
	
	@GetMapping("/{id}")
	public Optional<Produto> obterProdutoPorId(@PathVariable int id) {
		return produtoRepository.findById(id);
	}
	
	/*@PutMapping
	public Produto alterarProduto(@Valid Produto produto) {
		produtoRepository.save(produto);
		return produto;
	}*/
	
	@DeleteMapping("/{id}")
	public void ExcluirProduto(@PathVariable int id) {
		produtoRepository.deleteById(id);
	}

}
