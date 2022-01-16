package d_13_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		
		FacebookPost post1 = new FacebookPost("Milan Milanovic", "Pera Peric", "Letovanje u Egiptu 2020", 120, 15, 0);
		post1.stampaj();
		
		System.out.println();
		
		FacebookPost post2 = new FacebookPost("Sofija Krstic", "Ivan Ivanovic", "Koncert Smaka u Areni.", 643, 45, 0);
		post2.stampaj();
	}

}
