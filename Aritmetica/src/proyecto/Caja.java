package proyecto;

public class Caja {
    int ancho, alto, profundo;
    
    public Caja() {
        System.out.println("Ejecutando constructor");
    }
    
    public Caja(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
        System.out.println("Ejecutando constructor con argumentos");
    }
    
    public int calcularVolumen() {
        return this.ancho * this.alto * this.profundo;
    }
}
