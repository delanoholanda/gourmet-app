package jogoGourmet.swing;

public class No {
	
	
	private String texto;
	private No sim;
	private No nao;
	
	
	public No(String texto) {
		
		this.texto = texto;
	}
	
	public No(String texto, No sim) {
		
		this.texto = texto;
		this.sim = sim;
	}
	
	public No(String texto, No sim, No nao) {
		
		this.texto = texto;
		this.sim = sim;
		this.nao = nao;
	}
	public boolean simIsNull() {
		
		return this.sim == null;
		
	}
	
	public boolean naoIsNull() {
		
		return this.nao == null;
		
	}
		
	
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public No getSim() {
		return sim;
	}
	public void setSim(No sim) {
		this.sim = sim;
	}
	public No getNao() {
		return nao;
	}
	public void setNao(No nao) {
		this.nao = nao;
	}
	
	
	
	
	
	
	
	
	

}
