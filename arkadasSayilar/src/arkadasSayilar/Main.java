package arkadasSayilar;

public class Main {

	public static void main(String[] args) {

		int sayi1 = 250;
		int sayi2 = 220;
		int toplam1 = 0;
		int toplam2 = 0;

		for (int i = 1; i < sayi1; i++) {
			if (sayi1 % i == 0) {
				toplam1 = toplam1 + i;
			}
		}
		for (int i = 1; i < sayi2; i++) {
			if (sayi2 % i == 0) {
				toplam2 = toplam2 + i;
			}
		}

		if (sayi1 == toplam2) {
			if (sayi2 == toplam2 && sayi2 == toplam1) {
				System.out.println("bu iki Sayı Arkadaşlar");
			} else {
				System.out.println("Bu iki sayı arkadaş değildir.");
			}
		}

	}

}
