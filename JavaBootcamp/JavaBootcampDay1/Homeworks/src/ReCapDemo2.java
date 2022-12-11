
public class ReCapDemo2 {

	public static void main(String[] args) {
		
		
		
		// Sayıları göster
		// Toplamlarını göster
		// En büyük sayıyı göster

		double[] myList = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		double total = 0;
		double enBuyuk = myList[0];

		for (double number : myList) {

			if (enBuyuk < number) {
				enBuyuk = number;
			}
			
			total = total + number;
			System.out.println(number);
		}

		System.out.println("Total: " + total);
		System.out.println("En Buyuk sayi: " + enBuyuk);

	}

}
