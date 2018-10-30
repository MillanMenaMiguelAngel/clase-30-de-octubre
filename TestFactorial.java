/** Clase para calcular factorial de un numero
 * @Auhtor Miguel Millán
 * @Version 1.0
 * 
 * 
 * */




public class TestFactorial {
	
	public static void main (String[] args) {
		
		short numero = 5;
		
		if (numero >=0){ 
		long factorial = Factorial2.calcularFactorial(numero);
		
		System.out.println("El factorial de " + numero + "vale" + factorial);
	}
	else
			System.out.println("No existen factoriales de numeros negativos");
	}
}

