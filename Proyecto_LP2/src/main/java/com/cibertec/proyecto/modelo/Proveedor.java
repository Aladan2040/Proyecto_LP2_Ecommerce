package com.cibertec.proyecto.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Proveedor")
public class Proveedor {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProveedor; 

    @Column(nullable = false, length = 100)
    private String nombre; 

    @Column(length = 15)
    private String telefono; 

    @Column(length = 150)
    private String direccion; 

    @Column(length = 100)
    private String correo; 

    private int estado; 

    // Constructor por defecto
    public Proveedor() {
        super();
    }

    // Constructor con parámetros
    public Proveedor(int idProveedor, String nombre, String telefono, String direccion, String correo, int estado) {
        this.idProveedor = idProveedor;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        this.estado = estado;
    }

    // Getters y Setters
    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

	@Override
	public String toString() {
		return "Proveedor [idProveedor=" + idProveedor + ", nombre=" + nombre + ", telefono=" + telefono
				+ ", direccion=" + direccion + ", correo=" + correo + ", estado=" + estado + "]";
	}

   
}