package classes;

public class NavegadorInternet implements Iphone {
	private String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	public void exibirPagina(String url) {}
	
	public void adicionarNovaAba() {}
	
	public void atualizarPagina(String url) {}
}
