public class Cliente {
    private String nombre;
    private String dni;
    private String telefono;
    private String correo;

    public Cliente(String nombre, String dni, String telefono, String correo) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.correo = correo;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", DNI: " + dni + ", Tel: " + telefono + ", Correo: " + correo);
    }

  
    public String getNombre() { 
        return nombre; 
    }
    public String getDni() { 
        return dni; 
    }
}
