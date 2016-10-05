/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.brandlesoftworks.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;
    @Column(name="nombre")
    private String nombre;
    @Column(name="activo")
    private boolean activo;
    @Column(name="administrar")
    private boolean administrar;
    @Column(name="caja")
    private boolean caja;
    @Column(name="reportes")
    private boolean reportes;
    @Column(name="clientes")
    private boolean clientes;
    @Column(name="facturas")
    private boolean facturas;
    @Column(name="corteCaja")
    private boolean corteCaja;
    @Column(name="password")
    private String password;
    @Column(name="usuario")
    private String usuario;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
