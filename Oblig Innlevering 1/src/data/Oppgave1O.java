package data;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppgave1O {

	public static void main(String[] args) {
		
	// Trinnskatt 2022
	// Noen forkortelser for variablene, slik at de kan oppdateres enkelt i senere tid.
				
		final int NEDRE_G = 190349;
				
		final int TRINN_1_ØVRE = 267899;
		final double TRINN_1_SKATT = 1.7;
				
		final int TRINN_2_ØVRE = 643799;
		final double TRINN_2_SKATT = 4.0;
				
		final int TRINN_3_ØVRE = 969199;
		final double TRINN_3_SKATT = 13.4;
				
		final int TRINN_4_ØVRE = 1999999;
		final double TRINN_4_SKATT = 16.4;
				
		final int TRINN_5 = 2000000;
		final double TRINN_5_SKATT = 17.4;
		
		
	// Input fra brukeren:
		
		String brutto = showInputDialog("Bruttoinntekt pr år: ");
		int b = parseInt(brutto);
		
		
	// De ulike utfallene:
		
		if (b < 0) {
			
			showMessageDialog(null, "Ugyldig tall. Minus ikke tillatt!");
		}
		
		else if (b <= NEDRE_G) {
			
			showMessageDialog(null, "Trinnskatten din er 0 kr.");
		}
		
		else if (b > NEDRE_G && b <= TRINN_1_ØVRE) {
			showMessageDialog
			(null, String.format("Trinnskatten din er %.0f", (b/100*TRINN_1_SKATT)) + " kr");
		}
		
		else if (b > TRINN_1_ØVRE && b <= TRINN_2_ØVRE) {
			showMessageDialog
			(null, String.format("Trinnskatten din er %.0f", (b/100*TRINN_2_SKATT)) + " kr");
		}
		
		else if (b > TRINN_2_ØVRE && b <= TRINN_3_ØVRE) {
			showMessageDialog
			(null, String.format("Trinnskatten din er %.0f", (b/100*TRINN_3_SKATT)) + " kr");
		}
		
		else if (b > TRINN_3_ØVRE && b <= TRINN_4_ØVRE) {
			showMessageDialog
			(null, String.format("Trinnskatten din er %.0f", (b/100*TRINN_4_SKATT)) + " kr");
		}
		
		else if (b >= TRINN_5) {
			showMessageDialog
			(null, String.format("Trinnskatten din er %.0f", (b/100*TRINN_5_SKATT)) + " kr");
		}

	}

}