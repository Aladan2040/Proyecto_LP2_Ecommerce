package com.cibertec.proyecto.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.proyecto.modelo.Proveedor;

@Repository
public interface IProveedor extends CrudRepository<Proveedor, Integer>{
	
}
