package no.hvl.dat100;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppg_4_Innlevering_Uke37 {
	
	public static void main(String[] args) {
		String inntektstreng  =showInputDialog("Skriv inn inntekt her:");
		int inntekt = Integer.parseInt(inntektstreng);
		String resultat = "";
		
		if (inntekt <= 180800) {
			resultat += "Ingen ekstra trinnskatt";
		}
		else if (inntekt <= 254500) {
			resultat += "1.9% ekstra trinnskatt";
		}
		else if (inntekt <= 639750) {
			resultat += "4.2% ekstra trinnskatt";
		}
		else if (inntekt <= 999550) {
			resultat += "13.2% ekstra trinnskatt";
		}
		else {
			resultat += "16.2% ekstra trinnskatt";
		}
		
		showMessageDialog(null, resultat);
	}
}
