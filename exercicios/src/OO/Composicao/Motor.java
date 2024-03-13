package OO.Composicao;

public class Motor {
	boolean ligado=false;
	double fatordeInjecao=1;
	
	
	int giros()
	{
		if(!ligado) {
			return 0;
		}else
		
		return (int) Math.round(fatordeInjecao*3000);
	}
}
