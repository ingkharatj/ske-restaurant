import java.awt.MenuItem;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RestaurantManager {
	private String[] menuitems;
	private double[] Prices;

	public List<MenuandPrice> menuArrayList = new ArrayList<MenuandPrice>();

	public String[] getMenuItems() {
		return menuitems;
	}

	public double[] getPrices() {
		return Prices;
	}

	public static void recordOrder(int orderNumber, int[] order, double total) {

	}

	public void n(String fn) {
		String fm = fn;
		ClassLoader loader = RestaurantManager.class.getClassLoader();
		InputStream in = loader.getResourceAsStream(fm);
		if (in == null) {
			System.out.println("There is no file" + fm);
			return;
		}
		Scanner read = new Scanner(in);
		while (read.hasNextLine()) {
			String[] f = read.nextLine().split(";");
			menuArrayList.add(new MenuandPrice(f[0], Double.parseDouble(f[1])));
		}

		menuitems = new String[menuArrayList.size()];
		Prices = new double[menuArrayList.size()];
		for (int i = 0; i < menuArrayList.size(); i++) {
			menuitems[i] = menuArrayList.get(i).getName();
			Prices[i] = menuArrayList.get(i).getPrice();
		}
	}

}