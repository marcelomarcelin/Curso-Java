package generics;

import java.util.List;

public class ListaUtil {
	
	public static Object getUltimo(List<?>Lista) {
		
		return Lista.get(Lista.size()-1);
		
	}
	public static <T> T getUltimo2(List<T>Lista) {
		
		return Lista.get(Lista.size()-1);
		
	}

}
