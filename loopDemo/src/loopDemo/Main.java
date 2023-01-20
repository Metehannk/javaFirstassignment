package loopDemo;

import java.text.BreakIterator;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// For döngüsü.
		for (int i = 2; i < 10; i += 2) {
			System.out.println(i);
		}
		System.out.println("For Döngü Biti");

		int i = 1;
		// While Döngüsü
		while (i < 10) {
			System.out.println(i);
			i += 2;
		}
		System.out.println("While Döngüsü bitti");
		// Do-While Döngüsü
		int j = 10;
		do {
			System.out.println("Loglandı");
			System.out.println(j);
			j += 2;

		} while (j < 10);
		System.out.println("Do While Döngüsü Bitti");
	}
}
