
public class SayiBulma {

	public static void main(String[] args) {

		
		int [] numbers = {1,3,4,5,6,7,8,0};
		int aranacak = 02;
		
		boolean varMı = false;
		
		for (int i : numbers) {
			
			if (i == aranacak) {
				
				varMı = true;
				break;
				
			}
		}
		
		if (varMı) {
			
			System.out.println("Sayı mevcuttur");
			
		} else {

			System.out.println("Sayı mevcut değildir");
			
		}
		
		
	}

}
