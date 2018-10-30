public class factorial {
	
	public static void main (String[] args) {
		
		int numero = -5;
		int contador = 1; //ESTE ES EL NUMERO POR EL CUAL VA MULTIPLICANDO. Lo iniciarias en 1 por que con el 0 siempre seria 0
		long acumuladorfact = 1; //AQUI SE VA ACUMULANDO EL RESTO. Para números muy altos, lo cambiamos a metodo long
		
		if (numero < 0){
			System.out.println("No existen factoriales de los numeros negativos");
			System.exit(1);
			}
		
		while (contador <= numero ){
		acumuladorfact = numero * contador;
		contador++;
		
	}
	System.out.println("Factorial de " + numero + " vale " +  acumuladorfact);
	}	





}
