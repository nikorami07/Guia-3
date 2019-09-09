package empleado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private static final List<Empleado> bd = new ArrayList<>();
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("¡Bienvenido al gestor de colaboradores!");
        System.out.println("Digite la opción que desea realizar...");
        int opcion;

        do {
            System.out.println("1. Crear nuevo empleado");
            System.out.println("2. Mostrar empleados");
            System.out.println("3. Buscar empleados");
            System.out.println("0. Salir");
            System.out.println("Entre su opción => ");
            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:
                    NuevoEmpleado();
                    break;
                case 2:
                    MostrarEmpleados();
                    break;
                case 3:
                    BuscarEmpleado();
                    break;
            }

        } while (opcion != 0);

    }

    private static void NuevoEmpleado() {

        String nombre, departamento, posición, salario;
        teclado.nextLine();
        System.out.println("Escriba el nombre del empleado: ");
        nombre = teclado.nextLine();
        System.out.println("Escriba el departamento del cual hace parte el empleado: ");
        departamento = teclado.nextLine();
        System.out.println("Escriba la posición o cargo del empleado: ");
        posición = teclado.nextLine();
        System.out.println("Escriba el salario del empleado: ");
        salario = teclado.nextLine();

        Empleado colaborador = new Empleado(nombre, departamento, posición, salario);
        bd.add(colaborador);

        System.out.println("La base de datos tiene " + bd.size() + " empleados");

    }

    static void MostrarEmpleados() {
        for (int i = 0; i < bd.size(); ++i) {
            Empleado colaborador = bd.get(i);
            System.out.println("Colaborador " + i);
            System.out.println("Nombre: " + colaborador.darnombre());
            System.out.println("Departamento: " + colaborador.dardepartamento());
            System.out.println("Cargo: " + colaborador.darposición());
            System.out.println("Salario: " + colaborador.darsalario());
            System.out.println("------------------------------------------");

        }

    }

    static void BuscarEmpleado() {
        String nombreEmpleado;
        teclado.nextLine();
        System.out.print("Digite el nombre del colaborador:  ");
        nombreEmpleado = teclado.nextLine();

        for (Empleado colaborador : bd) {
            if (colaborador.darnombre().equalsIgnoreCase(nombreEmpleado)) {
                System.out.println("Nombre: " + colaborador.darnombre());
                System.out.println("Departamento: " + colaborador.dardepartamento());
                System.out.println("Cargo: " + colaborador.darposición());
                System.out.println("Salario: " + colaborador.darsalario());
            } else if (colaborador.darnombre() != nombreEmpleado) {
            } else {
                System.out.print("Ese colaborador no esta registrado.");
            }
        }
    }

}
