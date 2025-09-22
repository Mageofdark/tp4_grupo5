package ar.edu.unju.escmi.tp4.ejercicio3;

public class Paciente implements Comparable<Paciente> {
    private int dni;
    private String nombre;
    private String apellido;
    private int numHC;
    private String obraSocial;

    public Paciente() {}

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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public int getNumHC() {
        return numHC;
    }

    public void setNumHC(int numHC) {
        this.numHC = numHC;
    }

    public String getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(String obraSocial) {
        this.obraSocial = obraSocial;
    }

    @Override
    public int compareTo(Paciente otroPaciente) {
        return Integer.compare(this.numHC, otroPaciente.getNumHC());
        
    }

    @Override
    public String toString(){
        return "Paciente{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", numHC=" + numHC +
                ", obraSocial='" + obraSocial + '\'' +
                '}';
    }
}
