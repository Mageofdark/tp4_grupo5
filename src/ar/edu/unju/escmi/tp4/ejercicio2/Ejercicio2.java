package ar.edu.unju.escmi.tp4.ejercicio2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Empleado> empleados = new HashMap<>();
        int opcion;

        do {
            System.out.println("\n--- MENU EMPLEADOS ---");
            System.out.println("1 - Alta de empleado");
            System.out.println("2 - Mostrar empleados");
            System.out.println("3 - Eliminar empleado");
            System.out.println("4 - Consultar empleado");
            System.out.println("5 - Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Esto va a limpiar el buffer para que no se vea tan feito

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el DNI: ");
                    String dni = sc.nextLine();
                    System.out.print("Ingrese su nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese su apellido: ");
                    String apellido = sc.nextLine();
                    System.out.print("Ingrese el sueldo: ");
                    double sueldo = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Ingrese la categoria: ");
                    char categoria = sc.nextLine().charAt(0);

                    String clave = dni + categoria;
                    Empleado emp = new Empleado(dni, nombre, apellido, sueldo, categoria);
                    empleados.put(clave, emp);
                    System.out.println("Empleado agregado con la clave: " + clave);
                    break;

                case 2:
                    Iterator<Map.Entry<String, Empleado>> it = empleados.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry<String, Empleado> entry = it.next();
                        System.out.println("Clave: " + entry.getKey() + " => " + entry.getValue());
                    }
                    break;

                case 3:
                    System.out.print("Ingrese la clave del empleado a eliminar: ");
                    String claveEliminar = sc.nextLine();
                    if (empleados.containsKey(claveEliminar)) {
                        empleados.remove(claveEliminar);
                        System.out.println("Empleado eliminado.");
                    } else {
                        System.out.println("No existe la clave insertada.");
                    }
                    break;

                case 4:
                    System.out.print("Ingrese la clave del empleado a consultar: ");
                    String claveConsultar = sc.nextLine();
                    if (empleados.containsKey(claveConsultar)) {
                        System.out.println("Datos: " + empleados.get(claveConsultar));
                    } else {
                        System.out.println("No existe esa clave.");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida (su opcion no esta dentro de las opciones sugeridas).");
            }
        } while (opcion != 5);

        sc.close();
    }
}
