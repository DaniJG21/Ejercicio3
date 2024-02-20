
public class Cambio {

	public static void main(String[] args) {
		Funcion cambio = new Funcion();
		int[] monedas = { 1, 2, 4, 9 };
		int resultado = cambio.cambioMinimo(monedas);
		System.out.println("El mínimo cambio que no puedo dar es: " + resultado);

	}

}
