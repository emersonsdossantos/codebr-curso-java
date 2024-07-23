package oo.composicao.desafiotreino;

public class Sistema {

	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Camisa", 100, 10);
		compra1.adicionarItem(new Produto("Calça", 150), 5);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Tenis", 500, 1);
		compra2.adicionarItem(new Produto("shorts", 50), 7);
		
		Cliente cliente = new Cliente("Calleri");
		cliente.compras.add(compra1);
		cliente.adicionarCompra(compra2);
		
		System.out.println(cliente.getValortotalCompra());
	}

}
