package Controle;

import java.util.Scanner;

public class DesafioWhile {
	
	public static void main(String[] args) {
		//calcular a média de uma turma;
		// armazenar o total de notas digitadas e o total de notas validas
		//quando ele digitar -1 ele sai e calcula a media 
		
		int notasdigitadas=0;
		int notasdigitadasvalidas=0;
		double total=0.0;
		double nota;
		
		Scanner entrada=new Scanner(System.in);
		
		
		do {
			System.out.println("Digite a nota do aluno:");
			nota=entrada.nextDouble();
			if(nota<=10&&nota>-1){
				
			total+=nota;
			notasdigitadasvalidas++;
			}else if(nota!=-1) {
				System.out.println("Nota invalida, digite uma nota valida");
			}
			notasdigitadas++;
		}while(nota!=-1);
		
		double media=total/notasdigitadasvalidas;
			
		
		System.out.printf("A quantidade de notas digitadas foi: %d, validas %d, sendo a média da turma: %.2f",notasdigitadas,notasdigitadasvalidas,media);
			
			entrada.close();
	}

}
