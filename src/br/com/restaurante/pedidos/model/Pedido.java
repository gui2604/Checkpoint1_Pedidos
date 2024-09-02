package br.com.restaurante.pedidos.model;

import java.util.ArrayList;
import java.util.List;

import br.com.restaurante.pedidos.exceptions.PedidoException;

public class Pedido {
	private int id;
	private String descricao;
	private double valorTotal;
	private boolean pago;
	private List<Item> itens = new ArrayList<>();

	public Pedido() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pedido(int id) {
		super();
		this.id = id;
	}

	public Pedido(int id, String descricao, double valorTotal, boolean pago, List<Item> itens) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.valorTotal = valorTotal;
		this.pago = pago;
		this.itens = itens;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public boolean isPago() {
		return pago;
	}

	public void setPago(boolean pago) {
		this.pago = pago;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

	public void adicionarItem(Item item) {
		itens.add(item);
	}

	public void pagar() throws PedidoException {
		if (pago) {
			throw new PedidoException("O pedido já está pago.");
		}
		this.pago = true;
	}
	
	public void somarValor(List<Item> itens) throws PedidoException{
		double valorTotal = 0;
		for (Item item: itens) {
			valorTotal += (item.getPrecoUnitario() * item.getQuantidade() );
		}
		if (valorTotal == 0) {
			throw new PedidoException("Não é possível fechar uma conta que totalize zero reais.");
		}
	}

	@Override
	public String toString() {
		return "Pedido [id=" + this.id + ", descricao=" + this.descricao + ", valorTotal=" + this.valorTotal + ", pago=" + this.pago
				+ ", itens=" + this.itens.toString() + "]";
	}

}
