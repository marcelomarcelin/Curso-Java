package OO.encapsulamento.casaB;

import OO.encapsulamento.casaA.Ana;

public class Julia {
	
	
	void TesteAcessos() {
	Ana sogra=new Ana();
	
	//System.out.println(sogra.facoDentroDeCasa);// N�o � possivel acessar devido n�o estar no mesmo pacote
	//System.out.println(sogra.segredo);// esse � o unico que n�o � possivel acessar devido ele ser privado
	System.out.println(sogra.todosSabem);
	//System.out.println(sogra.formaDeFalar);// ela n�o herda nada de Ana
	}

}
