package empaquetadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del conjunto a empaquetar: ");
        String nombreConjunto = sc.nextLine();

        System.out.print("Cuantos elementos por paquete? ");
        int capacidad = sc.nextInt();

        System.out.print("Cuantos paquetes desea armar? ");
        int totalPaquetes = sc.nextInt();
        sc.nextLine(); 

        for (int p = 1; p <= totalPaquetes; p++) {
            Paquete paquete = new Paquete(capacidad);
            System.out.println("\n--- Llenando paquete " + p + " ---");

            for (int i = 0; i < capacidad; i++) {
                System.out.print("Ingrese nombre oreferencia del " + nombreConjunto + " " + (i + 1) + ": ");
                String ref = sc.nextLine();
                paquete.agregarElemento(ref);
            }

            if (paquete.estaLleno()) {
                paquete.mostrarPaquete(p, nombreConjunto);
                System.out.println("Paquete " + p + " COMPLETO \n");
            }
        }

        System.out.println("Proceso de empaquetado terminado.");
    }
}
