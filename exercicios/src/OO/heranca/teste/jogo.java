package OO.heranca.teste;

import OO.heranca.Direcao;
import OO.heranca.Heroi;
import OO.heranca.Jogador;
import OO.heranca.Monstro;

public class jogo {
	
	public static void main(String[] args) {
		Jogador monstro= new Monstro(10,10);
		
		/*monstro.x=10;
		monstro.y=10;
		/*j1.andar(Direcao.NORTE);
		j1.andar(Direcao.LESTE);
		j1.andar(Direcao.NORTE);
		j1.andar(Direcao.LESTE);*/

		Jogador heroi= new Heroi(10,11);
		
		
		/*heroi.x=10;
		heroi.y=11;*/
		
		System.out.println(monstro.x);
		System.out.println(monstro.y);

		System.out.println("O monstro tem==> "+monstro.vida);
		System.out.println("O heroi tem==> "+heroi.vida);

		
		monstro.Atacar(heroi);
		heroi.Atacar(monstro);
		
		monstro.Atacar(heroi);
		heroi.Atacar(monstro);
		

		monstro.andar(Direcao.NORTE);
		monstro.Atacar(heroi);
		heroi.Atacar(monstro);
		
		System.out.println("O monstro tem==> "+monstro.vida);
		System.out.println("O heroi tem==> "+heroi.vida);
	}

}
