package proyecto;

public class pruebaVolumen {
    
    public static void main(String[] args) {
        
        int res;
        
        Caja caja2 = new Caja();
        caja2.ancho = 2;
        caja2.alto = 4;
        caja2.profundo = 1;
        res = caja2.calcularVolumen();
        System.out.println("resultado del primer volumen = " + res);
        
        Caja caja1 = new Caja(5,2,2);
        res = caja1.calcularVolumen();
        System.out.println("resultado del volumen = " + res);
    }
}
