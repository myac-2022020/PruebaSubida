import java.util.Scanner;

public class Operaciones {
	//Creando una instancia para el objeto de tipo Scanner
	Scanner leer = new Scanner(System.in);

	//Atributros
	public double valorA;
	public double valorB;
	private double respuesta;

	//Metodos
	public void mostrarMenu(){
		System.out.println("1. Sumar");
		System.out.println("2. Restar");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		System.out.println("5. Salir");
	}

	public void pedirValores(){
		valorA = leer.nextDouble();
		valorB = leer.nextDouble();
	}

	public void realizarSuma(){
		respuesta = valorA + valorB;
	}
	public void realizarResta(){
		respuesta = valorA - valorB;
	}
	public void realizarMultiplicacion(){
		respuesta = valorA * valorB;
	}
	public void realizarDivision(){
		if (valorB !=0) {
			respuesta = valorA / valorB;
		} else {
			System.out.println("No se puede dividir entre 0");
		}
	}

	//Obtener respuesta con metodo return
	public double obtenerRespuesta(){
		return respuesta;
	}

	//Error si no se escoge una opcion valida
	public void errorUsuario(){
		System.out.println("Escoga una opcion valida");
	}

	public void despedida(){
		System.out.println("|                          |");
		System.out.println(" ------ Hasta Luego ------- ");
		System.out.println("|                          |");
	}

}