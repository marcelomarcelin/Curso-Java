package padroes.observer;

public class AniversarioSurpresa {
	
	public static void main(String[] args) {
		Namorada namorada=new Namorada();
		Porteiro porteiro= new Porteiro();
		
		
		//Registra a namorada como interessada no evento
		porteiro.registrarObservador(namorada);
		
		porteiro.registrarObservador(e->{
			System.out.println("Surpresa via lambda!");
			System.out.println("ocorreu em "+e.getMomento());
		});
		porteiro.monitorar();
	}

}
