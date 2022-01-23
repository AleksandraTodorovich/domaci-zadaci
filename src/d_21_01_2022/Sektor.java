package d_21_01_2022;

public class Sektor {
//	Kreirati klasu Sektor koja ima:
//		 naziv sektora
//		 platu koja je za taj sektor
	private String nazivSektora;
	private double plataUTomSektoru;
	public Sektor() {
		super();
		
	}
	public Sektor(String nazivSektora, double plataUTomSektoru) {
		super();
		this.nazivSektora = nazivSektora;
		this.plataUTomSektoru = plataUTomSektoru;
	}
	public String getNazivSektora() {
		return nazivSektora;
	}
	public void setNazivSektora(String nazivSektora) {
		this.nazivSektora = nazivSektora;
	}
	public double getPlataUTomSektoru() {
		return plataUTomSektoru;
	}
	public void setPlataUTomSektoru(double plataUTomSektoru) {
		this.plataUTomSektoru = plataUTomSektoru;
	}
	
	
}
