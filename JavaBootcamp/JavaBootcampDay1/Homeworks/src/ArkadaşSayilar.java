
public class ArkadaşSayilar {

	public static void main(String[] args) {

		// Arkadaş sayi = Bir sayının bölenlerinin toplamının diğer sayıya eşit
		// olmasıdır

		int a = 220;
		int b = 284;
		int totalA = 0;
		int totalB = 0;

		for (int i = 1; i < a; i++) {

			if (a % i == 0) { 			// a i ye tam bölünüyorsa

				totalA = totalA + i; 	// toplama her seferinde bölen kadar ekle	

			}

		}

		for (int i = 1; i < b; i++) {

			if (b % i == 0) {

				totalB = totalB + i;

			}

		}

		if (a == totalB && b == totalA) {

			System.out.println("Bu iki sayo arkadaştır.");

		} else {

			System.out.println("Bu iki sayı arkadaş değildir. ");

		}

	}

}
