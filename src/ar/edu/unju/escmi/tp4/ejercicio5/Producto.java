package ar.edu.unju.escmi.tp4.ejercicio5;

import java.time.LocalDate;

public class Producto {
    private int codigo;
    private String descripcion;
    private double precio;
    private LocalDate fechaVencimiento;


    public Producto(int codigo, String descripcion, double precio, LocalDate fechaVencimiento) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }   

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public void mostrarclave(){
        System.out.println("----------------------------------");
        System.out.println("Codigo: "+ codigo);
    }

    public void mostrarvalor(){
        System.out.println("Precio: "+ precio);
        System.out.println("----------------------------------");
    }
}
