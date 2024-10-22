package com.cibertec.proyecto.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.proyecto.modelo.Venta;

@Repository
public interface IVenta extends CrudRepository<Venta, Integer>{
	
}
