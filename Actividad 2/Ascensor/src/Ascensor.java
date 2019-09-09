
//Permite tomar los atributos de la clase Ascensor.
public class Ascensor {

    public static void main(String[] args) {
        // Atributos del Ascensor
    private final int Pisos;

    private final int Sotanos;

    // MÃ©todos u operaciones
    // Constructor
    public Ascensor(int Pisos, int Sotanos) {

        this.Pisos = Pisos;

        this.Sotanos = Sotanos;

    }

    // Analizadores
    public int darPisos() {

        return this.Pisos;

    }

    public int darSotanos() {

        return this.Sotanos;

    }
}
}
