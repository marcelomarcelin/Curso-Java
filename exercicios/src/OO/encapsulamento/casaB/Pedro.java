package OO.encapsulamento.casaB;

import OO.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
	
	
	
	void testeDeAcesso() {
		//System.out.println(mae.facoDentroDeCasa);// n�o � acessado devido n�o estar no mesmo pacote
		//System.out.println(mae.segredo);// esse � o unico que n�o � possivel acessar devido ele ser privado
		System.out.println(todosSabem);
		System.out.println(formaDeFalar);
	}

}
