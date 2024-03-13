package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
	
	public static void main(String[] args) {
		Supplier<List<String>> umList=()->Arrays.asList("Ana","Bia","lia","gui");
		
		System.out.println(umList.get());
	}

}
