import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Concesionaria luxor = new Concesionaria("Luxor Motors");
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n=========  SISTEMA LUXOR MOTORS =========");
            System.out.println("1️  Registrar vehículo");
            System.out.println("2️  Agendar prueba de manejo");
            System.out.println("3️  Verificar stock");
            System.out.println("4️  Realizar venta");
            System.out.println("5️ Ver ventas realizadas");
            System.out.println("0️  Salir");
            System.out.print(" Elige una opción: ");

            int opcion;
            try {
                opcion = sc.nextInt();
                sc.nextLine(); // limpiar buffer
            } catch (Exception e) {
                System.out.println(" Entrada inválida. Ingresa un número.");
                sc.nextLine();
                continue;
            }

            switch (opcion) {
                case 1:
                    
                    System.out.print("Marca: ");
                    String marca = sc.nextLine();
                    System.out.print("Modelo: ");
                    String modelo = sc.nextLine();
                    System.out.print("Año: ");
                    int anio = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Color: ");
                    String color = sc.nextLine();
                    System.out.print("Precio: ");
                    double precio = sc.nextDouble();
                    sc.nextLine();

                    Vehiculo nuevo = new Vehiculo(marca, modelo, anio, color, precio);
                    luxor.registrarVehiculo(nuevo);
                    break;

                case 2:
                    
                    System.out.print("Nombre del cliente: ");
                    String nombreCliente = sc.nextLine();
                    System.out.print("DNI del cliente: ");
                    String dni = sc.nextLine();
                    System.out.print("Teléfono: ");
                    String telefono = sc.nextLine();
                    System.out.print("Correo: ");
                    String correo = sc.nextLine();

                    Cliente cliente = new Cliente(nombreCliente, dni, telefono, correo);
                    luxor.registrarCliente(cliente);

                    luxor.mostrarVehiculosDisponibles();
                    System.out.print("Elige el número del vehículo para la prueba (comenzando en 0): ");
                    int vehiculoIndex = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Fecha (dd/mm/aaaa): ");
                    String fecha = sc.nextLine();
                    System.out.print("Hora (HH:mm): ");
                    String hora = sc.nextLine();

                    PruebaDeManejo prueba = new PruebaDeManejo(cliente, luxor.getListaVehiculos().get(vehiculoIndex), fecha, hora);
                    luxor.agendarPrueba(prueba);
                    break;

                case 3:
                    
                    luxor.mostrarVehiculosDisponibles();
                    break;

                case 4:
                   
                    luxor.mostrarVehiculosDisponibles();
                    System.out.print("Ingresa el número del vehículo a vender (comenzando en 0): ");
                    int indice = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nombre del cliente: ");
                    String nomC = sc.nextLine();
                    System.out.print("DNI del cliente: ");
                    String dniC = sc.nextLine();
                    System.out.print("Teléfono: ");
                    String telC = sc.nextLine();
                    System.out.print("Correo: ");
                    String correoC = sc.nextLine();

                    Cliente clienteVenta = new Cliente(nomC, dniC, telC, correoC);
                    luxor.registrarCliente(clienteVenta);

                    Venta venta = new Venta(luxor.getListaVentas().size() + 1, clienteVenta,
                            luxor.getListaVehiculos().get(indice), "Hoy");
                    luxor.realizarVenta(venta);
                    break;

                case 5:
                    
                    if (luxor.getListaVentas().isEmpty()) {
                        System.out.println(" No hay ventas registradas aún.");
                    } else {
                        System.out.println("\n Ventas realizadas:");
                        for (Venta v : luxor.getListaVentas()) {
                            v.generarRecibo();
                        }
                    }
                    break;

                case 0:
                    System.out.println(" Cerrando sistema...");
                    continuar = false;
                    continue;

                default:
                    System.out.println(" Opción no válida.");
                    break;
            }

            
            if (opcion != 0) {
                System.out.print("\n¿Deseas realizar otra acción? (S/N): ");
                String respuesta = sc.nextLine();
                if (!respuesta.equalsIgnoreCase("S")) {
                    System.out.println(" Cerrando sistema...");
                    continuar = false;
                }
            }
        }

        sc.close();
    }
}
