package com.cibertec.proyecto.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.proyecto.modelo.PedidoProveedor;

@Repository
public interface IPedidoProveedor extends CrudRepository<PedidoProveedor, Integer>{
	
}
