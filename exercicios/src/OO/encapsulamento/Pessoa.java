package OO.encapsulamento;

public class Pessoa {
	
	private int idade;
	private String nome;
	private String sobrenome;
	
	public Pessoa(int idade, String nome,String sobrenome) {
		setIdade(idade);
		setNome(nome);
		setSobrenome(sobrenome);
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	//Getter
	public int getIdade() {
		return idade;
	}
	
	public String getnomeCompleto() {
		return getNome()+" "+getSobrenome();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	//Setter
	public void setIdade(int idade) {
		idade=Math.abs(idade);
		
		if(idade>=0&&idade<120) {
		this.idade=idade;
		}
	}
	
	public String toString() {
		return "Ola eu sou " +getnomeCompleto()+" e tenho "+getIdade()+" anos.";
	}

}
