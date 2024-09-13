package poo;

public class CompraTeste {
	public static void main(String[] args) {
		Compra compra1 = new Compra();
		
		compra1.adicionarItem("Caneta",20,7.45);
		compra1.itens.add(new Item("Borracha",3,1.25));
		compra1.adicionarItem(new Item("Caderno",3,12.00));
		
		System.out.println(compra1.itens.size());
		System.out.println(compra1.getValorTotal());
		
		
		// Só pra mostrar a relação bidirecional
		double total = compra1.itens.get(0).compra.itens.get(1).compra.getValorTotal();
		System.out.println(total);
	}
}
