package lambdas;

public class CalculoTeste2 {
	
	public static void main(String[] args) {
		
		Calculo calc = (x,y)->{// essa � uma lambda function
			return x+y;
		};
		System.out.println(calc.executar(2, 3));
		calc = (x,y)->x*y;
		
		System.out.println(calc.executar(2, 3));
		
		System.out.println(calc.legal());
		System.out.println(Calculo.muitolegal());
		
	}

}
