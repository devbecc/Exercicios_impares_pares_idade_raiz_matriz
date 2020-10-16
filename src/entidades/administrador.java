package entidades;

public class administrador extends pessoa {

	 private int ajudaDeCusto;

	public administrador(String nome, String endereco, String telefone, int ajudaDeCusto) {
		super(nome, endereco, telefone);
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public int getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(int ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	
 
	
	
	
	
 
}