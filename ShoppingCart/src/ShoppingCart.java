
public class ShoppingCart {

	/*
	 * Actions 
	 */
	private float total;
	private boolean finish;
	private Customer customer;
	private Product[] products;
	private int cartSize;
	
	/*
	 * 
	 */
	
	public void addProduct(Product product){
		
//		for (int i = 0; i < products.length; i++) {
//			if(products[i] == null){
//				products[i] = product;
//				total += product.price;
//				break;
//			}
//		}
		
		if(finish)
			return;
		
		if(cartSize<products.length){
			products[cartSize++] = product;
			total += product.getPrice();
		}
		
	}
	
	public void removeProduct(int id){
		
		if(finish)
			return;
		
		for (int i = 0; i < products.length; i++) {
			if(products[i].getId() == id){
				total -= products[i].getPrice();
				products[i] = products[--cartSize];
				products[cartSize] = null;
				break;
			}
		}
		
	}
	
	public void finish(){
		finish = true;
	}
	
	public boolean isFinished(){
		return finish;
	}
	
	public void printProduct(){
		
		for (int i = 0; i < products.length; i++) {
			if(products[i] != null)
				System.out.println(products[i].getId());
		}
	}
	
	public float getTotal(){
		return total;
	}
	
	public void setProducts(int size){
		if(products==null)
			products = new Product[size];
	}
	
	public Product[] getProducts(){
		return products;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
