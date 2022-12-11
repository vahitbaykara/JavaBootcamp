package classesWithAttiribites;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product product = new Product(1, "Excalibur Laptop" , "Laptop", "blue", "blue", 5000, 3);

		product.setId(1); 
		product.setName("Laptop");
		product.setPrice(3000);
		product.setStockAnount(2); 
		product.setDiscription("Excalibur laptop");
		// product.setCode("beş"); set komutunu sildiğim için Coda herhangi bir değer atayamıyorum.
		product.setColor("Blue");

		ProductMenager productMenger = new ProductMenager();
		productMenger.Add(product);
		
		System.out.println(product.getCode());

	}

}
