package d_14_01_2022;

public class YoutubePlayer {
//	Kreirati klasu YoutubePlayer koja ima:
//		svi atributi su private
//		objekat video
//		kvalitet videa (moze da bude 144, 240, 360, 480, 720, 1080)
//		rezim koji moze da bude - mini player , bioskopski rezim , preko celog ekrana
//		jacinu zvuka
//		trenutno vreme videa u reprodukciji
//		gettere za sve atribute
//		samo difoltni konstuktor, i njemu se svuk postavlja na 75 i kvalitet po difoltu na 144 
//		kao i rezim na mini player.
//		metodu ucitajVideo kojoj se prosledjuje referenca do videa koji se pusta. Trenutno vreme
//		kada se ucita video se postavlja na nulu. Treba videu da povecamo broj pregleda!
//		metodu pojacaj- koja povecava jacinu zvuka za 10. Znate da morate da vodite racuna da ne
//		predje 100.
//		metodu smanji - koja smanjuje jacinu zvuka za 10 (da ne padne ispod nule)
//		metodu postaviKvalitet - metoda kao parametar prima brzinu interneta u megbajtima.
//		Ako je brzina interneta ispod 2Mb -> kvalitet je 144
//		Ako je brzina interneta do 4Mb -> kvalitet je 240
//		Ako je brzina interneta do 6Mb -> kvalitet je 360
//		Ako je brzina interneta do 8Mb -> kvalitet je 720
//		Ako je brzina interneta preko 8Mb -> kvalitet je 1080
//		metodu aktivirajMiniPlayerMod - koja postavlja rezim na mini player
//		metodu aktivirajBioskopskiMod -  koja postavlja bioskopski rezim
//		metodu aktivirajPrekoCelogEkranaMod -  koja postavlja rezim preko celog ekrana
//		metodu premotajUnapred - metoda koja premotava trenutno vreme videa za 10s. Vodite racuna
//		da ne predjete duzinu videa.
//		metodu premotajUnazad - metoda vraca trenutno vreme videa za 10s. Vodite racuna da ne
//		padnete ispod nule
//		iscrtajZvuk - metoda koja ispisuje tekst koji simulira jacinu zvuka. Svaka crtica 
//		predstavlja jecinu od 10.
//		Pa ako je jacina zvuka 75 - crtamo 7 crtica
//		Primer stampe je:   <: |||||||
//		Ako je jecina zvuka 32
//		Primer stampe je: <: |||
//		Ako je jacina nula
//		Onda stampamo </
//		[HELP] Broj crtica mozete da dobijete kao brCrtica = jacina zvuka / 10;
//		Metodu iscrtaj rezim koja iscrtava rezim po izgledu:
//		Ako je mini player stampa [ ]
//		Ako je bioskopski stampa se  [ ..]
//		Ako je preko celog ekrana  se [||||]
//		Metodu iscrtajTrenutnoVreme - metoda ispisuje vreme video u formatu
//		minut:sekund / minutUkupnogVideo:sekundUkupnogVidea
//		minut - se racuna kao trenutno vreme / 60
//		sekund - se racuna kao trenutno vreme % 60
//		minutUkupnogVideo - racuna se kao ukupna duzina video u sekundama / 60
//		sekundUkupnogVidea - racuna se kao ukupna duzina video u sekundama % 60
//		metodu iscrtaj timeline - metoda simulira iscrtavanje timelin-a.
//		Koristicemo zvezdice i tackice. idu 100 zvezdice/tackica. Zvezdice za ono sto je
//		pogledano.
//		******************************......................................................................
//		broj zvezdica = trenutno vreme * 100 / ukupno vreme videa
//		A stackice su 100 - broj zvezdica 
//		metodu iscitaj - metoda simulira iscrtavanje celog playera
//		  1:03 / 2:05  Zvuk <: |||||| 
//		 Timeline: ******************************.....................................................................  
//		Kvalitet: 720p  
//		Rezim: [||||]
//		 Ariana Grande - positions (official video)
//		Likes  23 | Dislikes 32
//		34893483 Pregleda 
//
//		metodu za sherovanje videa, metoda generise i vraca link do videa tako da link izgleda:
//		https://youtu.be/v6tuOipj5mk
//		Objasnjenje v6tuOipj5mk je id videa.
//
//


	private Video video;
	private int kvalitetVidea;
	private String rezimVidea;
	private int jacinaZvuka;
	private int trenutnoVremeVidea;

	public YoutubePlayer() {
		this.jacinaZvuka = 75;
		this.kvalitetVidea = 144;
		this.rezimVidea = "mini player";
		// this.video = video;
	}

	public Video getVideo() {
		return this.video;
	}

	public int getKvalitet() {
		return this.kvalitetVidea;
	}

	public String getRezimVidea() {
		return this.rezimVidea;
	}

	public int getJacinaZvuka() {
		return this.jacinaZvuka;
	}

	public int getTrenutnoVreme() {
		return this.trenutnoVremeVidea;
	}

	public void ucitajVideo(Video video) {
		this.video = video;
		this.trenutnoVremeVidea = 0;
		this.video.Pogledaj();
	}

	public void pojacaj() {
		if (this.jacinaZvuka < 90) {
			this.jacinaZvuka = this.jacinaZvuka + 10;
		} else {
			this.jacinaZvuka = 100;
		}

	}

	public void smanji() {
		if (this.jacinaZvuka >= 10) {
			this.jacinaZvuka = this.jacinaZvuka - 10;
		} else {
			this.jacinaZvuka = 0;
		}
	}

	public void postaviKvalitet(int brzinaNeta) {
		if (brzinaNeta < 2) {
			this.kvalitetVidea = 144;
		} else if (brzinaNeta < 4) {
			this.kvalitetVidea = 240;
		} else if (brzinaNeta < 6) {
			this.kvalitetVidea = 360;
		} else if (brzinaNeta < 8) {
			this.kvalitetVidea = 720;
		} else {
			this.kvalitetVidea = 1080;
		}
	}

	public void aktivirajMiniPlayerMod() {
		this.rezimVidea = "mini player";

	}

	public void aktivirajBioskopskiMod() {
		this.rezimVidea = "bioskopski";
	}

	public void aktivirajPrekoCelogEkranaMod() {
		this.rezimVidea = "Aktiviraj Preko Celog Ekrana Mode";
	}

	public void premotajUnapred() {
		if (this.video.getLength() - this.trenutnoVremeVidea >= 10) {
			this.trenutnoVremeVidea = this.trenutnoVremeVidea + 10;
		} else {
			this.trenutnoVremeVidea = this.video.getLength();
		}
	}

	public void premotajUnazad() {
		if (this.trenutnoVremeVidea >= 10) {
			this.trenutnoVremeVidea = this.trenutnoVremeVidea - 10;
		} else {
			this.trenutnoVremeVidea = 0;
		}
	}

	public void iscrtajZvuk() {
		System.out.print("<");
		for (int i = 0; i < this.jacinaZvuka / 10; i++) {
			System.out.print(" | ");
		}
		if (this.jacinaZvuka == 0) {
			System.out.print("/");
		}
	}

	public void iscrtajRezim() {
		if (this.rezimVidea.equals("mini player")) {
			System.out.println("[]");
		} else if (this.rezimVidea.equals("bioskopski")) {
			System.out.println("[ ..]");
		} else {
			System.out.println("[||||]");
		}
	}

	public void iscrtajTrenutnoVreme() {

		System.out.print((this.trenutnoVremeVidea / 60) + ":" + (this.trenutnoVremeVidea % 60) + " | "
				+ (this.video.getLength() / 60) + ":" + (this.video.getLength() % 60));
	}

	public void timeline() {
		for (int i = 0; i < (this.trenutnoVremeVidea * 100) / this.video.getLength(); i++) {
			System.out.print("*");
		}
		for (int i = 0; i < 100 - (this.trenutnoVremeVidea * 100) / this.video.getLength(); i++) {
			System.out.print("-");
		}
	}

	public void iscitaj() {
		this.iscrtajTrenutnoVreme();
		System.out.println();
		this.iscrtajZvuk();
		System.out.println();
		this.timeline();
		System.out.println();
		System.out.println("Kvalitet: " + this.kvalitetVidea);
		this.iscrtajRezim();
		System.out.println(this.video.getNaziv());
		System.out.println(this.video.getLike() + " | " + this.video.getDislike());
		System.out.println(this.video.getPregledi() + " pregleda");

	}

	public String serujVideo() {
		return "https://youtu.be/" + this.video.getID();
	}
}