
public class ShoppingCart {

	/*
	 * Actions 
	 */
	float total;
	boolean finish;
	Customer customer;
	Product[] products;
	int cartSize;
	
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
			total += product.price;
		}
		
	}
	
	public void removeProduct(int id){
		
		if(finish)
			return;
		
		for (int i = 0; i < products.length; i++) {
			if(products[i].id == id){
				total -= products[i].price;
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
				System.out.println(products[i].id);
		}
	}
	
}
