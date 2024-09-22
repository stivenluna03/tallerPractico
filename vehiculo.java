
class Vehiculo {
    public void mover() {
        System.out.println("El vehículo se mueve.");
    }
}

// Clase Avion que sobrescribe el método mover
class Avion extends Vehiculo {
    @Override
    public void mover() {
        System.out.println("El avión vuela.");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Avion();  // Polimorfismo
        vehiculo.mover();  // Output: El avión vuela.
    }
}
