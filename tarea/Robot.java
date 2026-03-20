public class Robot {
    private String nombre;
    private String tipo;
    private int bateria;
    private boolean encendido;
    private int nivelInteligencia;

    // Constructor
    public Robot(String nombre, String tipo, int bateria, boolean encendido, int nivelInteligencia) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.bateria = bateria;
        this.encendido = encendido;
        this.nivelInteligencia = nivelInteligencia;
    }

    // Sobrecarga
    public Robot(String nombre) {
        this(nombre, "Domestico", 100, false, 5);
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public int getBateria() { return bateria; }
    public void setBateria(int bateria) { this.bateria = bateria; }

    public boolean isEncendido() { return encendido; }
    public void setEncendido(boolean encendido) { this.encendido = encendido; }

    public int getNivelInteligencia() { return nivelInteligencia; }
    public void setNivelInteligencia(int nivelInteligencia) { this.nivelInteligencia = nivelInteligencia; }

    // Métodos
    public void encender() {
        encendido = true;
        System.out.println(nombre + " encendido");
    }

    public void apagar() {
        encendido = false;
        System.out.println(nombre + " apagado");
    }

    public void cargar() {
        bateria = 100;
        System.out.println("Batería cargada");
    }

    public void trabajar() {
        bateria -= 10;
        System.out.println(nombre + " está trabajando");
    }

    public void mostrarInfo() {
        System.out.println("Robot: " + nombre + ", batería: " + bateria);
    }

    // Sobrecarga
    public void trabajar(int consumo) {
        bateria -= consumo;
    }
}
