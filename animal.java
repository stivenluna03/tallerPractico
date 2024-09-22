// Clase abstracta Animal
abstract class Animal {
    public abstract void hacerSonido();
}

// Clase Perro que extiende Animal
class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Guau");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal perro = new Perro();
        perro.hacerSonido();  // Output: Guau
    }
}
