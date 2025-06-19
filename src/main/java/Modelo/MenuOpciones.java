package Modelo;

import java.util.Scanner;

public class MenuOpciones {
    private Scanner scanner = new Scanner(System.in);
    private final String nombre;
    private final String[]  opciones;
    private final int cantidadOpciones;
    private final int largoMaximo;

    public MenuOpciones(String nombre, String[] opciones){
        this.nombre = nombre;
        this.opciones = opciones;
        cantidadOpciones = opciones.length;
        largoMaximo = largoMaximoOpcion()*2;
    }

    private int largoMaximoOpcion(){
        int maximo = nombre.length();
        String opcion;

        for (int i = 0; i < cantidadOpciones ; i++) {
           opcion = i+1+") "+ opciones[i];
           if (opcion.length() > maximo) maximo = opcion.length();
        }

        if (maximo%2 != 0) return maximo+1;

        return maximo+2;
    }

    public void mostrarOpciones() {
        System.out.println("\n"+"=".repeat(largoMaximo)+"\n");
        System.out.println(" ".repeat((largoMaximo-nombre.length())/2)+nombre);
        System.out.println("\n"+"=".repeat(largoMaximo)+"\n");
        for (int i = 0; i < cantidadOpciones ; i++) {
            System.out.println(i+1+") "+ opciones[i]);
        }
        System.out.println("\n"+"=".repeat(largoMaximo)+"\n");
    }

    public int obtenerOpcion() {
        String scannerString;
        int opcion;

        System.out.println("Elija su opcion:");
        scannerString = scanner.next();

        try {
            opcion = Integer.parseInt(scannerString);
        } catch (NumberFormatException nfe){
            opcion = 0;
            System.out.println("Ingreso una opcion no valida");
        }

        return opcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombreOpcion(int indice){
        try {
            return opciones[indice-1];
        } catch (ArrayIndexOutOfBoundsException aie){
            System.out.println("Error: "+aie);
        }
        return "";
    }

    public int getCantidadOpciones() {
        return cantidadOpciones;
    }
}
