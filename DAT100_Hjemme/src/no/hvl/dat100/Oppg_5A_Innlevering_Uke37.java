package no.hvl.dat100;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
public class Oppg_5A_Innlevering_Uke37 {

	public static void main(String[] args) {
		String poengsum =showInputDialog("Skriv inn Poengsum");
		int poeng = Integer.parseInt(poengsum);
		String resultat = ""; 
		if (poeng <= -1) {
			resultat += "Ugyldig inntasting!";
		}
		else if (poeng <= 39) {
			resultat += "Karakter: F";
		}
		else if (poeng <= 49) {
			resultat += "Karakter: E";
		}
		else if (poeng <= 59) {
			resultat += "Karakter: D";
		}
		else if (poeng<= 79) {
			resultat += "Karakter: C";
		}
		else if (poeng <= 89) {
			resultat += "Karakter: B";
		}
		else if (poeng <= 100) {
			resultat += "Karakter: A";
		}
		else {
			resultat += "Ugyldig inntasting!!";
		}
		showMessageDialog(null, resultat);
		
		} 
}