
public class Funcion {

	public int cambioMinimo(int[] array) {
		int min = 1;

		for (int i = 0; i < array.length; i++) {
			int moneda = array[i];
			if (moneda <= min) {
				min += moneda;
			}
		}
		return min;
	}
}
