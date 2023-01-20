package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'D';
		String not = "Notunuz = ";
		String geNot = "geçersiz mk bu = ";

		switch (grade) {
		case 'A':
			System.out.println(not + "Mükemmel : Geçtiniz Bravo ");
			break;
		case 'B':
		case 'C':
			System.out.println(not + "İyi");
			break;
		case 'D':
			System.out.println(not + "Fena değil : Geçtiniz Bravo ");
			break;
		case 'F':
			System.out.println(not + "Böyle Not mu olur amk kaldın");
			break;
		default:
			System.out.println(geNot + "Geçersiz Not girdiniz");

		}
	}

}
