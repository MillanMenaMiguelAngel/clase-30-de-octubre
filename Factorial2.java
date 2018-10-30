/**
 * Clase para calcular el factorial de un numero
 * @author Miguel Millan
 * @version 1.0
**/

public class Factorial2 {
	
	/**
	 * Método que calcula el valor factorial 
	 * de un numero enero
	 * @param numero valor a calcular factorial
	 * @return factorial del numero tipo long
	 * */
	
	public static long calcularFactorial(int numero) {
		
			// no incializo el numero por que ya tengo 1 de retorno abajo del todo
			int contador = 1;
			int acumulador = 1;
			while (contador <= numero){
				acumulador *= contador;
				contador++;
				}
			return acumulador;
		
			
		}
	
}
