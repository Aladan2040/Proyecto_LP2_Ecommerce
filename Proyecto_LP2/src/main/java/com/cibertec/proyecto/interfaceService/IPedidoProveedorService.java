package com.cibertec.proyecto.interfaceService;

import java.util.List;
import java.util.Optional;

import com.cibertec.proyecto.modelo.PedidoProveedor;

public interface IPedidoProveedorService {
	public List<PedidoProveedor> listar();
	public Optional<PedidoProveedor> listarId(int id);
	public int save(PedidoProveedor p);
	public void delete(int id);
}
