
public class Store {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.setName("Sérgio");
		
		Product p1 = new Product();
		p1.setId(1); p1.setName("batatas"); p1.setPrice(1.0f);
		
		Product p2 = new Product();
		p2.setId(2); p2.setName("couves"); p2.setPrice(2.3f);
		
		Product p3 = new Product();
		p3.setId(3); p3.setName("cenouras"); p3.setPrice(1.5f);
		
		Product p4 = new Product();
		p4.setId(4); p4.setName("tomates"); p4.setPrice(1.1f);
		
		Product p5 = new Product();
		p5.setId(5); p5.setName("bananas"); p5.setPrice(0.7f);
		
		ShoppingCart shoppingCart = new ShoppingCart();
		shoppingCart.setCustomer(customer);
		shoppingCart.setProducts(10);
		
		shoppingCart.addProduct(p5);
		shoppingCart.addProduct(p1);
		shoppingCart.addProduct(p2);
		
		System.out.println("Total: " + shoppingCart.getTotal());
		System.out.println("Tamanho: " + shoppingCart.getProducts().length);
		System.out.println("Nome: " + customer.getName());
		
		shoppingCart.printProduct();
	}

}
