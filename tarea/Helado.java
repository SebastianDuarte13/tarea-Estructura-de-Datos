public class Helado {
    private String sabor;
    private int numeroBolas;
    private String tipoCono;
    private boolean tieneChispas;
    private double precio;

    // Constructor
    public Helado(String sabor, int numeroBolas, String tipoCono, boolean tieneChispas, double precio) {
        this.sabor = sabor;
        this.numeroBolas = numeroBolas;
        this.tipoCono = tipoCono;
        this.tieneChispas = tieneChispas;
        this.precio = precio;
    }

    // Sobrecarga de constructor
    public Helado(String sabor) {
        this.sabor = sabor;
        this.numeroBolas = 1;
        this.tipoCono = "Normal";
        this.tieneChispas = false;
        this.precio = 2000;
    }

    // Getters y Setters
    public String getSabor() { return sabor; }
    public void setSabor(String sabor) { this.sabor = sabor; }

    public int getNumeroBolas() { return numeroBolas; }
    public void setNumeroBolas(int numeroBolas) { this.numeroBolas = numeroBolas; }

    public String getTipoCono() { return tipoCono; }
    public void setTipoCono(String tipoCono) { this.tipoCono = tipoCono; }

    public boolean isTieneChispas() { return tieneChispas; }
    public void setTieneChispas(boolean tieneChispas) { this.tieneChispas = tieneChispas; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    // Métodos
    public void comer() {
        System.out.println("Comiendo el helado de " + sabor);
    }

    public void derretir() {
        System.out.println("El helado se está derritiendo");
    }

    public void mostrarInfo() {
        System.out.println("Helado: " + sabor + ", precio: " + precio);
    }

    public double calcularDescuento(double porcentaje) {
        return precio - (precio * porcentaje);
    }

    // Sobrecarga de método
    public double calcularDescuento() {
        return precio * 0.9;
    }
}