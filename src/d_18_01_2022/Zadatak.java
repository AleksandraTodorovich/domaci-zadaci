package d_18_01_2022;

public class Zadatak {

	public static void main(String[] args) {
		Ispit ispit1 = new Ispit("Metodologija", 10, "Milos B.");
		Ispit ispit2 = new Ispit("Geografija", 6, "Djuro R.");
		Ispit ispit3 = new Ispit("Matematika", 5, "Dragan T.");
		Ispit ispit4 = new Ispit("Istorija", 10, "Dragica D.");
		Ispit ispit5 = new Ispit("Sociologija", 9, "Djordje R.");
		Student student1 = new Student();
		Student student2 = new Student();
		student1.setImePrezime("Milan M");
		student1.setBrojIndeksa("12/03");
		student1.setTipStudija("osnovne");
		student1.dodajIspitUNiz(ispit1);
		student1.dodajIspitUNiz(ispit2);
		student1.dodajIspitUNiz(ispit3);
		student1.stampaj();
		System.out.println();
		student2.setImePrezime("Milica N");
		student2.setBrojIndeksa("56/11");
		student2.setTipStudija("Master");
		student2.dodajIspitUNiz(ispit1);
		student2.dodajIspitUNiz(ispit4);
		student2.dodajIspitUNiz(ispit5);
		student2.stampaj();

	}

}
