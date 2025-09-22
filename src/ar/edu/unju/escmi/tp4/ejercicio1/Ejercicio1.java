package ar.edu.unju.escmi.tp4.ejercicio1;


import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
        public static void main(String[] args) {
            byte opcion;
            ArrayList<Jugador> listaJugadores = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.println("Menu de opciones:");
                System.out.println("1. Alta de jugador");
                System.out.println("2. Modificacion de jugador");
                System.out.println("3. Eliminar un jugador");
                System.out.println("4. Mostrar a todos los jugadores");
                System.out.println("5. Mostrar cantidad de jugadores");
                System.out.println("6. limpiar lista de jugadores");
                System.out.println("7. Salir");
                System.out.print("Seleccione una opcion: ");
                opcion = scanner.nextByte();
                scanner.nextLine();
                switch (opcion) {
                    case 1:
                        System.out.println("Alta de jugador seleccionado.");
                        Jugador newjugador = new Jugador();
                        System.out.print("Ingrese DNI: ");
                        newjugador.setDni(scanner.nextInt());
                        scanner.nextLine();
                        System.out.print("Ingrese Nombre: ");
                        newjugador.setNombre(scanner.nextLine());
                        System.out.print("Ingrese Equipo: ");
                        newjugador.setEquipo(scanner.nextLine());
                        System.out.print("Ingrese Nacionalidad: ");
                        newjugador.setNacionalidad(scanner.nextLine());
                        System.out.print("Ingrese Altura en cm: ");
                        newjugador.setAltura(scanner.nextInt());
                        scanner.nextLine();
                        listaJugadores.add(newjugador);
                        System.out.println("Jugador agregado exitosamente.");
                        break;
                    case 2:
                        System.out.println("Modificacion de jugador seleccionado.");
                        System.out.println("Ingrese el DNI del jugador a modificar: ");
                        int dniModificar = scanner.nextInt();
                        scanner.nextLine();
                        boolean encontrado = false;
                        for (Jugador j : listaJugadores) {
                            if (j.getDni() == dniModificar) {
                                System.out.println("Dato del jugador en la lista: " + j.getDni());
                                j.mostrarDatos();
                                System.out.print("Ingrese nuevo Nombre: ");
                                j.setNombre(scanner.nextLine());
                                System.out.print("Ingrese nuevo Equipo: ");
                                j.setEquipo(scanner.nextLine());
                                System.out.print("Ingrese nueva Nacionalidad: ");
                                j.setNacionalidad(scanner.nextLine());
                                System.out.print("Ingrese nueva Altura: ");
                                j.setAltura(scanner.nextInt());
                                scanner.nextLine();
                                System.out.println("Jugador modificado exitosamente.");
                                encontrado = true;
                        break;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("Jugador con DNI " + dniModificar + " no encontrado.");
                        }
                        break;
                    case 3:
                        System.out.println("Eliminar un jugador seleccionado.");
                        System.out.println("Ingrese el DNI del jugador a eliminar: ");
                        int dniEliminar = scanner.nextInt();
                        scanner.nextLine();
                        Jugador jugadorAEliminar = null;
                        for (Jugador j : listaJugadores) {
                            if (j.getDni() == dniEliminar) {
                                jugadorAEliminar = j;

                                break;
                            }
                        }
                        if (jugadorAEliminar != null) {
                            listaJugadores.remove(jugadorAEliminar);
                            System.out.println("Jugador eliminado exitosamente.");
                        } else {
                            System.out.println("Jugador con DNI " + dniEliminar + " no encontrado.");
                        }
                        break;
                    case 4:
                        System.out.println("Mostrar a todos los jugadores seleccionado.");
                        if (listaJugadores.isEmpty()) {
                            System.out.println("No hay jugadores en la lista.");
                        } else {
                            for (Jugador j : listaJugadores) {
                                j.mostrarDatos();
                            }
                        }
                        break;
                    case 5:
                        System.out.println("Mostrar cantidad de jugadores seleccionado.");
                        System.out.println("Cantidad de jugadores en la lista: " + listaJugadores.size());
                        break;
                    case 6:
                        System.out.println("Limpiar lista de jugadores seleccionado.");
                        listaJugadores.clear();
                        System.out.println("Lista de jugadores limpiada exitosamente.");
                        break;
                    case 7:
                        System.out.println("Saliendo del programa.");
                        break;
                    default:
                        System.out.println("Opcion invalida. Por favor, intente nuevamente.");
                }
            } while(opcion != 7);
            scanner.close();
        }

}
