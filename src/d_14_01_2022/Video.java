package d_14_01_2022;

public class Video {
//	4.Zadatak (ZA VEZBANJE)
//	Kreirati klasu Video koja ima:
//	svi atributi su private
//	id video - koji je string i na primer izgleda v6tuOipj5mk
//	naziv video
//	duzinu video u sekundama (npr: ako je video 2min i 10s, duzina je 130)
//	broj lajkova
//	broj dislajkova
//	broj pregleda
//	metodu lajkuj - koja povecava broj lajkova za jedan
//	metodu dislajkuj - koja povecava broj dislajkova za jedan
//	metodu pogledaj - koja povecava broj pregleda za jedan
//	gettere za sve atribute
//	settere nemamo
//
//




	private String idVideo;
	private String nazivVidea;
	private int duzinaVidea;
	private int brojLike;
	private int brojDislike;
	private int brojPregleda;

	public Video() {

	}

	public Video(String id, String naziv, int duzinaVidea, int brLike, int brDislike, int pregledi) {
		this.idVideo = id;
		this.nazivVidea = naziv;
		this.duzinaVidea = duzinaVidea;
		this.brojLike = brLike;
		this.brojDislike = brDislike;
		this.brojPregleda = pregledi;
	}

	public String getID() {
		return this.idVideo;
	}

	public String getNaziv() {
		return this.nazivVidea;
	}

	public int getLength() {
		return this.duzinaVidea;
	}

	public int getLike() {
		return this.brojLike;
	}

	public int getDislike() {
		return this.brojDislike;
	}

	public int getPregledi() {
		return this.brojPregleda;
	}

	public void Like() {
		this.brojLike = this.brojLike + 1;
	}

	public void Dislike() {
		this.brojDislike = this.brojDislike + 1;
	}

	public void Pogledaj() {
		this.brojPregleda = this.brojPregleda + 1;
	}

}
