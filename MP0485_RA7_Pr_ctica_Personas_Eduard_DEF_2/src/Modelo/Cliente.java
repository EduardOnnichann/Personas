/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author EduardOnnichannn
 */
public class Cliente extends Persona {

    private int idCliente;
    private boolean vip;

    public Cliente(int idPersona, String nombre, int idCliente, boolean vip) {
        super(idPersona, nombre);
        this.idCliente = idCliente;
        this.vip = vip;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public boolean isVip() {
        return vip;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        return super.toString()
                + " Cliente{"
                + "idCliente=" + idCliente
                + ", vip=" + vip
                + '}';
    }
}
