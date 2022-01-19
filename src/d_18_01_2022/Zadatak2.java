package d_18_01_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		Kombinacija prva = new Kombinacija("22/1", 33, 5, 28, 4, 11, 25, 17);
		Kombinacija druga = new Kombinacija("22/2", 1, 15, 28, 9, 31, 25, 10);
		Kombinacija treca = new Kombinacija("22/3", 16, 19, 24, 6, 17, 20, 2);
		Listic kombinacije = new Listic ();
		kombinacije.dodajKombinaciju(prva);
		kombinacije.dodajKombinaciju(druga);
		kombinacije.dodajKombinaciju(treca);		
		kombinacije.stampaj();

	}

}
