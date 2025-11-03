import java.util.ArrayList;

public class Concesionaria {
    private String nombre;
    private ArrayList<Vehiculo> listaVehiculos;
    private ArrayList<Cliente> listaClientes;
    private ArrayList<Venta> listaVentas;
    private ArrayList<PruebaDeManejo> listaPruebas;

    public Concesionaria(String nombre) {
        this.nombre = nombre;
        listaVehiculos = new ArrayList<>();
        listaClientes = new ArrayList<>();
        listaVentas = new ArrayList<>();
        listaPruebas = new ArrayList<>();
    }

    // Vehículos
    public void registrarVehiculo(Vehiculo v) {
        listaVehiculos.add(v);
        System.out.println(" Vehículo registrado: " + v.getModelo() + " (" + v.getColor() + ")");
    }

    public void mostrarVehiculosDisponibles() {
        System.out.println("\n Vehículos disponibles:");
        for (Vehiculo v : listaVehiculos) {
            if (v.isDisponible()) {
                v.mostrarDetalles();
            }
        }
    }

    // Clientes
    public void registrarCliente(Cliente c) {
        listaClientes.add(c);
        System.out.println(" Cliente registrado: " + c.getNombre());
    }

    // Ventas
    public void realizarVenta(Venta v) {
        listaVentas.add(v);
        System.out.println(" Venta realizada con éxito!");
        v.generarRecibo();
    }

    // Pruebas de manejo
    public void agendarPrueba(PruebaDeManejo p) {
        listaPruebas.add(p);
        p.agendar();
    }

    // Getters
    public ArrayList<Vehiculo> getListaVehiculos() { return listaVehiculos; }
    public ArrayList<Cliente> getListaClientes() { return listaClientes; }
    public ArrayList<Venta> getListaVentas() { return listaVentas; }
    public ArrayList<PruebaDeManejo> getListaPruebas() { return listaPruebas; }
}
