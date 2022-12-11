
public class MultiDiomensionalArrayDemo {

	public static void main(String[] args) {

		String [][] cities = new String[3][3];
	
		cities [0][0] = "İstanbul";
		cities [0][1] = "Mardin";
		cities [0][2] = "Şanlıurfa";
		cities [1][0] = "Mersin";
		cities [1][1] = "Yozgat";
		cities [1][2] = "İzmir";
		cities [2][0] = "Ankara";
		cities [2][1] = "Kocaeli";
		cities [2][2] = "Siirt";
	
		for (int i = 0; i < 3; i++) {
			
			System.out.println("----------------------");
			
			for (int j = 0; j < 3; j++) {
				
				System.out.println(cities[i][j]);
				
			}
		}
		System.out.println("----------------------");
	
	
	
	}
	
	
	
	
}
