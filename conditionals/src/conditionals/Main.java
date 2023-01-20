package conditionals;

public class Main {

	public static void main(String[] args) {
			
		int sayi = 27;
		String tText = "  Sayınız = ";
		if (sayi< 20 ) {
			System.out.println(  tText + "Sayı 20 den Küçüktür");
		}else if (sayi == 20){
		 
			System.out.println( tText + "Sayı 20'ye eşittir");
		}else {
			System.out.println( tText + "Sayi 20'den Büyüktür.!");
		}
	}
}