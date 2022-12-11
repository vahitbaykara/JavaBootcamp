
public class StringsDemo {

	public static void main(String[] args) {

		String mesaj = "Bugün Hava Çok Güzel";
		System.out.println(mesaj);
		
		System.out.println("Eleman Sayısı: " + mesaj.length());
		System.out.println("5. Karakter: " + mesaj.charAt(4));
		System.out.println(mesaj.concat(" Yaşasın!"));
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("l"));
		
		// Karakter aktarımı get.Chars
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		
		System.out.println(mesaj.indexOf("a"));
		System.out.println(mesaj.lastIndexOf("a"));
		
	}

}
