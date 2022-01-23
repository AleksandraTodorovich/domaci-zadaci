package d_21_01_2022;

import java.util.ArrayList;

public class Zadatak2 {

	public static void main(String[] args) {
		//U glavnom programu kreirati jednog magacionera i jednog menadzera, postaviti sektore u 
		//kojima rade i ispisati platu za svakog
		
		
		Magacioner magacioner1 = new Magacioner("Milos Milosevic");
		Menadzer menadzer1 = new Menadzer("Anka M");
		
		Sektor sektor1 = new Sektor("Ugostiteljstvo", 65000);
		Sektor sektor2 = new Sektor("Turizam", 75000);
		Sektor sektor3 = new Sektor("Ekonomija", 120000);
		Sektor sektor4 = new Sektor("Usluzna delatnost", 43000);
		Sektor sektor5 = new Sektor("Brodogradnja", 65200);
		
		magacioner1.zaposliUSektor(sektor5);
		magacioner1.zaposliUSektor(sektor4);
		menadzer1.zaposliUSektor(sektor1);
		menadzer1.zaposliUSektor(sektor2);
		menadzer1.zaposliUSektor(sektor3);
		
		System.out.println("Plata magacionera: " + magacioner1.plataRadnika());
		System.out.println("Plata menadzera: " + menadzer1.plataRadnika());
	}

}
