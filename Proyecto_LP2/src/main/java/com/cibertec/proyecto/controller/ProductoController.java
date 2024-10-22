package com.cibertec.proyecto.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cibertec.proyecto.interfaceService.IProductoService;
import com.cibertec.proyecto.modelo.Producto;

@Controller
@RequestMapping
public class ProductoController {
	
	@Autowired
	private IProductoService service;
	
	@GetMapping("/producto/menu_producto")
    public String menuProducto() {
        return "producto/menu_producto";
    }
	
	@GetMapping("/producto/form_producto")
	public String formProducto() {
		return "producto/form_producto";
	}
	
	@GetMapping("/producto/reporteProducto")
	public String reporteProducto() {
		return "producto/reporteProducto";
	}
	
	@GetMapping("/listar")
	public String listar(Model model) {
		List<Producto> producto = service.listar();
		model.addAttribute("personas", producto);
		return "index";
	}
	
	@GetMapping("/new")
	public String agregar(Model model) {
		model.addAttribute("producto", new Producto());
		return "form";
	}
	
	@PostMapping("/save")
	public String save(@Validated Producto p, Model model) {
		service.save(p);
		return "redirect:/listar";
	}
	
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable int id, Model model) {
		Optional<Producto>producto=service.listarId(id);
		model.addAttribute("producto", producto);
		return "form";
	}
	
	@GetMapping("/eliminar/{id}")
	public String delete(Model model, @PathVariable int id) {
		service.delete(id);
		return "redirect:/listar";
	}
}
