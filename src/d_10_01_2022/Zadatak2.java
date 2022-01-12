package d_10_01_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		
		SmartAirConditioning samsung = new SmartAirConditioning();

		samsung.marka = "Samsung";
		samsung.temperatura = 16;
		samsung.mod = "On";
		samsung.stampaj();

		SmartAirConditioning philips = new SmartAirConditioning();

		philips.marka = "Philips";
		philips.temperatura = 25;
		philips.mod = "ON";
		philips.stampaj();
	}

}
