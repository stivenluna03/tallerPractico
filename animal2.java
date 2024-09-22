// Clase Animal
class Animal {
    protected String sonido = "Sonido de animal";
    
    public void hacerSonido() {
        System.out.println(sonido);
    }
}

// Clase Gato que extiende Animal
class Gato extends Animal {
    public Gato() {
        super.sonido = "Miau";
    }

    @Override
    public void hacerSonido() {
        super.hacerSonido();  // Llama al método de la clase padre
        System.out.println("El gato maúlla.");
    }
}

public class Main {
    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.hacerSonido();  // Output: Miau \n El gato maúlla.
    }
}

