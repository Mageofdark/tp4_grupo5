package ar.edu.unju.escmi.tp4.ejercicio2;

public class Empleado {
    private String dni;
    private String nombre;
    private String apellido;
    private double sueldo;
    private char categoria;

    //Este es el constructor parametrizado
    public Empleado(String dni, String nombre, String apellido, double sueldo, char categoria){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
        this.categoria = categoria;
    }
    //Esto son los getters
    public String getdni() {return dni; }
    public String getnombre() {return nombre; }
    public String getapellido() {return apellido; }
    public double getsueldo() {return sueldo; }
    public char getcategoria() {return categoria; }

    @Override
    public String toString() {
        return "Empleado [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", sueldo=" + sueldo + ", categoria=" + categoria + "]";
    }
}
