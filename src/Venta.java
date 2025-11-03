public class Venta {
    private int idVenta;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private String fecha;
    private double montoTotal;

    public Venta(int idVenta, Cliente cliente, Vehiculo vehiculo, String fecha) {
        this.idVenta = idVenta;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.fecha = fecha;
        this.montoTotal = vehiculo.getPrecio(); // monto igual al precio del vehículo
        vehiculo.marcarComoVendido(); // automáticamente marca el vehículo como vendido
    }

    public void generarRecibo() {
        System.out.println("\n--- RECIBO DE VENTA ---");
        System.out.println("ID Venta: " + idVenta);
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Vehículo: " + vehiculo.getModelo() + " (" + vehiculo.getColor() + ")");
        System.out.println("Fecha: " + fecha);
        System.out.println("Monto total: $" + montoTotal);
        System.out.println("----------------------\n");
    }
}
