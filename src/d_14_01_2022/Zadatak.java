package d_14_01_2022;

public class Zadatak {

	public static void main(String[] args) {

		Video video1 = new Video("43", "Led Zeppelin - Ramble On", 270, 790435, 85, 15000435);
		YoutubePlayer yt1 = new YoutubePlayer();
		yt1.ucitajVideo(video1);
		yt1.pojacaj();
		yt1.premotajUnapred();
		yt1.postaviKvalitet(4);
		yt1.iscitaj();
		System.out.println();
		Video video2 = new Video("576", "Queen - Killer Queen", 313, 34500, 45, 543234265);
		YoutubePlayer yt2 = new YoutubePlayer();
		yt2.ucitajVideo(video1);
		yt2.smanji();
		yt2.aktivirajBioskopskiMod();
		yt2.iscitaj();
	}

}
