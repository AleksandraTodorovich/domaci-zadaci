package d_11_01_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SmartAirConditioning samsung = new SmartAirConditioning();

		samsung.marka = "Samsung";
		samsung.temperatura = 16;
		samsung.mode = "Greje";
		samsung.potrosnjaDokGreje = 50;
		samsung.potrosnjaDokHladi = 40;
		samsung.stampaj();

		int potrosnja = samsung.potrosnjaNaMesecnomNivou();
		System.out.println("Potrosnja je: " + potrosnja + " kW/h.");

		int racunZaStruju = samsung.potrosnjaStrujeNaMesecnomNivou(450);
		System.out.println("Troskovi struje na mesecnom nivou su: " + racunZaStruju + "din.");
		
		System.out.println();
		
		SmartAirConditioning philips = new SmartAirConditioning();

		philips.marka = "Philips";
		philips.temperatura = 25;
		philips.mode = "Greje";
		philips.potrosnjaDokGreje = 30;
		philips.potrosnjaDokHladi = 40;
		philips.stampaj();

		potrosnja = philips.potrosnjaNaMesecnomNivou();
		System.out.println("Potrosnja je: " + potrosnja + " kW/h.");
		racunZaStruju = philips.potrosnjaStrujeNaMesecnomNivou(200);
		System.out.println("Troskovi struje na mesecnom nivou su: " + racunZaStruju + "din.");
	}

}
