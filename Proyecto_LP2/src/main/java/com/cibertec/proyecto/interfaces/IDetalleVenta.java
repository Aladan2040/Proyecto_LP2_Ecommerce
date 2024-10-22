package com.cibertec.proyecto.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.proyecto.modelo.DetalleVenta;

@Repository
public interface IDetalleVenta extends CrudRepository<DetalleVenta, Integer>{
	
}
