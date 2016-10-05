package com.brandlesoftworks.model;

public class ResumenVenta {
    private int folioTicket;
    private double venta;
    private double ventaNeta;
    private int cantidadProductos;
    private String fecha;
    private String estado;

    public int getFolioTicket() {
        return folioTicket;
    }

    public void setFolioTicket(int folioTicket) {
        this.folioTicket = folioTicket;
    }

    public double getVenta() {
        return venta;
    }

    public void setVenta(double venta) {
        this.venta = venta;
    }

    public double getVentaNeta() {
        return ventaNeta;
    }

    public void setVentaNeta(double ventaNeta) {
        this.ventaNeta = ventaNeta;
    }

    public int getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
