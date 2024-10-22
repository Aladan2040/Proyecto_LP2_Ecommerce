package com.cibertec.proyecto.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Producto")
public class Producto {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProducto; 

    @Column(nullable = false, length = 100)
    private String nombre; 

    @Column(length = 300)
    private String descripcion; 

    @Column(nullable = false)
    private double precio; 

    @Column(nullable = false)
    private int stock; 

    private int estado; 

    // Constructor por defecto
    public Producto() {
        super();
    }

    // Constructor con parámetros
    public Producto(int idProducto, String nombre, String descripcion, double precio, int stock, int estado) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.estado = estado;
    }

    // Getters y Setters
    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Producto [idProducto=" + idProducto + ", nombre=" + nombre + 
               ", descripcion=" + descripcion + ", precio=" + precio + 
               ", stock=" + stock + ", estado=" + estado + "]";
    }
}