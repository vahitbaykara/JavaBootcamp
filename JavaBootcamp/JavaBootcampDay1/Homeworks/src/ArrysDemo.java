
public class ArrysDemo {

	public static void main(String[] args) {

		String[] ogrenciler = { "Vahit", "Ahmet", "şeyhmus" };

		for (int i = 0; i < ogrenciler.length; i++) {

			System.out.println(ogrenciler[i]);

		}

		System.out.println("-----------------------");

		// 2. Yöntem

		String[] students = new String[3];

		students[0] = "Vahit";
		students[1] = "Seyhmus";
		students[2] = "Ahmet";

		for (int i = 0; i < students.length; i++) {

			System.out.println(students[i]);

		}

	}

}
