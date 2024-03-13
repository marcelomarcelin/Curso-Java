package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {
	Scanner entrada=new Scanner(System.in);
	
		
	
	
		System.out.println("Digite a quantidade de alunos");
		int alunos= entrada.nextInt();
		
	
		System.out.println("Digite a quantidade de notas do aluno:");
		int quantidade=entrada.nextInt();
		double total=0;
		double[][] array=new double[alunos][quantidade];
		double cont=0;

		for(int a=0;a<array.length;a++) {
		for (int n=0;n<array[a].length;n++) {// obtem e armazena os dados dentro do array 
		System.out.println("Digite a "+(n+1)+"º nota do "+(a+1)+ "º aluno");
		array[a][n]=entrada.nextDouble();
		total+=array[a][n];
		cont+=array[a][n];
		
		}
		double num=cont;
		double media=num/quantidade;
		System.out.println("A media do "+(a+1)+"º Aluno é "+media);
		cont=0;
		}//Aqui é o fechamento do j
		
		for(double[] impressao:array) {// percorre todo o array somando os valores das notas informados.
		
			System.out.println("As notas digitadas foram:" + Arrays.toString(impressao));
		}
		
		double mediaturma=total/(quantidade*alunos);
		System.out.println("Média da turma é "+ mediaturma);
		
		entrada.close();
	}

}
