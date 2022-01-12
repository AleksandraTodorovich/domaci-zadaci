package d_10_01_2022;

public class SmartAirConditioning {

//	2.  Kreirati klasu SmartAirConditioning koja ima:
//		atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//		atribut za izabranu temperaturu (minimum je 16, maksimum 35)
//		atribut za mod (hladi/greje)
//		metodu za stampu - stampa u formatu 
//		U glavnom programu kreirati minimum 2 objekta klase SmartAirConditioning 
//		i za svaki od njih pozvati metodu za stampu
	
	String marka;
	int temperatura;
	String mod;

	public void stampaj() {
		System.out.println("Marka: " + this.marka);
		System.out.println("On/Off: " + this.mod);
		System.out.println("Trenutna temperatura: " + this.temperatura + "C.");
		System.out.println();

	}
}