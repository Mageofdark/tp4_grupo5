package ar.edu.unju.escmi.tp4.ejercicio5;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;
import java.util.Iterator;


public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer, Producto> productos = new TreeMap<>();
        char opcion;

        do {
            System.out.println("********** MENU **********");
            System.out.println("1- Alta de producto");
            System.out.println("2- Mostrar todos los productos");
            System.out.println("3- Buscar un producto");
            System.out.println("4- Eliminar un producto");
            System.out.println("5- Salir");
            System.out.print("- Elegir opcion: ");
            opcion = sc.nextLine().charAt(0);
            System.out.println("");

            switch (opcion) {
                case '1':
                while (true) {
                    try {
                        System.out.print("Ingrese el codigo del producto: ");
                        int codigo = sc.nextInt();
                        sc.nextLine();

                        if (productos.containsKey(codigo)) {
                            throw new IllegalArgumentException("Error: El codigo ya existe. Ingrese un codigo unico.");
                        }

                        System.out.print("Ingrese la descripcion del producto: ");
                        String descripcion = sc.nextLine();

                        System.out.print("Ingrese el precio del producto: ");
                        double precio = sc.nextDouble();
                        sc.nextLine();

                        System.out.print("Ingrese la fecha de vencimiento (YYYY-MM-DD): ");
                        String fechaVencimientoStr = sc.nextLine();
                        LocalDate fechaVencimiento = LocalDate.parse(fechaVencimientoStr);

                        Producto producto = new Producto(codigo, descripcion, precio, fechaVencimiento);
                        productos.put(codigo, producto);
                        System.out.println("Producto agregado exitosamente.");
                        System.out.println("");
                        break;
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                        sc.nextLine(); // Limpiar el buffer en caso de error
                    }
                    
                }
                    break;
                case '2':
                    if (productos.isEmpty()) {
                        System.out.println("No hay productos para mostrar.");
                    } else {
                        Iterator<Map.Entry<Integer, Producto>> iterator = productos.entrySet().iterator();
                        while (iterator.hasNext()) {
                            Map.Entry<Integer, Producto> entry = iterator.next();
                            entry.getValue().mostrarclave();
                            entry.getValue().mostrarvalor();
                        }
                        System.out.println("");
                    }
                    break;
                case '3':
                    if (productos.isEmpty()) {
                        System.out.println("No hay productos registrados.");
                    } else {
                        System.out.print("Ingrese el codigo del producto a buscar: ");
                        int codigoBuscar = sc.nextInt();
                        sc.nextLine();

                        Producto productoEncontrado = productos.get(codigoBuscar);
                        if (productoEncontrado != null) {
                            System.out.println("Producto encontrado:");
                            productoEncontrado.mostrarclave();
                            productoEncontrado.mostrarvalor();
                        } else {
                            System.out.println("Producto con codigo " + codigoBuscar + " no encontrado.");
                        }
                    }
                    break;
                case '4':
                    if (productos.isEmpty()) {
                        System.out.println("No hay productos registrados.");
                    } else {
                        System.out.print("Ingrese el codigo del producto a eliminar: ");
                        int codigoEliminar = sc.nextInt();
                        sc.nextLine();

                        Producto productoEliminado = productos.remove(codigoEliminar);
                        if (productoEliminado != null) {
                            System.out.println("Producto con codigo " + codigoEliminar + " eliminado exitosamente.");
                        } else {
                            System.out.println("Producto con codigo " + codigoEliminar + " no encontrado.");
                        }
                    }
                    break;
                case '5':
                    System.out.println("Saliendo del programa...");
                    break;
            }
        } while (opcion != '5');
        sc.close();
        }


    }
