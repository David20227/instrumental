package com.instruMental.models;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "usuario")
public class Usuario {


	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "idUsuario")
	    private int idUsuario;
	    
	    @Column(name = "nombre")
	    private String nombre;
	    
	    @Column(name = "apellido1")
	    private String apellido1;
	    
	    @Column(name = "apellido2")
	    private String apellido2;
	    
	    @Column(name = "password")
	    private String password;
	    
	    @Column(name = "mail")
	    private String mail;
	    
	    @Column(name = "fechaBaja")
	    private Date fechaBaja;
	    
	    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
	    private List<Categoria> categorias = new ArrayList<>();
		
	    public Usuario() {}
	    
	    
	    public Usuario(String nombre, String apellido1, String apellido2, String password, String mail) {
			super();
			this.nombre = nombre;
			this.apellido1 = apellido1;
			this.apellido2 = apellido2;
			this.password = password;
			this.mail = mail;
		}
	  

		public int getIdUsuario() {
			return idUsuario;
		}

		public void setIdUsuario(int idUsuario) {
			this.idUsuario = idUsuario;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido1() {
			return apellido1;
		}

		public void setApellido1(String apellido1) {
			this.apellido1 = apellido1;
		}

		public String getApellido2() {
			return apellido2;
		}

		public void setApellido2(String apellido2) {
			this.apellido2 = apellido2;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getMail() {
			return mail;
		}

		public void setMail(String mail) {
			this.mail = mail;
		}

		public Date getFechaBaja() {
			return fechaBaja;
		}

		public void setFechaBaja(Date fechaBaja) {
			this.fechaBaja = fechaBaja;
		}
		  
	   
	    
	}






