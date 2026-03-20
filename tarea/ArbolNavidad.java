public class ArbolNavidad {
    private int altura;
    private String color;
    private int cantidadLuces;
    private boolean tieneEstrella;
    private String tipo;

    public ArbolNavidad(int altura, String color, int cantidadLuces, boolean tieneEstrella, String tipo) {
        this.altura = altura;
        this.color = color;
        this.cantidadLuces = cantidadLuces;
        this.tieneEstrella = tieneEstrella;
        this.tipo = tipo;
    }

    public ArbolNavidad() {
        this(150, "Verde", 50, true, "Natural");
    }

    // Métodos
    public void encenderLuces() {
        System.out.println("Luces encendidas");
    }

    public void apagarLuces() {
        System.out.println("Luces apagadas");
    }

    public void decorar() {
        System.out.println("Árbol decorado");
    }

    public void mostrarInfo() {
        System.out.println("Árbol de " + altura + " cm");
    }

    public int agregarLuces(int extra) {
        return cantidadLuces + extra;
    }

    public int getAltura() {
        return altura;
    }
}   

