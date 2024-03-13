package OO.heranca.teste;

import OO.heranca.desafio.Carro;
import OO.heranca.desafio.Civic;
import OO.heranca.desafio.Ferrari;

public class Dirigir {
	
	public static void main(String[] args) {
		
		Ferrari ferrari= new Ferrari(400);
		ferrari.ligarTurbo();
		ferrari.velocidade=0;
		
		Carro civic= new Civic();
		civic.velocidade=0;
		
		
		System.out.println(ferrari);
		System.out.println(civic);
		
		
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();

		System.out.println(ferrari.velocidadeDoAr());

		civic.acelerar();
		
		System.out.println(ferrari);
		System.out.println(civic);
		
		ferrari.frear();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		
		civic.frear();
		
		System.out.println(ferrari);
		System.out.println(civic);
	}

}
