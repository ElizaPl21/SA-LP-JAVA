package org.generation.ejerciciosLogica;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {	
        HashMap<String, String> diccionario = new HashMap<String, String>();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa una palabra en español: ");
        String palabra = scanner.nextLine();
        
        diccionario.put("manzana", "apple");
        diccionario.put("plátano", "banana");
        diccionario.put("mora", "blackberry");
        diccionario.put("arándano", "blueberry");
        diccionario.put("cereza", "cherry");
        diccionario.put("coco", "coconut");
        diccionario.put("higo", "fig");
        diccionario.put("uva", "grape");
        diccionario.put("lima", "lime");
        diccionario.put("naranja", "orange");
        diccionario.put("pera", "pear");
        diccionario.put("ajo", "garlic");
        diccionario.put("cebolla", "onion");
        diccionario.put("pimiento", "pepper");
        diccionario.put("pepino", "pickle");
        diccionario.put("calabaza", "pumpkin");
        diccionario.put("arroz", "ricce");
        diccionario.put("tomate", "tomato");
        diccionario.put("zanahoria", "carrot");
        diccionario.put("apio", "celery");

        String traduccion = diccionario.get(palabra);

        if (diccionario.containsKey(palabra)) {
            System.out.println("La traducción al inglés de " + palabra + " es: " + traduccion);
        } else {
            System.out.println("La palabra no se encuentra en el diccionario.");
        }
        
        scanner.close();
    }

}
