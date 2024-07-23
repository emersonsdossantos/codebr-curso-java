package oo.composicao.desafiotreino;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	List<Item> itens = new ArrayList<Item>();
	
	void adicionarItem(Produto produto, int quantidade) {
		itens.add(new Item(produto, quantidade));
	}
	
	void adicionarItem(String nome, double preco, int quantidade) {
		var produto = new Produto(nome, preco);		
		itens.add(new Item(produto, quantidade));
	}
	
	
	double getValorTotalItem() {
		double total = 0;
		for (Item item : itens) {
			total += item.quantidade * item.produto.preco;
		}
		return total;
	}
}
