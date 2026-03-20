public class Main {
    public static void main(String[] args) {

        Helado h1 = new Helado("Chocolate", 2, "Barquillo", true, 5000);
        NinoBicicleta n1 = new NinoBicicleta("Juan", 12, "Azul", 10, true);
        RamoRosas r1 = new RamoRosas();
        ArbolNavidad a1 = new ArbolNavidad(120, "Verde", 10, false, "Navidad");
        Robot robot1 = new Robot("R2D2", "Asistente", 80, false, 9);

       
        System.out.println("""
                INTEGRANTES DE GRUPO
                
                -Maria alejandra Suarez
                -Juan David Giraldo
                -Johan Sebastian Duarte 
                -Johan Sebastian Valderrama
                -Sergio Andres Carrillo
                 
            """);
        System.out.println("Sabor helado: " + h1.getSabor());
        System.out.println("Nombre niño: " + n1.getNombre());
        System.out.println("Cantidad rosas: " + r1.getCantidadRosas());
        System.out.println("Altura árbol: " + a1.getAltura());
        System.out.println("Nombre robot: " + robot1.getNombre());

        System.out.println("\n--- Métodos ---");

        h1.comer();
        n1.pedalear();
        r1.regalar();
        a1.decorar();
        robot1.encender();
    }
}