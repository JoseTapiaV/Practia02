/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clase;

import ec.edu.ups.interfaces.Acciones;
import java.util.Date;

/**
 * Clase hija de sucursal
 * @version 1.2
 * @since 2019
 * @author Jose Tapia
 */
public class socio extends sucursal implements Acciones{
    private String rol;
    private Date integracion;
    private String manera;
    private double tiempo;

    public socio() {
    }

    public socio(String nombre, int codigo) {
        super(nombre, codigo);
    }

    public socio(String rol, Date integracion, String manera, double tiempo, String direccion, int cantidad, int telefono, String ciudad, String nombre, int codigo, double ingreso, String nacional) {
        super(direccion, cantidad, telefono, ciudad, nombre, codigo, ingreso, nacional);
        this.rol = rol;
        this.integracion = integracion;
        this.manera = manera;
        this.tiempo = tiempo;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Date getIntegracion() {
        return integracion;
    }

    public void setIntegracion(Date integracion) {
        this.integracion = integracion;
    }

    public String getManera() {
        return manera;
    }

    public void setManera(String manera) {
        this.manera = manera;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }
    
    @Override
    public String generar() {
        return "La empresa "+super.getNombre()+"está generando.";
    }

    @Override
    public String vender() {
        return "La empresa "+super.getNombre()+"está vendiendo.";
    }
    
    @Override
    public String toString() {
        return "socio{" + "rol=" + rol + ", integracion=" + integracion + ", manera=" + manera + ", tiempo=" + tiempo + '}';
    }
}
