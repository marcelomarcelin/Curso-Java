package classe;

public class AreaCirc {
	double Raio;
	static final double PI=3.1415;
	
	AreaCirc(double RaioInicial){
		Raio=RaioInicial;
	}
	
	double Area(){
		return PI*Math.pow(Raio, 2);
	}

}
