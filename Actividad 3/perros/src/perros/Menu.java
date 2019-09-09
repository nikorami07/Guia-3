package perros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private static List<Perros> bd = new ArrayList<>();
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion;

        do {
            System.out.println("1. Crear perro");
            System.out.println("2. Mostrar perros");
            System.out.println("0. Salir");
            System.out.println("Entre su opción => ");
            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:
                    NuevoPerros();
                    break;
                case 2:
                    MostrarPerros();
                    break;
            }

        } while (opcion != 0);

    }

    private static void NuevoPerros() {

        String nombre, raza, localidad, cedula, dueño, telefono, fecha;
        teclado.nextLine();
        System.out.println("Escriba el nombre del perro: ");
        nombre = teclado.nextLine();
        System.out.println("Escriba la raza del perro: ");
        raza = teclado.nextLine();
        System.out.println("Escriba la localidad del perro: ");
        localidad = teclado.nextLine();
        System.out.println("Escriba la Cedula del Dueño: ");
        cedula = teclado.nextLine();
        System.out.println("Escriba el nombre del dueño: ");
        dueño = teclado.nextLine();
        System.out.println("Escriba el numero de telefono del dueño: ");
        telefono = teclado.nextLine();
        System.out.println("Escriba la fecha de asistencia del perro (Dia/mes/año): ");
        fecha = teclado.nextLine();

        Perros caninos = new Perros(nombre, raza, localidad, cedula, dueño, telefono, fecha);
        bd.add(caninos);

        System.out.println("La base de datos tiene " + bd.size() + " Perros");

    }

    static void MostrarPerros() {
        for (int i = 1; i < bd.size(); ++i) {
            Perros caninos = bd.get(i);
            System.out.println("Perro " + i);
            System.out.println("Nombre: " + caninos.darnombre());
            System.out.println("Raza: " + caninos.darraza());
            System.out.println("Localidad: " + caninos.darlocalidad());
            System.out.println("Cadula del Dueño: " + caninos.darcedula());
            System.out.println("Nombre del Dueño: " + caninos.dardueño());
            System.out.println("Numero de telefono del Dueño: " + caninos.dartel());
            System.out.println("Fecha de asistencia: " + caninos.darfecha());
            System.out.println("------------------------------------------");

        }

    }
}
