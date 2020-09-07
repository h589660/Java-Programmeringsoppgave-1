package no.hvl.dat100;
import java.util.Scanner;
public class Oppg_6_Innlevering_Uke37 {
	

	public static void main(String[] args) {
		
		  {
		    int n, c, f = 1;

		    System.out.println("Skriv inn et tall for å finne fakultet");
		    Scanner in = new Scanner(System.in);

		    n = in.nextInt();

		    if (n < 0)
		      System.out.println("Tallet kan ikke være negativt");
		    else
		    {
		      for (c = 1; c <= n; c++)
		        f = f*c;

		      System.out.println("Fakultetet til "+n+" er = "+f);
		    }
		  }
		}
}
	
