
public class Store {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.name = "Sérgio";
		
		Product p1 = new Product();
		p1.id = 1; p1.name = "batatas"; p1.price = 1.0f;
		
		Product p2 = new Product();
		p2.id = 2; p2.name = "couves"; p2.price = 2.3f;
		
		Product p3 = new Product();
		p3.id = 3; p3.name = "cenouras"; p3.price = 1.5f;
		
		Product p4 = new Product();
		p4.id = 4; p4.name = "tomates"; p4.price = 1.1f;
		
		Product p5 = new Product();
		p5.id = 5; p5.name = "bananas"; p5.price = 0.7f;
		
		ShoppingCart shoppingCart = new ShoppingCart();
		shoppingCart.customer = customer;
		shoppingCart.products = new Product[10];
		
		shoppingCart.addProduct(p5);
		shoppingCart.addProduct(p1);
		shoppingCart.addProduct(p2);
		
		System.out.println("Total: " + shoppingCart.total);
		System.out.println("Tamanho: " + shoppingCart.products.length);
		System.out.println("Nome: " + customer.name);
		
		shoppingCart.printProduct();
	}

}
