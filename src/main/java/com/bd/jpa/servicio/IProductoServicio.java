package com.bd.jpa.servicio;

import java.util.List;

import com.bd.jpa.modelo.TblProducto;

public interface IProductoServicio {
//declaramos los metodos
	void RegistrarProducto(TblProducto Producto);
	void ActualizarProducto(TblProducto Producto);
	void EliminarProducto(TblProducto Producto);
	List<TblProducto> ListadoProductos();
	TblProducto BuscarProducto(Integer id);
	
	
	
	
}
