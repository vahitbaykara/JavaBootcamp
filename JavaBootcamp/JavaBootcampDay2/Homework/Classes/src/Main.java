
public class Main {

	public static void main(String[] args) {

		CustomerMenager customerMenager = new CustomerMenager();
		CustomerMenager customerMenager2 = new CustomerMenager();
		customerMenager = customerMenager2;

		// referans type
		customerMenager.add();
		customerMenager.remove();
		customerMenager.uppdate();

		// value
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 40;

		System.out.println(sayi2);

		int[] number1 = { 1, 2, 3 };
		int[] number2 = { 4, 5, 6 };

		number2 = number1;
		number2[0] = 10;

		System.out.println(number2[0]);

	}

}
