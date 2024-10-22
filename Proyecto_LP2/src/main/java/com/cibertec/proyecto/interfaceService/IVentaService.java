package com.cibertec.proyecto.interfaceService;

import java.util.List;
import java.util.Optional;

import com.cibertec.proyecto.modelo.DetalleVenta;
import com.cibertec.proyecto.modelo.Venta;

public interface IVentaService {
	public List<Venta> listar();
	public Optional<Venta> listarId(int id);
	public int save(Venta p);
	public void delete(int id);
	List<Venta> obtenerReporteVenta();
	void realizarVenta(Venta venta, List<DetalleVenta> detalles);
}
