package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class OppgaveO1 {
	public static void main(String[] args) {

		String bruttoInntekt = showInputDialog("Bruttoinntekt:");

		double inntekt = parseInt(bruttoInntekt);

		if (inntekt > 0 && inntekt <= 164100) {
			String førsteSats = "inntekten din er: " + inntekt;
			System.out.println(førsteSats);
		} else if (inntekt >= 164100 && inntekt <= 230950) {
			inntekt = inntekt * 0.0093;
			System.out.println(inntekt);
		} else if (inntekt >= 230950 && inntekt <= 580650) {
			inntekt = inntekt * 0.0241;
			System.out.println(inntekt);
		} else if (inntekt >= 580650 && inntekt <= 934050) {
			inntekt = inntekt * 0.1152;
			System.out.println(inntekt);
		} else if (inntekt >= 934050) {
			inntekt = inntekt * 0.1452;
			System.out.println(inntekt);
		} 
	} 
}
