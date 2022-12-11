
public class SwitchDemo {

	public static void main(String[] args) {

		char grade = 'A';

		switch (grade) {

		case 'A':
			System.out.println("Mükemmel: Geçtiniz");
			break;
		case 'B':
			System.out.println("Çok iyi: Geçtiniz");
			break;
		case 'C':
			System.out.println("İdare eder: Geçtiniz");
			break;
		case 'D':
			System.out.println("Sorumlu: Geçtiniz");
			break;
		case 'F':
			System.out.println("Çok kötü: kaldınız");
			break;

		default:
			System.out.println("Geçersiz not");

		}

	}

}
