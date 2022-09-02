package data;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppgave2O {

	public static void main(String[] args) {
		
		for(int s = 0; s < 10; s++) {
		
		String poengsum = showInputDialog("Oppgi poengsum: ");
		int p = parseInt(poengsum);
		
		
		if(p < 0 || p > 100) {
			
			showMessageDialog(null, "Ikke gyldig poengsum, prøv igjen.");
			s--;
		}
		
	      else if (p >= 0 && p <= 39) {
	      	showMessageDialog(null, "Du har fått karakter F");
		}
		
	      else if (p >= 40 && p <= 49) {
      		showMessageDialog(null, "Du har fått karakter E");
	      }
		
      	else if (p >= 50 && p <= 59) {
	      	showMessageDialog(null, "Du har fått karakter D");
		}
		
      	else if (p >= 60 && p <= 79) {
	      	showMessageDialog(null, "Du har fått karakter C");
		}
		
      	else if (p >= 80 && p <= 89) {
	      	showMessageDialog(null, "Du har fått karakter B");
		}
		
      	else if (p >= 90 && p <= 100) {
	      	showMessageDialog(null, "Du har fått karakter A");
		}
	
	  }
	
   }
	
}