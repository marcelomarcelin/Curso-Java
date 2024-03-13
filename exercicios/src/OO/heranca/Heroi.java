package OO.heranca;

public class Heroi extends Jogador {
	
	public Heroi(int x, int y){
		super(x,y);
	}
	
	public boolean Atacar (Jogador oponente) {
		boolean ataque1=super.Atacar(oponente);
		boolean ataque2=super.Atacar(oponente);
		boolean ataque3=super.Atacar(oponente);
		
		
		return ataque1||ataque2||ataque3;
	}

}
