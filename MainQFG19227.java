package estudiantes;

public class MainQFG19227 {

	public static void main(String[] args) {
		String leftAlignFormat = "| %-9s | %-21s |%n";

		System.out.println("Hola! Mi información personal:");
		System.out.format("+-----------+-----------------------+%n");
		System.out.format("|    Dato   |         Valor         |%n");
		System.out.format("+-----------+-----------------------+%n");
		System.out.format(leftAlignFormat, "Nombre", "Victor");
		System.out.format(leftAlignFormat, "Apellidos", "Casado Ugidos");
		System.out.format(leftAlignFormat, "Email", "qfg19227@educastur.es");
		System.out.format("+-----------+-----------------------+%n");
	}

}
