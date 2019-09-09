package empleado;

public class Empleado {

    private final String nombre;
    private final String departamento;
    private final String posición;
    private final String salario;

    //Metodos u operaciones
    //Constructor
    public Empleado(String nombre, String departamento, String posición, String salario) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.posición = posición;
        this.salario = salario;

    }

    //Analizadores
    public String darnombre() {
        return this.nombre;
    }

    public String dardepartamento() {
        return this.departamento;
    }

    public String darposición() {
        return this.posición;
    }

    public String darsalario() {
        return this.salario;
    }

}
