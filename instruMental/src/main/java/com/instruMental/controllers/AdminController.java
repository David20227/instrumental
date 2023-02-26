package com.instruMental.controllers;

import java.util.Collection;
import java.util.Iterator;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
	


		@GetMapping(value = {"/wp-admin"})
	
		public String admin() {
			
			return "wp-admin";
		}
		
		
		@RequestMapping("/admin/")
		@PostMapping(value = {"/admin"})	
		public String Adminloggin(Model objModel, Authentication authentication) {
	
				String Roles = "";
				
				//Si el usuario dispone de roles se procede a obtenerlos.
				if (authentication.getAuthorities() != null && !authentication.getAuthorities().isEmpty()) {
					 GrantedAuthority auxRol;
					 //Se obtiene la colección de roles del usuario
					 Collection<? extends GrantedAuthority> objRoles = authentication.getAuthorities();
					 //Se prepara para iterar la colección
					 Iterator<? extends GrantedAuthority> iterator = objRoles.iterator();
					 
				        //Se itera recorriendo todos los roles que pudiera disponer el usuario
				        while (iterator.hasNext()) {
				        	auxRol = iterator.next();
				        	Roles = Roles + auxRol.getAuthority() + ", ";
				        } 
				}
				
				//Se obtienen datos de autenticación como el nombre. Todos los datos se asignan al modelo de spring
				//para mostrar la información en las vistas.
				
				objModel.addAttribute("Nombre", authentication.getName());
				objModel.addAttribute("Roles", Roles);
				
				return "admin";
			
		
	}

}
