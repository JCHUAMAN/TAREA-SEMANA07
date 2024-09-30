/*
crear un programa que contabilice cuantas veces se a ingresado un numero en un rango de 1 a 20
 */
package Progama;
import java.util.Scanner;
public class Programa03 {
     //entrada de datos
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] frecuencia = new int[21];  
        int number;
        //proceso de datos
        do {
            System.out.print("Introduce un numero del 1 al 20 (0 para terminar): ");
            number = scanner.nextInt();

            if (number >= 1 && number <= 20) {
                frecuencia[number]++;
            }

        } while (number != 0);
        //salida de datos
        System.out.println("Frecuencia de números:");
        for (int i = 1; i < frecuencia.length; i++) {
            System.out.println(i + ": " + frecuencia[i] + " veces");
        }

    }
}

