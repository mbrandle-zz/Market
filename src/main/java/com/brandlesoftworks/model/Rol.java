package com.brandlesoftworks.model;

public class Rol {
    private int idRol;
    private String nombre;
    private boolean administrar;
    private boolean caja;
    private boolean reportes;
    private boolean clientes;
    private boolean facturas;
    private boolean corteCaja;

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isAdministrar() {
        return administrar;
    }

    public void setAdministrar(boolean administrar) {
        this.administrar = administrar;
    }

    public boolean isCaja() {
        return caja;
    }

    public void setCaja(boolean caja) {
        this.caja = caja;
    }

    public boolean isReportes() {
        return reportes;
    }

    public void setReportes(boolean reportes) {
        this.reportes = reportes;
    }

    public boolean isClientes() {
        return clientes;
    }

    public void setClientes(boolean clientes) {
        this.clientes = clientes;
    }

    public boolean isFacturas() {
        return facturas;
    }

    public void setFacturas(boolean facturas) {
        this.facturas = facturas;
    }

    public boolean isCorteCaja() {
        return corteCaja;
    }

    public void setCorteCaja(boolean corteCaja) {
        this.corteCaja = corteCaja;
    }
}
