package lambdas;

public class Threads {
	
	public static void main(String[] args) {
		Runnable Trabalho1=new Trabalho1(); 
		Runnable Trabalho2=new Runnable() {

			
			public void run() {
				for(int i=0; i<100;i++){
					System.out.println("Tarefa #02");
					try {
						
						Thread.sleep(100);
					}catch(Exception e){
						
					}
				}
				
			}
			
		};
		
		Runnable trabalho3= ()->{
			for(int i=0; i<100;i++){
				System.out.println("Tarefa #03");
				try {
					
					Thread.sleep(100);
				}catch(Exception e){
					
				}
			}
			
		};
		
		Thread t1=new Thread(Trabalho1);
		Thread t2=new Thread(Trabalho2);
		Thread t3=new Thread(trabalho3);
		
		t1.start();
		t2.start();
		t3.start();
	}
	
	

}
