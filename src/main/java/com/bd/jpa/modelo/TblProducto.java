package com.bd.jpa.modelo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="tbl_producto")
public class TblProducto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProducto;
    @Column(name="")
	private String nomprod;
	private double cantidad;
	private double precio;
	private double total;
	private String nrolote;
	private String codBarras;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(iso=ISO.DATE)
	private Date fechaven;
	
	
	
	
	
	
	public TblProducto() {
		//*super();
	}
	public TblProducto(int idProducto, String nomprod, double cantidad, double precio, double total, String nrolote,
			String codBarras, Date fechaven) {
		super();
		this.idProducto = idProducto;
		this.nomprod = nomprod;
		this.cantidad = cantidad;
		this.precio = precio;
		this.total = total;
		this.nrolote = nrolote;
		this.codBarras = codBarras;
		this.fechaven = fechaven;
	}
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public String getNomprod() {
		return nomprod;
	}
	public void setNomprod(String nomprod) {
		this.nomprod = nomprod;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public String getNrolote() {
		return nrolote;
	}
	public void setNrolote(String nrolote) {
		this.nrolote = nrolote;
	}
	public String getCodBarras() {
		return codBarras;
	}
	public void setCodBarras(String codBarras) {
		this.codBarras = codBarras;
	}
	public Date getFechaven() {
		return fechaven;
	}
	public void setFechaven(Date fechaven) {
		this.fechaven = fechaven;
	}
		

}
