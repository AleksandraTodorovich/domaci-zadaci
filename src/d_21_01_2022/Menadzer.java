package d_21_01_2022;

public class Menadzer extends Radnik {
//	Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
//		 override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.
	
	public Menadzer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Menadzer(String imePrezime) {
		super(imePrezime);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double plataRadnika () {
		double suma = 0;
		for (int i = 0; i < nizSektora.size(); i++) {
			suma = suma + this.nizSektora.get(i).getPlataUTomSektoru();
		}
		return suma;
	}
}
