/*
se crea un programa que califique las 03 visita a un local  mostrara el promedio de las calificaciones
 */
package Progama;
import java.util.Scanner;
public class Programa02 {
        //entrada de datos
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opinion1, opinion2, opinion3;
        int excelente = 0, bueno = 0, regular = 0, malo = 0;
        int i = 1;
        
        do {
            System.out.println("Califique la Atención en su Visita" + i + ": (1=Excelente, 2=Bueno, 3=Regular, 4=Malo)");
            int opinion = scanner.nextInt();
            
            // Validar que la opinión ingresada sea entre 1 y 4
            while (opinion < 1 || opinion > 4) {
                System.out.println("Por favor, ingrese una calificación válida (1=Excelente, 2=Bueno, 3=Regular, 4=Malo):");
                opinion = scanner.nextInt();
            }
            
            // Contador de las opiniones
            switch (opinion) {
                case 1: excelente++; break;
                case 2: bueno++; break;
                case 3: regular++; break;
                case 4: malo++; break;
            }
            i++;
        } while (i <= 3); 
        
        // Mostrar el resumen de opiniones
        System.out.println("\nResumen de Calificaciones para las 3 Visitas:");
        System.out.println("Excelente: " + excelente);
        System.out.println("Bueno: " + bueno);
        System.out.println("Regular: " + regular);
        System.out.println("Malo: " + malo);
    }
}
