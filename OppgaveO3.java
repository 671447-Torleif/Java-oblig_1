package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class OppgaveO3 {

	public static void main(String[] args) {
		
		String heltall = showInputDialog("Heltall:");
		
		int n = parseInt(heltall);
		int sum = 1;
		
		while (n > 1) {
			sum *= n;
			n--;
		}
		showMessageDialog(null, heltall + "! = " + sum);
	}
}
