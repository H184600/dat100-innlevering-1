import javax.swing.JOptionPane;

public class OppgaveO2 {

	public static void main(String[] args) {
		// Lag et program som leser inn bruttoinntekt, beregner 
		// og skriver ut trinnskatten dvs. det beløpet som personen skal betale i trinnskatt.
		
		int lonn = Integer.parseInt(JOptionPane.showInputDialog("Tast inn bruttolønn: "));
		if (lonn > 0 && lonn < 208050) {
			System.out.println("Du trenger ikke å betale skatt");
		} else if (lonn > 208050 && lonn < 292851) {
			System.out.println("Du må betale " + (lonn * 0.017) + "kr");
		} else if (lonn > 292850 && lonn < 670001) {
			System.out.println("Du må betale " + (lonn * 0.04) + "kr");
		} else if (lonn > 670000 && lonn < 937901) {
			System.out.println("Du må betale " + (lonn * 0.136) + "kr");
		} else if (lonn > 937900 && lonn < 1350001) {
			System.out.println("Du må betale " + (lonn * 0.166) + "kr");
		} else if (lonn > 1350000) {
			System.out.println("Du må betale " + (lonn * 0.176) + "kr");
		}
	}

}
