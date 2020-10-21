package no.hvl.dat100;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppg_4_Innlevering_Uke37 {
	
	public static void main(String[] args) {
		String inntektstreng  =showInputDialog("Skriv inn inntekt her:");
		int inntekt = Integer.parseInt(inntektstreng);
		String resultat = "";
		
		if (inntekt <= 180800) {
			resultat += "Ingen trinnskatt";
		}
		else if (inntekt <= 254500) {
			resultat = ""+inntekt*0.019;
		}
		else if (inntekt <= 639750) {
			resultat = ""+inntekt*0.042;
		}
		else if (inntekt <= 999550) {
			resultat = ""+inntekt*0.13;
		}
		else {
			resultat = ""+inntekt*0.162;
		}
		
		showMessageDialog(null, resultat);
	}
	
}
