public class NinoBicicleta {
    private String nombre;
    private int edad;
    private String colorBicicleta;
    private int velocidad;
    private boolean tieneCasco;

    public NinoBicicleta(String nombre, int edad, String colorBicicleta, int velocidad, boolean tieneCasco) {
        this.nombre = nombre;
        this.edad = edad;
        this.colorBicicleta = colorBicicleta;
        this.velocidad = velocidad;
        this.tieneCasco = tieneCasco;
    }

    // Sobrecarga
    public NinoBicicleta(String nombre) {
        this(nombre, 10, "Roja", 0, true);
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public String getColorBicicleta() { return colorBicicleta; }
    public void setColorBicicleta(String colorBicicleta) { this.colorBicicleta = colorBicicleta; }

    public int getVelocidad() { return velocidad; }
    public void setVelocidad(int velocidad) { this.velocidad = velocidad; }

    public boolean isTieneCasco() { return tieneCasco; }
    public void setTieneCasco(boolean tieneCasco) { this.tieneCasco = tieneCasco; }

    // Métodos
    public void pedalear() {
        velocidad += 5;
        System.out.println(nombre + " está pedaleando");
    }

    public void frenar() {
        velocidad = 0;
        System.out.println(nombre + " frenó");
    }

    public void hacerTruco() {
        System.out.println(nombre + " hizo un truco");
    }

    public void mostrarInfo() {
        System.out.println(nombre + " tiene una bici " + colorBicicleta);
    }

    // Sobrecarga
    public void pedalear(int incremento) {
        velocidad += incremento;
    }
}