package OO.heranca.pratica;

public class hero extends player {
	
	hero(int x, int y){
		super(x,y);
	}
	
	
	boolean atacar(player oponente) {
		boolean ataque=super.atacar(oponente) ;
		boolean ataque2=super.atacar(oponente) ;
		
		return ataque||ataque2;
	}

}
