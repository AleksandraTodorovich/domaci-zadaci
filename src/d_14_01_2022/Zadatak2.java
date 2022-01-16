package d_14_01_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		
		Autor autor1 = new Autor("Borislav", "Pekic");
		Knjiga knjiga1 = new Knjiga("123-45678-65", "Besnilo", 1995, autor1);
		knjiga1.stampaj();

		System.out.println();

		Autor autor2 = new Autor("Dzon R.R", "Tolkin");
		Knjiga knjiga2 = new Knjiga("654-76890-34", "Hobit", 1974, autor2);
		knjiga2.stampaj();

		System.out.println();

		Autor autor3 = new Autor("Steven", "King");
		Knjiga knjiga3 = new Knjiga("435-56678-43", "Misery", 2003, autor3);
		knjiga3.stampaj();
	}

}
