package com.cibertec.proyecto.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.proyecto.modelo.Producto;

@Repository
public interface IProducto extends CrudRepository<Producto, Integer>{

}
