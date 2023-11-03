package org.generation.ejerciciosLogica;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 int[] numeros = new int[10];
	        int[] resultado = new int[10];
	        int contador = 0;

	        for (int i = 0; i < 10; i++) {
	            System.out.print("Ingrese el número " + (i + 1) + ": ");
	            numeros[i] = scanner.nextInt();
	        }
        for (int i = 0; i < 10; i++) {
	            if (esPrimo(numeros[i])) {
	                resultado[contador] = numeros[i];
	                contador++;
	            }
	        }
	        for (int i = 0; i < 10; i++) {
	            if (!esPrimo(numeros[i])) {
	                resultado[contador] = numeros[i];
	                contador++;
	            }
	        }
	        System.out.println("Array original:");
	        for (int i = 0; i < 10; i++) {
	            System.out.println("Índice " + i + ": " + numeros[i]);
	        }

	        System.out.println("Array con números primos al principio:");
	        for (int i = 0; i < 10; i++) {
	            System.out.println("Índice " + i + ": " + resultado[i]);
	        
	            scanner.close();
	        }
	    }

	    public static boolean esPrimo(int numero) {
	        if (numero <= 1) {
	            return false;
	        }
	        if (numero <= 3) {
	            return true;
	        }
	        if (numero % 2 == 0 || numero % 3 == 0) {
	            return false;
	        }
	        for (int i = 5; i * i <= numero; i += 6) {
	            if (numero % i == 0 || numero % (i + 2) == 0) {
	                return false;
	            }
	        }
	        return true;
	     
	}

}
