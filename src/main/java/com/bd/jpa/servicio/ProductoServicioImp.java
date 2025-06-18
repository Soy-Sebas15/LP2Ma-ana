package com.bd.jpa.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bd.jpa.modelo.TblProducto;
import com.bd.jpa.repositorio.IProductoRepositorio;

@Service
public class ProductoServicioImp implements IProductoServicio{

	@Autowired
	private IProductoRepositorio iproductorepositorio;
	@Override
	public void RegistrarProducto(TblProducto Producto) {
		// TODO Auto-generated method stub
		iproductorepositorio.save(Producto);
		
	}

	@Override
	public void ActualizarProducto(TblProducto Producto) {
		// TODO Auto-generated method stub
	
	}

	
	@Override
	public void EliminarProducto(TblProducto Producto) {
		// TODO Auto-generated method stub
		iproductorepositorio.deleteById(Producto.getIdProducto());
	}

	@Override
	public List<TblProducto> ListadoProductos() {
		// TODO Auto-generated method stub
		
		
		
		
		return (List<TblProducto>) iproductorepositorio.findAll();
	}

	@Override
	public TblProducto BuscarProducto(Integer id) {
		// TODO Auto-generated method stub
		return iproductorepositorio.findById(id).orElse(null);
	}



}
