
import java.util.Scanner;

public class main {
	static Scanner sc = new Scanner(System.in);
	static RestaurantManager ma = new RestaurantManager();

	static int[] x;
	static String[] menuitems;
	static double[] price;
	static int[] c = { 0, 0, 0, 0 };
	static int[] food = { 250, 120, 45, 100 };

	public static void X() {
		menuitems = ma.getMenuItems();
		x = new int[menuitems.length];
	}

	public static void setPrice() {
		price = ma.getPrices();
	}

	static void menu() {
		int a = 1;
		System.out.println("--------- Welcome to SKE by Ing Restaurant ---------");
		for (int i = 0; i < c.length; i++) {
			System.out.printf("%d) %s\t\t %5d Bath.\n", a, menuitems[i], price[i]);
			a = a + 1;

		}

		System.out.printf("5.) Total\n");
		System.out.printf("6.) Exit\n");
		System.out.println();

	}

	public static void main(String[] args) {
		ma.n("menu.txt");
		menu();
		int pr1 = food[0] * c[0];
		int pr2 = food[1] * c[1];
		int pr3 = food[2] * c[2];
		int pr4 = food[3] * c[3];
		while (true) {
			System.out.print("Enter your Choice: ");
			int ch = sc.nextInt();
			if (ch == 6) {
				System.out.print("Thank you Bye Bye :D");
				break;
			} else if (ch == 5) {
				System.out.println("+------ Menu ------+---- Qty ------+------ Price --------+");
				if (c[0] > 0) {
					pr1 = food[0] * c[0];
					System.out.printf("| Pizza\t\t   | \t %7d   | \t%7d \t |\n", c[0], pr1);
					System.out.println("+------------------+---------------+---------------------+");
				}
				if (c[1] > 0) {
					pr2 = food[1] * c[1];
					System.out.printf("| Chickens\t   | \t %7d   | \t%7d \t |\n", c[1], pr2);
					System.out.println("+------------------+---------------+---------------------+");

				}
				if (c[2] > 0) {
					pr3 = food[2] * c[2];
					System.out.printf("| Coke\t\t   | \t %7d   | \t%7d \t |\n", c[2], pr3);
					System.out.println("+------------------+---------------+---------------------+");

				}
				if (c[3] > 0) {
					pr4 = food[3] * c[3];
					System.out.printf("| Sandwich\t   | \t %7d   | \t%7d \t |\n", c[3], pr4);
					System.out.println("+------------------+---------------+---------------------+");

				}
				int all = pr1 + pr2 + pr3 + pr4;
				System.out.printf("| total\t\t   | \t\t   | \t%7d \t |\n", all);
				System.out.println("+------------------+---------------+---------------------+");
			} else {
				System.out.print("Enter Quantity: ");
				int qu = sc.nextInt();
				if (ch == 1) {

					c[0] = c[0] + qu;
				} else if (ch == 2) {
					c[1] = c[1] + qu;
				} else if (ch == 3) {
					c[2] = c[2] + qu;
				} else if (ch == 4) {
					c[3] = c[3] + qu;

				}
			}
		}
	}
}