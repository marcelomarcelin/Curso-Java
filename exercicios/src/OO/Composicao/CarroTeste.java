package OO.Composicao;

public class CarroTeste {
	
	
	public static void main(String[] args) {
		carro c1= new carro();
		
		c1.ligar();
		System.out.println(c1.estaLigado());
		
		System.out.println(c1.motor.giros());
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		
		System.out.println(c1.motor.giros());
		
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		
		//Faltou encapsukamento
		
		
		
		System.out.println(c1.motor.giros());
		
	}

}
