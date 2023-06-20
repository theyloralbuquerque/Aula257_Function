package entities;

public class Product {

	private String name;
	private Double price;

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public static String staticUpperCaseName(Product p) { // Método static.
		return p.getName().toUpperCase();
	}
	
	// Como é um método não static, não recebe objeto como parâmetro, ele trata com o próprio objeto da classe.
	public String nonStaticUpperCaseName() { // Método non static.
		return name.toUpperCase();
	}
	
	@Override
	public String toString() {
		return name + ", " + String.format("%.2f", price);
	}
}