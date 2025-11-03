public class PruebaDeManejo {
    private Cliente cliente;
    private Vehiculo vehiculo;
    private String fecha;
    private String hora;

    public PruebaDeManejo(Cliente cliente, Vehiculo vehiculo, String fecha, String hora) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.fecha = fecha;
        this.hora = hora;
    }

    public void agendar() {
        System.out.println(" Prueba de manejo agendada para " + cliente.getNombre() +
                           " con el vehículo " + vehiculo.getModelo() +
                           " (" + vehiculo.getColor() + ") el " + fecha + " a las " + hora);
    }

    public void cancelar() {
        System.out.println(" Prueba de manejo cancelada para " + cliente.getNombre());
    }

    // Getters
    public Vehiculo getVehiculo() { return vehiculo; }
    public Cliente getCliente() { return cliente; }
}
