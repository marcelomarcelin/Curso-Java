package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ExercicioForeach {
	public static void main(String[] args) {
Scanner entrada =new Scanner(System.in);
		
		double[] notasdoAlunoA=new double[3];
		
		double totalAlunoA=0;
		for(int i=0;i<notasdoAlunoA.length;i++) {
			System.out.println("Informe as notas do aluno");
			
			
			notasdoAlunoA[i]=entrada.nextDouble();
			totalAlunoA+=notasdoAlunoA[i];
			
			
		}
		for(double nnotasdoAlunoA:notasdoAlunoA) {
			System.out.println(nnotasdoAlunoA);
		}
		
		System.out.println(Arrays.toString(notasdoAlunoA));
		System.out.println("O total de média é:/n");
		System.out.println(totalAlunoA/notasdoAlunoA.length);
		entrada.close();
	}

}
