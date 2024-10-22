package com.cibertec.proyecto.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cibertec.proyecto.interfaceService.IProductoService;
import com.cibertec.proyecto.interfaces.IProducto;
import com.cibertec.proyecto.modelo.Producto;

@Service
public class ProductoService implements IProductoService{
	@Autowired
	private IProducto data;
	
	@Override
	public List<Producto> listar(){
		return (List<Producto>) data.findAll();
	}

	@Override
	public Optional<Producto> listarId(int id){
		return data.findById(id);
	}
	
	@Override
	public int save(Producto p) {
		int res=0;
		Producto producto = data.save(p);
		if(!producto.equals(null)) {
			res=1;
		}
		return res;
	}
	
	@Override
	public void delete(int id) {
		data.deleteById(id);
	}

	@Override
	public Producto buscarPorId(Long id) {
		return data.findById(id.intValue()).orElse(null);
	}

	@Override
	public List<Producto> buscarPorNombre(String nombre) {
		List<Producto> todosLosProductos = (List<Producto>) data.findAll();
        
        if (nombre == null || nombre.isEmpty()) {
            return todosLosProductos;
        }

        return todosLosProductos.stream()
                .filter(p -> p.getNombre().toLowerCase()
                        .contains(nombre.toLowerCase()))
                .collect(Collectors.toList());
    }

	@Override
	public List<Producto> obtenerReporteProductos() {
		List<Producto> productos = (List<Producto>) data.findAll();
        productos.sort((p1, p2) -> p1.getNombre().compareTo(p2.getNombre()));
        
        return productos;
	}
	
	
}
