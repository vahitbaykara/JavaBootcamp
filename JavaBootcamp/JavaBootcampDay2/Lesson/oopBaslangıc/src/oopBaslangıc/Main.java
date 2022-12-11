package oopBaslangıc;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product();

		product1.setImageUrl("resim.jpg");
		product1.setDiscount(7);
		product1.setName("Delongi Kahve Makinesi");
		product1.setUnıtInStock(4);
		product1.setUnıtPrice(10000);

		Product product2 = new Product();

		product2.setImageUrl("kahve.jpg");
		product2.setDiscount(12);
		product2.setName("Tefal Kahve Makinesi");
		product2.setUnıtInStock(1);
		product2.setUnıtPrice(5000);

		Product product3 = new Product();

		product3.setImageUrl("image.jpg");
		product3.setDiscount(3);
		product3.setName("Fakir Kahve Makinesi");
		product3.setUnıtInStock(10);
		product3.setUnıtPrice(12000);

		Product[] products = { product1, product2, product3 };

		for (Product product : products) {

			System.out.println(product.getDiscount());

		}

		Indivijual indivijual = new Indivijual();

		indivijual.setId(1);
		indivijual.setCustomerNumber("123456123");
		indivijual.setPhone("8237232");
		indivijual.setFirstName("Muhammed Vahit");
		indivijual.setLastName("Baykara");

		Corporate corporate = new Corporate();

		corporate.setCustomerNumber("213123123");
		corporate.setId(2);
		corporate.setPhone("13123131");
		corporate.setCompanyName("MVB LTD STİ");
		corporate.setTextNumber("123213123");
		
		
		Customer[] customers = {corporate,indivijual};		
	
		for (Customer customer : customers) {
			
			System.out.println(customer.getPhone());
			
		}
	
	
	
	
	
	
	
	}

}
