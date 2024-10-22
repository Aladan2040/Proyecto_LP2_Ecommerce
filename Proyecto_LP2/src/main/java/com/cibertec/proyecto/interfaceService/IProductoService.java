package com.cibertec.proyecto.interfaceService;

import java.util.List;
import java.util.Optional;

import com.cibertec.proyecto.modelo.Producto;

public interface IProductoService {
	public List<Producto> listar();
	public Optional<Producto> listarId(int id);
	public int save(Producto p);
	public void delete(int id);
	Producto buscarPorId(Long id);
	List<Producto> buscarPorNombre(String nombre);
	List<Producto> obtenerReporteProductos();
}
