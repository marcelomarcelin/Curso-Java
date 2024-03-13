package OO.heranca.pratica;

public class jogo {
	
	public static void main(String[] args) {
		
		player Hero= new hero(10,10);
		
		player Monster=new monster(10,11);
		
		System.out.println(Hero.hp);
		System.out.println(Monster.hp);
		
		Hero.atacar(Monster);
		Monster.atacar(Hero);
		
		System.out.println(Hero.hp);
		System.out.println(Monster.hp);
	}

}
