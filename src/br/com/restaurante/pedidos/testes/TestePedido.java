package br.com.restaurante.pedidos.testes;

import br.com.restaurante.pedidos.exceptions.PedidoException;
import br.com.restaurante.pedidos.model.Item;
import br.com.restaurante.pedidos.model.Pedido;

public class TestePedido {

	public static void main(String[] args) {
		try {
			// Criando um pedido
			Pedido pedido1 = new Pedido(1);

			// Criando itens e adicionando ao pedido
			Item item1 = new Item("Pizza Margherita", 2, 15.00);
			Item item2 = new Item("Refrigerante", 1, 5.00);
			pedido1.adicionarItem(item1);
			pedido1.adicionarItem(item2);

			// soma o valor total dos itens adicionados
			pedido1.somarValor(pedido1.getItens());
			// Pagando o pedido
			pedido1.pagar();
			System.out.println("Pedido pago: " + pedido1.toString());

			// Tentativa de pagar novamente para disparar a exceção
			pedido1.pagar();
		} catch (PedidoException e) {
			System.err.println("Erro: " + e.getMessage());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
