import javax.swing.JOptionPane;

public class OppgaveO1 {

	public static void main(String[] args) {
		// Lag et program som leser inn en poengsum
		int n = 2;

		for (int i = 1; i <= n; i++) {
			int poeng = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn poengsum: "));

			if (100 >= poeng && poeng >= 90) {
				System.out.println("Karakter A");
			} else if (89 >= poeng && poeng >= 80) {
				System.out.println("Karakter B");
			} else if (79 >= poeng && poeng >= 60) {
				System.out.println("Karakter C");
			} else if (59 >= poeng && poeng >= 50) {
				System.out.println("Karakter D");
			} else if (49 >= poeng && poeng >= 40) {
				System.out.println("Karakter E");
			} else if (39 >= poeng && poeng >= 0) {
				System.out.println("Karakter F");
			} else {
				n = n + 1;
				JOptionPane.showMessageDialog(null, "Ugyldig poengsum, legg inn på nytt");

			}

		}
	}
}