package com.cibertec.proyecto.interfaceService;

import java.util.List;
import java.util.Optional;

import com.cibertec.proyecto.modelo.Proveedor;

public interface IProveedorService {
	public List<Proveedor> listar();
	public Optional<Proveedor> listarId(int id);
	public int save(Proveedor p);
	public void delete(int id);
	Proveedor buscarPorId(Long id);
	List<Proveedor> buscarPorNombre(String nombre);
}
