import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		int limite;
		int numero, numUsuario;
		char respuestaVuelta = ' ';
		char respuestaPartida = ' ';
		
		// Comentario
		do {
			System.out.println("JUEGO: Adivinar número");
			System.out.println("Voy a pensar un número entre 1 y el que tú me digas");
			System.out.println("¿Cuál será el límite?");
			limite = Utilidades.leerEntero();
			
			// Comenzamos la partida
			numero = generarNumAleatorio(limite);
			
			do {
				respuestaVuelta = ' ';
				respuestaPartida = ' ';
				
				System.out.println("¿Qué número estoy pensando? (Entre 1 y " + limite + ")");
				numUsuario = Utilidades.leerEntero();
				
				if (numUsuario == numero) {
					// Acierto; se acaba la partida
					System.out.println("Enhorabuena, has acertado!!");
					System.out.println("Quieres jugar otra partida (S/N)");
					respuestaPartida = Utilidades.leerCaracter();
				}else {
					// Fallo; hay que volver a intentarlo
					System.out.println("Has fallado!! ¿Quieres volver a intentarlo? (S/N)");
					respuestaVuelta = Utilidades.leerCaracter();	
				}
			
			}while (respuestaVuelta == 'S');
		
		}while (respuestaPartida == 'S');
		
		System.out.println("Hasta la próxima!!!");
		
	}

	
	
	// Procedimiento para generar un número aleatorio entre 1 y otro número mayor (límite)
	public static int generarNumAleatorio(int limite) {
		Random aleatorio = new Random();
		return aleatorio.nextInt(1, limite + 1);
	}
}
