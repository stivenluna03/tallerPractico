// Clase abstracta Instrumento
abstract class Instrumento {
    public abstract void tocar();
}

// Interfaz Afinable
interface Afinable {
    void afinar();
}

// Clase Guitarra que extiende Instrumento e implementa Afinable
class Guitarra extends Instrumento implements Afinable {
    @Override
    public void tocar() {
        System.out.println("La guitarra está sonando.");
    }

    @Override
    public void afinar() {
        System.out.println("La guitarra está afinada.");
    }
}

public class Main {
    public static void main(String[] args) {
        Guitarra guitarra = new Guitarra();
        guitarra.tocar();  // Output: La guitarra está sonando.
        guitarra.afinar();  // Output: La guitarra está afinada.
    }
}
