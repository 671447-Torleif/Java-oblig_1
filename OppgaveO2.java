package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class OppgaveO2 {
	public static void main(String[] args) {

		int i = 1;

		while (i <= 10) {

			String poengSum = showInputDialog("Poeng:");

			int poeng = parseInt(poengSum);

			if (poeng < 0 || poeng > 100) {
				showMessageDialog(null, "Enter a value between 0-100");
				System.out.println("Enter a value between 0-100");
				i--;
			}

			if (poeng <= 39 && poeng >= 0) {
				System.out.println("For student " + i + " Karakter: F");
			}
			if (poeng <= 49 && poeng >= 40) {
				System.out.println("For student " + i + " Karakter: E");
			}
			if (poeng <= 59 && poeng >= 50) {
				System.out.println("For student " + i + " Karakter: D");
			}
			if (poeng <= 79 && poeng >= 60) {
				System.out.println("For student " + i + " Karakter: C");
			}
			if (poeng <= 89 && poeng >= 80) {
				System.out.println("For student " + i + " Karakter: B");
			}
			if (poeng <= 100 && poeng >= 90) {
				System.out.println("For student " + i + " Karakter: A");
			}

			i++;
		}
	}
}
