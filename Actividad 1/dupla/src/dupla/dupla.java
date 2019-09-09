package dupla;


public class dupla {
// Datos miembro de la clase "dupla"

    private int a;
    private int b;
// Funciones miembro de la clase "dupla"

    public final void Lee(tangible.RefObject<Integer> a2, tangible.RefObject<Integer> b2) {
        a2.argValue = a;
        b2.argValue = b;
    }

    public final void Guarda(int a2, int b2) {
        a = a2;
        b = b2;
    }

    public static int Main() {
        dupla primerPar = new dupla();
        int x = 0;
        int y = 0;
        primerPar.Guarda(12, 32);
        tangible.RefObject<Integer> tempRef_x = new tangible.RefObject<Integer>(x);
        tangible.RefObject<Integer> tempRef_y = new tangible.RefObject<Integer>(y);
        primerPar.Lee(tempRef_x, tempRef_y);
        y = tempRef_y.argValue;
        x = tempRef_x.argValue;
        System.out.print("Valor de primerPar.a: ");
        System.out.print(x);
        System.out.print("\n");
        System.out.print("Valor de primerPar.b: ");
        System.out.print(y);
        System.out.print("\n");
        return 0;
    }
}
