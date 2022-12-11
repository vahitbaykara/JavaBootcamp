package classesWithAttiribites;

public class Product {

	
	// overloading aşırı yükleme
	public Product(int id, String discription, String name, String code, String color, int price, int stokAnount) {

		System.out.println("yapıcı blok çalıştı");
		this.code = code;
		this.color = color;
		this.discription = discription;
		this.id = id;
		this.name = name;
		this.price = price;
		this.stockAnount = stockAnount;

	}

	private int id;
	private String discription;
	private String name;
	private int stockAnount;
	private int price;
	private String code;
	private String color;

	// get getirmek // set kadetmek veriyi girmek

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStockAnount() {
		return stockAnount;
	}

	public void setStockAnount(int stockAnount) {
		this.stockAnount = stockAnount;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCode() {
		return this.name.substring(0, 1) + id;
	}

	// public void setCode(String code) {
	// this.code = code;
	// }

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
