package OO.Composicao;

public class carro {
	Motor motor= new Motor();
	
	
	void acelerar() {
		motor.fatordeInjecao+=0.4;
	}
	
	void frear() {
		if(motor.fatordeInjecao>0.5) {
			
			motor.fatordeInjecao-=0.4;
		}
	}
	
	void ligar() {
		motor.ligado=true;
	}
	
	void desligar() {
		motor.ligado=false;
		
	}
	
	boolean estaLigado() {
		return motor.ligado;
	}

}
