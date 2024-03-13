package OO.encapsulamento.casaA;

public class Paulo {
	void TesteAcessos() {
		Ana esposa=new Ana();
		
		System.out.println(esposa.facoDentroDeCasa);
		//System.out.println(esposa.segredo);// esse é o unico que não é possivel acessar devido ele ser privado
		System.out.println(esposa.todosSabem);
		System.out.println(esposa.formaDeFalar);
	}

}
