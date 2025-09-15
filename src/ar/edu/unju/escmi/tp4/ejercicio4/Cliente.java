package ar.edu.unju.escmi.tp4.ejercicio4;

public class Cliente {
    private int dni;
    private String nombre;
    private String tipo_cliente;

    public Cliente (int dni, String nombre, String tipo_cliente){
        this.dni = dni;
        this.nombre = nombre;
        this.tipo_cliente = tipo_cliente;
    }
    
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo_cliente() {
        return tipo_cliente;
    }

    public void setTipo_cliente(String tipo_cliente) {
        this.tipo_cliente = tipo_cliente;
    }

    public void mostrarDatos(){
        System.out.println("----------------------------------");
        System.out.println("DNI: "+ dni);
        System.out.println("Nombre: "+ nombre);
        System.out.println("Tipo de cliente: "+ tipo_cliente);
    }

}
