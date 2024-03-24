package tekbagli;

public class Tek {

	public static void main(String[] args) {
		Liste listem = new Liste();
		listem.basaEkle(25);
		listem.sonaEkle(335);
		listem.basaEkle(45);
		listem.yazdir();
		listem.araSil();
		listem.yazdir();
		listem.araSil();
		listem.yazdir();
		listem.basaEkle(89);
		listem.basaEkle(65);
		listem.yazdir();
		listem.araSil();
		listem.araSil();
		listem.yazdir();
		listem.araEkle(45, 1);
		listem.yazdir();
	}

}
