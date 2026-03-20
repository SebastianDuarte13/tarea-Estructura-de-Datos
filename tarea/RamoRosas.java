public class RamoRosas {
    private int cantidadRosas;
    private String color;
    private boolean tienePapel;
    private double precio;
    private ArbolNavidad arbol;

    public RamoRosas(int cantidadRosas, String color, boolean tienePapel, double precio, ArbolNavidad arbol) {
        this.cantidadRosas = cantidadRosas;
        this.color = color;
        this.tienePapel = tienePapel;
        this.precio = precio;
        this.arbol = arbol;
    }

    public RamoRosas() {
        this(2, "Rojo", true, 15000, new ArbolNavidad());
    }

    // Métodos
    public void regalar() {
        System.out.println("Regalando ramo de rosas");
    }

    public void oler() {
        System.out.println("Las rosas huelen bien");
    }

    public void mostrarInfo() {
        System.out.println("Ramo de " + cantidadRosas + " rosas");
    }

    public double aumentarPrecio(double aumento) {
        return precio + aumento;
    }

    public void decorarConArbol() {
        arbol.decorar();
    }

   public int getCantidadRosas() {
    return cantidadRosas;
    }
}