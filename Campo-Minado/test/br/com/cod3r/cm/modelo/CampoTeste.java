package br.com.cod3r.cm.modelo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.cod3r.cm.excecao.ExplosaoException;

public class CampoTeste {
	
	private Campo campo;
	
	
	@BeforeEach
	void iniciarCampo() {
		campo=new Campo(3,3);
	}
	
	
	@Test
	void TesteVizinho() {
		
		Campo vizinhoEsquerda= new Campo(3,2);
		Campo vizinhoDireita= new Campo(3,4);
		Campo vizinhoCima= new Campo(2,3);
		Campo vizinhoAbaixo= new Campo(4,3);
		
		boolean resultadoEsquerda=campo.adicionarVizinho(vizinhoEsquerda);
		boolean resultadoDireita=campo.adicionarVizinho(vizinhoDireita);
		boolean resultadoCima=campo.adicionarVizinho(vizinhoCima);
		boolean resultadoAbaixo=campo.adicionarVizinho(vizinhoAbaixo);
		
		assertTrue(resultadoEsquerda);
		assertTrue(resultadoDireita);
		assertTrue(resultadoCima);
		assertTrue(resultadoAbaixo);
	}
	
	@Test
	void TesteVizinhoDistancia2() {
		Campo vizinho= new Campo(2,2);
		
		
		boolean resultado=campo.adicionarVizinho(vizinho);
		
		assertTrue(resultado);
	}
	@Test
	void TesteNaoVizinhoDistancia2() {
		Campo vizinho= new Campo(1,1);
		
		
		boolean resultado=campo.adicionarVizinho(vizinho);
		
		assertFalse(resultado);
	}
	
	@Test
	void testeValorPadraoAtributoMarcado() {
		assertFalse(campo.isMarcado());
	}
	@Test
	void testeAlternaMarcacao() {
		
		campo.AlternarMarcacao();
		assertTrue(campo.isMarcado());
	}
	
	@Test
	void testeAlternaMarcacaoDuasChamadas() {
		
		campo.AlternarMarcacao();
		campo.AlternarMarcacao();
		assertFalse(campo.isMarcado());
	}
	
	@Test
	void testAbrirNaoMinadoNaoMarcado() {

		assertTrue(campo.abrir());
	}
	@Test
	void testAbrirNaoMinadoMarcado() {
		campo.AlternarMarcacao();
		assertFalse(campo.abrir());
	}
	@Test
	void testAbrirMinadoMarcado() {
		campo.AlternarMarcacao();
		campo.minar();
		assertFalse(campo.abrir());
	}
	@Test
	void testAbrirMinadoNaoMarcado() {
		campo.minar();
		
		assertThrows(ExplosaoException.class,()->{
			campo.abrir();
		});
	
	}
	
	@Test
	void testeAbrirComVizinhos1() {
		Campo campo11= new Campo(1,1);
		Campo campo22= new Campo(2,2);
		
		campo22.adicionarVizinho(campo11);
		campo.adicionarVizinho(campo22);
		
		campo.abrir();
		
		assertTrue(campo22.isAberto()&&campo11.isAberto());
		
		
	}
	@Test
	void testeAbrirComVizinhos2() {
		Campo campo11= new Campo(1,1);
		Campo campo12= new Campo(1,2);
		campo12.minar();
		
		
		Campo campo22= new Campo(2,2);
		
		campo22.adicionarVizinho(campo11);
		campo22.adicionarVizinho(campo12);
		campo.adicionarVizinho(campo22);
		
		campo.abrir();
		
		assertTrue(campo22.isAberto()&& !campo11.isAberto());
		
		
	}
	@Test
	void testeAbrirComVizinhosfechado() {
		Campo campo11= new Campo(1,1);
		Campo campo12= new Campo(1,2);
		campo12.minar();
		
		
		Campo campo22= new Campo(2,2);
		
		campo22.adicionarVizinho(campo11);
		campo22.adicionarVizinho(campo12);
		campo.adicionarVizinho(campo22);
		
		campo.abrir();
		
		assertTrue(campo22.isAberto()&& campo11.isFechado());
		
		
	}
	
	@Test
	void testeobjetivoconcluido1() {
		
		Campo campo11= new Campo(1,1);
		Campo campo12= new Campo(1,2);
		campo12.minar();
		
		
		Campo campo22= new Campo(2,2);
		
		campo22.adicionarVizinho(campo11);
		campo22.adicionarVizinho(campo12);
		campo.adicionarVizinho(campo22);
		campo12.AlternarMarcacao();
		
		campo.abrir();
		campo11.abrir();
		
		assertTrue(campo22.isAberto()&& campo11.isAberto()&&campo12.isMarcado());
		
	}
	
	/*void testeString() {
		Campo campo11= new Campo(1,1);
		Campo campo12= new Campo(1,2);
		Campo campo22= new Campo(2,2);
		campo12.minar();
		
		campo12.AlternarMarcacao();
		
		
		
		
	}*/
	


}
