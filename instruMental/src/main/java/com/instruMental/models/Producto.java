package com.instruMental.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



	@Entity
	@Table(name="producto")
	public class Producto {
		
		@Id
		@Column(name="idProducto")
		private int IdProducto;

		@Column(name="nombre")
		private long nombre;

		@Column(name="descripcion")
		private String descripcion;

		

		@Column(name="imagen")
		private String imagen;
		
		@Column(name="precio")
		private float precio;

		@ManyToOne()
	    @JoinColumn(name = "idProveedor")
	    private Proveedor proveedores;
		
		
		
		public Producto() {}
		
			
		public Producto( long nombre, String descripcion, String imagen, float precio) {
			
			
			this.nombre = nombre;
			this.descripcion = descripcion;
			this.imagen = imagen;
			this.precio = precio;
		}

		public int getIdProducto() {
			return IdProducto;
		}

		public void setIdProducto(int idProducto) {
			IdProducto = idProducto;
		}

		public long getNombre() {
			return nombre;
		}

		public void setNombre(long nombre) {
			this.nombre = nombre;
		}

		public String getDescripcion() {
			return descripcion;
		}

		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}

		public String getImagen() {
			return imagen;
		}

		public void setImagen(String imagen) {
			this.imagen = imagen;
		}

		public float getPrecio() {
			return precio;
		}

		public void setPrecio(float precio) {
			this.precio = precio;
		}
		
	
		
	}
