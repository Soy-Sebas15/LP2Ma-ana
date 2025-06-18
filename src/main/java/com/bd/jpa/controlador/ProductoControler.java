package com.bd.jpa.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bd.jpa.modelo.TblProducto;
import com.bd.jpa.servicio.IProductoServicio;



@Controller
@RequestMapping("/vistas")
public class ProductoControler {
	
	@Autowired
	private IProductoServicio iproductoservicio;
	@GetMapping("ListadoProductos")
	public String ListadoProductos(Model modelo) {
		
		List<TblProducto> listado = iproductoservicio.ListadoProductos();
		modelo.addAttribute("listado",listado);
		return "/vistas/ListadoProducto";
	}
	
	

}
