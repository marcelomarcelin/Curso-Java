package OO.encapsulamento.casaB;

import OO.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
	
	
	
	void testeDeAcesso() {
		//System.out.println(mae.facoDentroDeCasa);// não é acessado devido não estar no mesmo pacote
		//System.out.println(mae.segredo);// esse é o unico que não é possivel acessar devido ele ser privado
		System.out.println(todosSabem);
		System.out.println(formaDeFalar);
	}

}
