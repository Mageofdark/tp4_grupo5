package ar.edu.unju.escmi.tp4.ejercicio3;

import java.util.Scanner;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Paciente> pacientes = new TreeSet<>();

       int opcion;
        do {
            System.out.println("\n--- MENU DE PACIETES ---");
            System.out.println("1 – Alta de paciente");
            System.out.println("2 – Mostrar todos los pacientes");
            System.out.println("3 – Mostrar el paciente de la mitad");
            System.out.println("4 – Mostrar el primer paciente");
            System.out.println("5 – Mostrar el último paciente");
            System.out.println("6 – Filtrar por historia clínica");
            System.out.println("7 – Salir");
            System.out.print("Ingrese opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    Paciente p = new Paciente();

                    System.out.print("Ingrese DNI del paciente: ");
                    p.setDni(sc.nextInt());
                    sc.nextLine();

                    System.out.print("Ingrese Nombre del paciente: ");
                    p.setNombre(sc.nextLine());

                    System.out.print("Ingrese Apellido del paciente: ");
                    p.setApellido(sc.nextLine());

                    System.out.print("Ingrese Número de Historia Clínica: ");
                    p.setNumHC(sc.nextInt());
                    sc.nextLine();

                    System.out.print("Ingrese Obra Social del paciente: ");
                    p.setObraSocial(sc.nextLine());

                    pacientes.add(p);
                    System.out.println("Paciente agregado exitosamente.");
                    break;

                case 2:
                    System.out.println("\n--- Lista de Pacientes ---");
                    pacientes.stream().forEach(System.out::println);
                    break;

                case 3:
                    if (pacientes.isEmpty()) {
                        System.out.println("No hay pacientes registrados.");
                    } else {
                        int Mid = pacientes.size() / 2;
                        Paciente pMid= pacientes.stream().collect(Collectors.toList()).get(Mid);
                        System.out.println("Paciente de la mitad: " + pMid);
                    }
                    break;

                case 4:
                    if (pacientes.isEmpty()) {
                        System.out.println("No hay pacientes registrados.");
                    } else {
                        System.out.println("Primer paciente: " + pacientes.first());
                    }
                    break;

                case 5:
                    if (pacientes.isEmpty()) {
                        System.out.println("No hay pacientes registrados.");
                    } else {
                        System.out.println("Último paciente: " + pacientes.last());
                    }
                    break;

                case 6:
                    if (pacientes.isEmpty()) {
                        System.out.println("No hay pacientes registrados.");
                    } else {
                        System.out.print("Ingrese el número de historia clínica a filtrar: ");
                        int InputHC = sc.nextInt();
                        sc.nextLine();
                        
                        System.out.println("Pacientes con numero de Historia Clinica MAyor a " + InputHC + " :");
                        pacientes.stream()
                                .filter(pa -> pa.getNumHC() > InputHC)
                                .forEach(System.out::println);
                        
                    }
                    break;

                case 7:
                    System.out.println("Saliendooooooo...");
                    break;
            }
        } while (opcion !=7);

        sc.close();
    }
}
