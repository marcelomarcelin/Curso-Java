package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CalculoDeNotas {
	
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Digite a quantidade de notas do aluno:");
		int quantidade=entrada.nextInt();
		
		double array[]=new double[quantidade];
		
		for (int i=0;i<array.length;i++) {// obtem e armazena os dados dentro do array 
		System.out.println("Digite a nota do aluno:"+(i+1)+"º");
		array[i]=entrada.nextDouble();
		
		}
		
		double nota=0;
		for(double calc:array) {// percorre todo o array somando os valores das notas informados.
			nota+=calc;
		}
		
		System.out.println("As notas digitadas foram:" + Arrays.toString(array));
		double media= nota/quantidade;
		System.out.println("A média do aluno foi:" + media);
		
		entrada.close();
	}

}
