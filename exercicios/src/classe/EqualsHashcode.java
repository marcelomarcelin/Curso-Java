package classe;

public class EqualsHashcode {
	public static void main(String[] args) {
		Usuario u1=new Usuario();
		u1.nome="Pedro";
		u1.email="pedro.email@hotmail.com";
		
		Usuario u2=new Usuario();
		u2.nome="Pedro";
		u2.email="pedro.email@hotmail.com";
		
		System.out.println(u1==u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		System.out.println();
		System.out.println();
	}

}
