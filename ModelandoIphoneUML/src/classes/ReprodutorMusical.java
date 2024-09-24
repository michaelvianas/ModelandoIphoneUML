package classes;

public class ReprodutorMusical implements Iphone {
	private String musica;
	private String album;
	private String conteudo;
	private String video;
	
	public String getMusica() {
		return musica;
	}
	
	public void setMusica(String musica) {
		this.musica = musica;
	}
	
	public String getAlbum() {
		return album;
	}
	
	public void setAlbum(String album) {
		this.album = album;
	}
	
	public String getConteudo() {
		return conteudo;
	}
	
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	
	public String getVideo() {
		return video;
	}
	
	public void setVideo(String video) {
		this.video = video;
	}
	
	public void escolherMusica(String musica) {}
	
	public void escolherAlbum(String album) {}
	
	public void tocarMusica(String musica) {}
	
	public void pausar(String conteudo) {}
	
	public void reproduzirVideos(String video) {}
}
