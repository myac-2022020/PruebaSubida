import java.util.Scanner;

public class Principal{
	public static void main(String[] args) {
		//Variables generales
		int opcion = 0;
		//Instancia / creamos objetos
		Scanner leer = new Scanner(System.in);
		Operaciones op = new Operaciones();
		while(opcion!=5){
			op.mostrarMenu();
			System.out.println("Escoge una opcion valida");
			opcion = leer.nextInt();
			switch(opcion){
				case 1:
					System.out.println("Agrega 2 valores");
					op.pedirValores();
					op.realizarSuma();
					System.out.println(op.obtenerRespuesta());	
				break;
				case 2:
					System.out.println("Agrega 2 valores");
					op.pedirValores();
					op.realizarResta();
					System.out.println(op.obtenerRespuesta());
				break;
				case 3:
					System.out.println("Agrega 2 valores");
					op.pedirValores();
					op.realizarMultiplicacion();
					System.out.println(op.obtenerRespuesta());	
				break;
				case 4:
					System.out.println("Agrega 2 valores");
					op.pedirValores();
					op.realizarDivision();
					System.out.println(op.obtenerRespuesta());
				break;
				case 5:
					op.despedida();
				break;
				default:
					op.errorUsuario();
				break;
			}
		}
	}
}