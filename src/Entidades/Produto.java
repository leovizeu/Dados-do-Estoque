package Entidades;

public class Produto {

	public String nome;
	public double preco;
	public int quantidade;
	
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public double valorTotalEstoque() {
		return preco * quantidade;
	}
	
	public void addProduto (int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removerProduto (int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		return nome
				+ ", R$ "
				+ String.format("%.2f", preco)
				+ ", "
				+ quantidade
				+ " unidades, Valor Total: R$"
				+ String.format("%.2f", valorTotalEstoque());
	}
}
