package com.cibertec.proyecto.modelo;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "PedidoProveedor")
public class PedidoProveedor {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPedido; 

    private int idProveedor; 

    @Column(name = "fecha_pedido", nullable = false)
    private Date fechaPedido; 

    @Column(name = "estado_pedido", length = 50)
    private String estadoPedido; 

    private int estado; 

    // Constructor por defecto
    public PedidoProveedor() {
        super();
    }

    // Constructor con parámetros
    public PedidoProveedor(int idPedido, int idProveedor, Date fechaPedido, String estadoPedido, int estado) {
        this.idPedido = idPedido;
        this.idProveedor = idProveedor;
        this.fechaPedido = fechaPedido;
        this.estadoPedido = estadoPedido;
        this.estado = estado;
    }

    // Getters y Setters
    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public String getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(String estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "PedidoProveedor [idPedido=" + idPedido + ", idProveedor=" + idProveedor + 
               ", fechaPedido=" + fechaPedido + ", estadoPedido=" + estadoPedido + 
               ", estado=" + estado + "]";
    }
}