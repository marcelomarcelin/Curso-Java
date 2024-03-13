package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class DesafioMap {
	
	public static void main(String[] args) {
		
		
		
		List<Integer> nums =Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		
		Function<String, String> reverse = s -> new StringBuilder(s). reverse(). toString();
		
		nums.stream().map(n-> Integer.toBinaryString(n))
		.map(reverse)
		.map(n->Integer.parseInt(n,2))
		.forEach(System.out::println);
		
	}

}
