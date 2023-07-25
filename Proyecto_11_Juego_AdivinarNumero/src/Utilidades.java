import java.util.Scanner;

public class Utilidades {

	// Métodos para evitar problemas en la lectura de datos del usuario
	public static String leerString() {
		Scanner entrada = new Scanner(System.in);
		return entrada.nextLine();
	}
	
	public static double leerDouble() {
		Scanner entrada = new Scanner(System.in);
		return entrada.nextDouble();
	}
	
	public static byte leerByte() {
		Scanner entrada = new Scanner(System.in);
		return entrada.nextByte();
	}
	
	
	public static int leerEntero() {
		Scanner entrada = new Scanner(System.in);
		return entrada.nextInt();
	}
	
	
	public static char leerCaracter() {
		Scanner entrada = new Scanner(System.in);
		return entrada.nextLine().charAt(0);
	}
	
	
	
}
