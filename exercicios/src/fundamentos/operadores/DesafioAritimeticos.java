package fundamentos.operadores;
/**
 * 
 * @author Marcelo Marcelino
 *
 */
public class DesafioAritimeticos {
	
	public static void main(String[] args) {
		
		/*
		 * calculo a ser realizado ([6*(3+2)]elevado 2 /3*2-((1-5)*(2-7))elevado 2)3/10 elevado 3
		 */
		
		var num=3+2;
		var num2=3*2;
		var nu3=6;
		
		int primeiraparte=nu3*num;
		int segundaparte=(int)Math.pow(primeiraparte,2)/num2;
		
		var nu1=1-5;
		var nu2=2-7;
		int nu4=2;
		
		int calc=(nu1*nu2)/nu4;
		
		int res2=(int)Math.pow(calc,2);
		
		int resul=(int)Math.pow((segundaparte-res2),3);
		
		int a=10;
		int resultado=resul/((int)Math.pow(a, 3));
		System.out.println(resultado);
	}

}
