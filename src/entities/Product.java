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

	public static String staticUpperCaseName(Product p) { // M�todo static.
		return p.getName().toUpperCase();
	}
	
	// Como � um m�todo n�o static, n�o recebe objeto como par�metro, ele trata com o pr�prio objeto da classe.
	public String nonStaticUpperCaseName() { // M�todo non static.
		return name.toUpperCase();
	}
	
	@Override
	public String toString() {
		return name + ", " + String.format("%.2f", price);
	}
}