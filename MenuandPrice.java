
public class MenuandPrice {
	private double price;
	private String menuitems;

	public MenuandPrice(String n, double p) {
		this.menuitems = n;
		this.price = p;
	}

	public String getName() {
		return menuitems;
	}

	public void setName(String namef) {
		this.menuitems = namef;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double pricef) {
		this.price = pricef;
	}
}