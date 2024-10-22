package com.cibertec.proyecto.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Venta")
public class Venta {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVenta; 

    @Column(nullable = false)
    private java.sql.Date fechaVenta; 

    @Column(nullable = false)
    private double montoTotal; 

    private int estado; 

    // Constructor vacio
    public Venta() {
        super();
    }

    // Constructor con parámetros
    public Venta(int idVenta, java.sql.Date fechaVenta, double montoTotal, int estado) {
        this.idVenta = idVenta;
        this.fechaVenta = fechaVenta;
        this.montoTotal = montoTotal;
        this.estado = estado;
    }

    // Getters y Setters
    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public java.sql.Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(java.sql.Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Venta [idVenta=" + idVenta + ", fechaVenta=" + fechaVenta + 
               ", montoTotal=" + montoTotal + ", estado=" + estado + "]";
    }
}