
public class EnBuyukSayiBulma {

	public static void main(String[] args) {

		int a = 45;
		int b = 45;
		int c = 45;
		
		
		if (a > b & a > c) {
			
			System.out.println("En büyük sayi: " + a);
			
		} else if (b > a & b > c) {
			
			System.out.println("En büyük sayi: " + b);
			
		}
		
		 else if (c > a & c > b) {
				
				System.out.println("En büyük sayi: " + c);
				
			}
		
		 else {
			System.out.println("Sayilar esit");
		}
		
		
		
		// başka bir yöntem
		
		
		int x = 45;
		int y = 35;
		int z = 15;
		int enBuyuk = x;
		
		if (enBuyuk<y) {
			
			enBuyuk = y;
			
		} else if (enBuyuk<z) {

			enBuyuk = z;
			
		}
	
		
		System.out.println("En büyük sayi: " + enBuyuk);
		
	}

}
