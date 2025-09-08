package empaquetadora;

import java.util.Scanner;

class Paquete {
    private String[] elementos;
    private int contador;
    private int capacidad;

    public Paquete(int capacidad) {
        this.capacidad = capacidad;
        this.elementos = new String[capacidad];
        this.contador = 0;
    }

    public void agregarElemento(String elemento) {
        if (contador < capacidad) {
            elementos[contador] = elemento;
            contador++;
        }
    }

    public boolean estaLleno() {
        return contador == capacidad;
    }

    public void mostrarPaquete(int numero, String nombreConjunto) {
        System.out.println("=== Paquete " + numero + " de " + nombreConjunto + " ===");
        for (int i = 0; i < elementos.length; i++) {
            System.out.println("- " + elementos[i]);
        }
    }
}
