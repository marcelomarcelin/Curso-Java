package OO.heranca.pratica;

public class player {
	int x;
	int y;
	int hp=200;
	
	player(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	
	boolean atacar(player oponente) {
		
		int deltaX= Math.abs(x-oponente.x);
		int deltaY= Math.abs(y-oponente.y);
		
		if(deltaX==0 && deltaY==1) {
			oponente.hp-=10;
			return true;
		}else if(deltaX==1&&deltaY==0) {
			oponente.hp-=10;
			return true;
		}else
		
		return false;
	}
	
	

}
