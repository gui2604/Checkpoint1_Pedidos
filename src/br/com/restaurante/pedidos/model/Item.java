package br.com.restaurante.pedidos.model;

public class Item {
	private String nome;
	private int quantidade;
	private double precoUnitario;

	
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Item(String nome, int quantidade, double precoUnitario) {
		super();
		this.nome = nome;
		this.quantidade = quantidade;
		this.precoUnitario = precoUnitario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	@Override
	public String toString() {
		return "Item [nome=" + this.nome + ", quantidade=" + this.quantidade + ", precoUnitario=" + this.precoUnitario + "]";
	}
	
	
}
