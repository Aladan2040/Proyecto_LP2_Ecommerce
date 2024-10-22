package com.cibertec.proyecto.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "DetalleVenta")
public class DetalleVenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDetalle; 

    @ManyToOne
    @JoinColumn(name = "id_venta", nullable = false)
    private Venta venta; 

    @ManyToOne
    @JoinColumn(name = "id_producto", nullable = false)
    private Producto producto; 

    @Column(nullable = false)
    private int cantidad; 

    @Column(nullable = false, precision = 10, scale = 2)
    private double precioUnitario; 

    private int estado; 

    // Constructor por defecto
    public DetalleVenta() {
        super();
    }

    // Constructor con parámetros
    public DetalleVenta(int idDetalle, Venta venta, Producto producto, int cantidad, double precioUnitario, int estado) {
        this.idDetalle = idDetalle;
        this.venta = venta;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.estado = estado;
    }

    // Getters y Setters
    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "DetalleVenta [idDetalle=" + idDetalle + ", venta=" + venta + 
               ", producto=" + producto + ", cantidad=" + cantidad + 
               ", precioUnitario=" + precioUnitario + ", estado=" + estado + "]";
    }
}