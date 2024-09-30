/*
Crear un Programa que permita el ingreso de numeros positivo,
negativos y para finalizar el programa se ingrese el numero 0.
el resultado realizara el conteo de cuantos numeros son positivos y negativos.
*/
package Progama;
import  java.util.Scanner;
public class Programa01 {
     public static void main(String[] args) {
         //Declaración de variables
        Scanner scanner = new Scanner(System.in);
        int numero, positivos = 0, negativos = 0, ceros = 0;
        //proceso de datos
        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = scanner.nextInt();
            
            if (numero > 0) positivos++;
            else if (numero < 0) negativos++;
            else ceros++;
        } while (numero != 0);
        //Salida de datos
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
    }
}
    

