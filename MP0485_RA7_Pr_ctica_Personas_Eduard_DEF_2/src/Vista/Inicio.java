/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Controlador.ControladorPersonas;
import java.util.Scanner;

/**
 *
 * @author EduardOnnichannn
 */
public class Inicio {
    
    public static int menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Menu ---");
        System.out.println("1- Dar de alta");
        System.out.println("2- Dar de baja");
        System.out.println("3- Modificar");
        System.out.println("4- Mostrar");
        System.out.println("5- Buscar");
        System.out.println("6- Salir");
        int opc = sc.nextInt();
        sc.nextLine();
        return opc;
    }

    public static void main(String[] args) {
        int opc;
        do {
            opc = menu();
            switch (opc) {
                case 1:
                    ControladorPersonas.altaPersona();
                    break;
                case 2:
                    ControladorPersonas.bajaPersona();  
                    break;
                case 3:
                    ControladorPersonas.modificarPersona();
                    break;
                case 4:
                    ControladorPersonas.mostrarPersona();
                    break;
                case 5:
                    ControladorPersonas.buscarPorNombre();
                    break;
            } 
        } while(opc != 6);
    }
}
