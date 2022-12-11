
public class Main {

	public static void main (String[] args) {

		sayiBulmaca();

	}

	public static void sayiBulmaca() {

		int[] numbers = { 1, 2, 3, 4, 5, 6, };

		int number = 6;

		boolean varMı = false;

		for (int i : numbers) {

			if (i == number) {

				varMı = true;
				break;
			}

		}
		
		
		String mesaj ="";
		if (varMı) {
			
			mesaj ="Sayi Mevcuttur: " + number;
			mesajVer (mesaj);
		} else {

			mesaj ="Sayi Mevcut Değildir: " + number;
			mesajVer (mesaj);

		}

	}
	
	public static void mesajVer(String mesaj) {
		
		
		System.out.println(mesaj);
		
		
	}
	
}