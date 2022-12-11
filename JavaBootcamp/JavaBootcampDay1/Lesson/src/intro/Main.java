package intro;

public class Main {

	public static void main(String[] args) {

		System.out.println("Hello World!");

		// değişken isimleri camelCase şeklinde yazılır
		String ortaMetin = "İlgini Çekebilir";
		String altMetin = "Hakkımızda";

		System.out.println(ortaMetin);

		// sayi icin degiskenler

		int vade = 24;
		double dolarDun = 18.21;
		double dolarBugun = 18.11;

		boolean dolarDustuMu = false;

		String okYonu = "";

		if (dolarBugun < dolarDun) {

			okYonu = "down.svg";
			System.out.println(okYonu);

		}

		else if (dolarBugun == dolarDun) {

			System.out.println("Dolar yerinde sayıyor");
		}

		else {

			okYonu = "up.svg";
			System.out.println(okYonu);

		}

		// array

		String[] krediler = { "Emekli Kredisi", "Hoşgeldin Kredisi", "Hello Kredisi", "Anonim Kredisi" };

		for (int i = 0; i < krediler.length; i++) {

			System.out.println(krediler[i]);
		}

	}

}
