/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Cliente;
import Modelo.Empleado;
import Modelo.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author EduardOnnichannn
 */
public class ControladorPersonas {

    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Persona> personas = new ArrayList<Persona>();

    public static void altaPersona() {
        System.out.println("Introduce tu ID:");
        int idPersona = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduce tu nombre:");
        String nombre = sc.nextLine();
        System.out.println("Quieres dar de alta a un empleado o a un cliente?");
        String respuesta = sc.nextLine();

        if (respuesta.equalsIgnoreCase("empleado")) {
            System.out.println("Introduce tu sueldo: ");
            double sueldo = sc.nextDouble();
            personas.add(new Empleado(idPersona, nombre, idPersona, sueldo));

        } else if (respuesta.equalsIgnoreCase("cliente")) {
            System.out.println("Tienes vip?(true/false)");
            boolean vip = sc.nextBoolean();
            personas.add(new Cliente(idPersona, nombre, idPersona, vip));

        } else {
            System.out.println("Responde 'empleado' o 'cliente'.");
        }
    }

    public static void bajaPersona() {
        System.out.println("Introduce tu id");
        int idPersona = sc.nextInt();
        Persona persona = checkPersonaID(idPersona);
        if (persona != null) {
            personas.remove(persona);
        } else {
            System.out.println("La persona no existe.");
        }
    }

    public static void modificarPersona() {
        System.out.println("Introduce tu id");
        int idPersona = sc.nextInt();
        Persona persona = checkPersonaID(idPersona);
        if (persona != null) {

        } else {
            System.out.println("La persona no existe.");
        }
    }

    public static void mostrarPersona() {
        System.out.println("Introduce tu ID:");
        int idPersona = sc.nextInt();
        Cliente cliente = checkClienteID(idPersona);
        Empleado empleado = checkEmpleadoID(idPersona);

        if (cliente != null && empleado == null) {
            System.out.println(cliente.toString());
        } else if (cliente == null && empleado != null) {
            System.out.println(empleado.toString());
        } else {
            System.out.println("La persona no existe");
        }
    }

    public static void buscarPorNombre() {
        System.out.println("Introduce tu nombre:");
        sc.nextLine();
        String nombre = sc.nextLine();
        Cliente cliente = checkClienteNombre(nombre);
        Empleado empleado = checkEmpleadoNombre(nombre);
        
        if (cliente != null && empleado == null) {
            System.out.println(cliente.toString());
        } else if (cliente == null && empleado != null) {
            System.out.println(empleado.toString());
        } else {
            System.out.println("La persona no existe");
        }
    }

    public static Persona checkPersonaID(int idPersona) {
        for (Persona persona : personas) {
            if (persona.getIdPersona() == idPersona) {
                return persona;
            }
        }
        return null;
    }

    public static Cliente checkClienteID(int idCliente) {
        for (Persona persona : personas) {
            if (persona.getClass().getSimpleName().equalsIgnoreCase("Cliente")) {
                Cliente cliente = (Cliente) persona;
                if (cliente.getIdCliente() == idCliente) {
                    return cliente;
                }
            }
        }
        return null;
    }

    public static Empleado checkEmpleadoID(int idEmpleado) {
        for (Persona persona : personas) {
            if (persona.getClass().getSimpleName().equalsIgnoreCase("Empleado")) {
                Empleado empleado = (Empleado) persona;
                if (empleado.getIdEmpleado() == idEmpleado) {
                    return empleado;
                }
            }
        }
        return null;
    }

    public static Cliente checkClienteNombre(String nombre) {
        for (Persona persona : personas) {
            if (persona.getClass().getSimpleName().equalsIgnoreCase("Cliente")) {
                Cliente cliente = (Cliente) persona;
                if (cliente.getNombre().equalsIgnoreCase(nombre)) {
                    return cliente;
                }
            }
        }
        return null;
    }

    public static Empleado checkEmpleadoNombre(String nombre) {
        for (Persona persona : personas) {
            if (persona.getClass().getSimpleName().equalsIgnoreCase("Empleado")) {
                Empleado empleado = (Empleado) persona;
                if (empleado.getNombre().equalsIgnoreCase(nombre)) {
                    return empleado;
                }
            }
        }
        return null;
    }
}
