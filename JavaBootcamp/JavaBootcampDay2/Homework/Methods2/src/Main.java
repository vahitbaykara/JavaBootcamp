
public class Main {

	public static void main(String[] args) {

		String mesaj = "Ne diyosun la ne ne?";
		String yeniMesaj = sehir();
		System.out.println(yeniMesaj);
		
		int sayi = topla(23235,23237);
		System.out.println(sayi);
	}

	public static void ekle() {

	}

	public static void sil() {

		System.out.println("Sil");
	}

	public static void güncelle() {

		System.out.println("Güncelle");
	}
	
	public static int topla (int sayi1, int sayi2) {
		
		return sayi1 + sayi2;
		
		
	}
	
	public static String sehir() {
		
		return "Mardin";
		
		
	}

}
