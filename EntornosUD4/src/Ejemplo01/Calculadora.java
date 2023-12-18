package Ejemplo01;

	/**
	 * Clase que implementa una calculadora de números reales.
	 * 
	 * @author Lucas Falla Urtiaga.
	 * @version 1.0
	 */

public class Calculadora {

	/**  
	 * Este método calcula el resultado de la suma de los números a y b.
	 * @since v1.0
	 * @deprecated
	 * @param a es el primer operando (decimal o entero).
	 * @param b es el segundo operando (decimal o entero).
	 * @return Suma de ambos números.
	 */
	
	public double sumar (double a, double b) {
		
		return a+b;
	}
	
	/**
	 * Este método calcula el resultado de la resta de los números a y b.
	 * @param a es el primer operando (decimal o entero).
	 * @param b es el segundo operando (decimal o entero).
	 * @return Resta de ambos números.
	 */
	
	public double restar (double a, double b) {
		
		return a-b;
	}
	
	/**
	 * Este método calcula el resultado de la multiplicación de los números a y b.
	 * @param a es el primer operando (decimal o entero).
	 * @param b es el segundo operando (decimal o entero).
	 * @return Multiplicación de ambos números.
	 */
	
	public double multiplicar (double a, double b) {
		
		return a*b;
	}
	
}
