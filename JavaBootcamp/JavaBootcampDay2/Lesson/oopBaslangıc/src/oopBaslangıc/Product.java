package oopBaslangıc;

public class Product {

	private String name;
	private int unıtInStock;
	private double discount;
	private double unıtPrice;
	private String imageUrl;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUnıtInStock() {
		return unıtInStock;
	}

	public void setUnıtInStock(int unıtInStock) {
		this.unıtInStock = unıtInStock;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getUnıtPrice() {
		return unıtPrice;
	}

	public void setUnıtPrice(double unıtPrice) {
		this.unıtPrice = unıtPrice;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

}
