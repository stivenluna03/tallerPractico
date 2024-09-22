// Clase final Constante
final class Constante {
    public final int valor = 42;

    public final void mostrarValor() {
        System.out.println("Valor: " + valor);
    }
}

// Clase Padre con un método protegido
class ClasePadre {
    protected void metodoProtegido() {
        System.out.println("Método protegido de ClasePadre.");
    }
}

// Clase Hija dentro del mismo paquete
class ClaseHija extends ClasePadre {
    public void usarMetodoProtegido() {
        metodoProtegido();
    }
}

public class Main {
    public static void main(String[] args) {
        ClaseHija hija = new ClaseHija();
        hija.usarMetodoProtegido();  // Output: Método protegido de ClasePadre.
    }
}
