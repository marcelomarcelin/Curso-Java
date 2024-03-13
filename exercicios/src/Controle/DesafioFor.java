package Controle;

public class DesafioFor {
	public static void main(String[] args) {
		String valor="#";
		int a=1;
		int b=5;
		
		
		for (int i=a;i<=b;i++) {
			System.out.println(valor);
			valor+='#';
		}
		
		for (String v="#";!v.equals("######");v+="#") {
			System.out.println(v);
		}
	}

}
