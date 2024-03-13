package OO.encapsulamento.casaB;

import OO.encapsulamento.casaA.Ana;

public class Julia {
	
	
	void TesteAcessos() {
	Ana sogra=new Ana();
	
	//System.out.println(sogra.facoDentroDeCasa);// Não é possivel acessar devido não estar no mesmo pacote
	//System.out.println(sogra.segredo);// esse é o unico que não é possivel acessar devido ele ser privado
	System.out.println(sogra.todosSabem);
	//System.out.println(sogra.formaDeFalar);// ela não herda nada de Ana
	}

}
