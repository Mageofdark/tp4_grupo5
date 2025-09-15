package ar.edu.unju.escmi.tp4.ejercicio6;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Iterator;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Libro> libros = new ArrayList<> ();
        String op;
        do{
            System.out.println("1 - Alta de Libro.");
            System.out.println("2 - Mostrar libros.");
            System.out.println("3 - Buscar y mostrar un libro");
            System.out.println("4 - Ordenar libros.");
            System.out.println("5 - Modificar datos de un libro.");
            System.out.println("6 - Eliminar un libro.");
            System.out.println("7 - Salir.");
            System.out.print("Ingrese opcion: ");
            op = sc.nextLine();
            switch(op){
                case "1":
                    Libro nuevoLibro = new Libro();

                    String isbn, titulo, autor;
                    int cantidadDePaginas;

                    System.out.print("Ingrese el isbn: ");
                    isbn = sc.nextLine();
                    nuevoLibro.setIsbn(isbn);

                    System.out.print("Ingrese el Titulo: ");
                    titulo = sc.nextLine();
                    nuevoLibro.setTitulo(titulo);

                    System.out.print("Ingrese la Cantidad de Paginas: ");
                    cantidadDePaginas = sc.nextInt();
                    sc.nextLine();
                    nuevoLibro.setCantidadDePaginas(cantidadDePaginas);

                    System.out.print("Ingrese el Autor: ");
                    autor = sc.nextLine();
                    nuevoLibro.setAutor(autor);
                    
                    libros.add(nuevoLibro);
                    break;
                case "2":
                    if(libros.isEmpty()){
                        System.out.println("No hay libros en la lista.");
                    }
                    libros.forEach(libro -> libro.mostrarDatos());
                    break;
                case "3":
                    String isbnBuscar;
                    System.out.print("Ingrese isbn para buscar libro: ");
                    isbnBuscar = sc.nextLine();

                    boolean encontrado = false;
                    for(Libro curLibro : libros){
                        if(isbnBuscar.equals(curLibro.getIsbn())){
                            curLibro.mostrarDatos();
                            encontrado = true;
                            break;
                        }
                    }

                    if(!encontrado){
                        System.out.println("El libro con isbn: " + isbnBuscar + " no existe.");
                    }

                    break;
                case "4":
                    Collections.sort(libros);
                    break;
                case "5":
                    System.out.print("Ingrese isbn para modificar su respectivo libro: ");
                    isbnBuscar = sc.nextLine();

                    encontrado = false;
                    for(Libro curLibro : libros){
                        if(isbnBuscar.equals(curLibro.getIsbn())){
                            System.out.println("Datos Actuales");
                            curLibro.mostrarDatos();


                            System.out.println("Modificacion de Datos");

                            System.out.print("Ingrese el Titulo: ");
                            titulo = sc.nextLine();
                            curLibro.setTitulo(titulo);

                            System.out.print("Ingrese la Cantidad de Paginas: ");
                            cantidadDePaginas = sc.nextInt();
                            sc.nextLine();
                            curLibro.setCantidadDePaginas(cantidadDePaginas);

                            System.out.print("Ingrese el Autor: ");
                            autor = sc.nextLine();
                            curLibro.setAutor(autor);


                            encontrado = true;
                            break;
                        }
                    }

                    if(!encontrado){
                        System.out.println("El libro con isbn: " + isbnBuscar + " no existe.");
                    }

                    break;
                case "6":
                    System.out.print("Ingrese isbn para eliminar su respectivo libro: ");
                    isbnBuscar = sc.nextLine();

                    encontrado = false;


                    Iterator<Libro> it = libros.iterator();
                    while(it.hasNext()){
                        if(it.next().getIsbn().equals(isbnBuscar)){
                            it.remove();
                            encontrado = true;
                            break;
                        }  
                    }

                    if(!encontrado){
                        System.out.println("El libro con isbn: " + isbnBuscar + " no existe.");
                    }

                    break;
                case "7":
                    System.out.println("Nos vemos!");
                    break;
                default:
                    System.out.println("Opcion incorrecta. Debe ser en un rango de 1 a 7");
                    break;                
            }
            System.out.println("------------------------");
        }while(!op.equals("7"));
        sc.close();
    }
}
