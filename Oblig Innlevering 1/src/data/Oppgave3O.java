package data;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppgave3O {

	public static void main(String[] args) {
		
		String number = showInputDialog("Oppgi et tall ");
		int n = parseInt(number);
		
		long fact = 1;
		
		if (n > 0) {
		
			for (int i = 1; i <= n; i++) {
			fact *= i;
		      } 
			showMessageDialog(null, "Fakultet til tallet " + n + " er " + fact);
	      } 
		
		else {
			showMessageDialog(null, "Ugyldig tall.");
		
		}

	}

}

