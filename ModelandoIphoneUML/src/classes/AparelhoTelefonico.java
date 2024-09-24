package classes;

public class AparelhoTelefonico implements Iphone {
	private String nomeContato;
	private int numeroContato;
	private String email;
	
	public String getNomeContato() {
		return nomeContato;
	}
	
	public void setNomeContato(String nomeContato) {
		this.nomeContato = nomeContato;
	}
	
	public int getNumeroContato() {
		return numeroContato;
	}
	
	public void setNumeroContato(int numeroContato) {
		this.numeroContato = numeroContato;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void encontrarContato(String nomeContato) {}
	
	public void adicionarAosFavoritos(String nomeContato) {}
	
	public void escreverMensagens(String nomeContato) {}
	
	public void fazerLigacao(int numeroContato) {}
	
	public void atenderLigacao(int numeroContato) {}
	
	public void colocarEmEspera(int numeroContato) {}
	
	public void discarNumero(int numeroContato) {}
	
	public void iniciarCorreioDeVoz(String email) {}
}
