package br.com.cod3r.Exerciciossb.models.repositories;

//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListPagingAndSortingRepository;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.query.Param;

import br.com.cod3r.Exerciciossb.models.entities.Produto;

/*public interface ProdutoRepository extends CrudRepository<Produto,Integer>{
	
	

}*/
public interface ProdutoRepository extends ListPagingAndSortingRepository<Produto,Integer>, CrudRepository<Produto,Integer>{
	
	public Iterable<Produto>findByNomeContainingIgnoreCase(String parteNome);
	
	//findByNomeContaining
	//findByNomeIsContaining
	//findByNomeContains
	//
	//findByNomeStartWith
	//findByNomeEndsWith
	//
	//findByNomeNotContaining
	
	//Esse metodo é semelhante ao anterior findByNomeContaining
	/*@Query("SELECT p FROM produto p.nome LIKE %:nome%")
	public Iterable<Produto>searchByNomeLike(@Param("nome")String nome);
	*/
}
