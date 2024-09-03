package br.com.restaurante.pedidos.testes;

import br.com.restaurante.pedidos.exceptions.PedidoException;
import br.com.restaurante.pedidos.model.Pedido;

public class TestePedidoNulo {

	public static void main(String[] args) {
		try {
			// Criando um pedido
			Pedido pedido1 = new Pedido(1);

			// soma o valor total dos itens adicionados
			pedido1.somarValor(pedido1.getItens());
			// Pagando o pedido
			pedido1.pagar();
			System.out.println("Pedido pago: " + pedido1.toString());
		} catch (PedidoException e) {
			System.err.println("Erro: " + e.getMessage());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
