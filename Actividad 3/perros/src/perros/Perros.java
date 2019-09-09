package perros;

public class Perros {

    private final String nombre;
    private final String raza;
    private final String localidad;
    private final String dueño;
    private final String cedula;
    private final String tel;
    private final String fecha;

    //Metodos u operaciones
    //Constructor
    public Perros(String nombre, String raza, String localidad, String dueño, String cedula, String tel, String fecha) {
        this.nombre = nombre;
        this.raza = raza;
        this.localidad = localidad;
        this.dueño = dueño;
        this.cedula = cedula;
        this.tel = tel;
        this.fecha = fecha;

    }

    //Analizadores
    public String darnombre() {
        return this.nombre;
    }

    public String darraza() {
        return this.raza;
    }

    public String darlocalidad() {
        return this.localidad;
    }

    public String dardueño() {
        return this.dueño;
    }

    public String darcedula() {
        return this.cedula;
    }

    public String dartel() {
        return this.tel;
    }

    public String darfecha() {
        return this.fecha;
    }

}
