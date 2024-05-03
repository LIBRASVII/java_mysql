package pecas_bd;

public class Pecas {
	private int id;
	private String nome;
	private int qtd;
	
	public int getCod() {
		return id;
	}
	
	public void setCod(int id) {
		//return pecas;
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
		//return pecas;
	}
	
	public int getQtd() {
		return qtd;
	}
	
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
}
