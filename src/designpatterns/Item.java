package designpatterns;

public class Item {

	private String valor;
	private String nome;

	public Item(String nome, String valor) {
		this.nome = nome;
		this.valor = valor;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
