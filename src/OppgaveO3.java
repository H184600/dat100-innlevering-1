import javax.swing.JOptionPane;

public class OppgaveO3 {

	public static void main(String[] args) {
		// lag et program som leser inn et heltall n > 0, beregner verdien n!
		// (n fakultet) og skriver verdien til n! ut på skjermen, der n! = 1*2*3* …
		// *(n-1)*n.

		int n = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn ett heltall som er større en null: "));

		if (n <= 0) {
			System.out.println("Feil, tallet kan ikke være 0 eller mindre");
		} else {
			int regne = regnestykke(n);
			System.out.println(n + "! = " + regne);
		}
	}

	public static int regnestykke(int n) {
		int svar = 1;
		for (int i = 1; i <= n; i++) {
			svar *= i;

		}
		return (svar);
	}

}
