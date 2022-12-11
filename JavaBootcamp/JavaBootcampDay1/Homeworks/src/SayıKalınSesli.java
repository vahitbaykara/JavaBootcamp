
public class SayıKalınSesli {

	public static void main(String[] args) {

		char harf = '3';

		switch (harf) {
		case 'A':
		case 'O':
		case 'I':
		case 'U':

			System.out.println("Kalın harf Girdiniz");

			break;

		case 'E':
		case 'İ':
		case 'Ö':
		case 'Ü':

			System.out.println("İnce harf girdiniz");

			break;

		default:
			
			System.out.println("Lütfen Sesli Bir Harf Giriniz.");
			break;
		}

	}
}
