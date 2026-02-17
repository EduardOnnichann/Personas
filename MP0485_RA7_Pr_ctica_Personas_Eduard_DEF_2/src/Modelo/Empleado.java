/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author EduardOnnichannn
 */
public class Empleado extends Persona {

    private int idEmpleado;
    private double sueldo;

    public Empleado(int idPersona, String nombre, int idEmpleado, double sueldo) {
        super(idPersona, nombre);
        this.idEmpleado = idEmpleado;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString()
                + " Empleado{"
                + "idEmpleado=" + idEmpleado
                + ", sueldo=" + sueldo
                + '}';
    }
}
