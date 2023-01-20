package arraysDemo;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		String ogrenci1 = "Metehan";
		String ogrenci2 = "Fatih";
		String ogrenci3 = "Mehmet";

		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);

		System.out.println("---------------------------");

		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Engin";
		ogrenciler[1] = "Derin";
		ogrenciler[2] = "Salih";
		ogrenciler[3] = "Ece";
		//ogrenciler[4] = "Ali";

		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		System.out.println("---------------------------");


		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);

		}

	}

}
