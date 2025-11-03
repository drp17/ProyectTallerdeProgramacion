public class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    private String color;
    private double precio;
    private boolean disponible;

    public Vehiculo(String marca, String modelo, int anio, String color, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
        this.precio = precio;
        this.disponible = true;
    }

    public void mostrarDetalles() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Año: " + anio +
                           ", Color: " + color + ", Precio: $" + precio +
                           ", Disponible: " + (disponible ? "Sí" : "No"));
    }

    public void marcarComoVendido() {
        this.disponible = false;
        System.out.println(" El vehículo " + modelo + " (" + color + ") ha sido vendido.");
    }

    // Getters
    public boolean isDisponible() { return disponible; }
    public String getColor() { return color; }
    public String getModelo() { return modelo; }
    public double getPrecio() { return precio; }
}
