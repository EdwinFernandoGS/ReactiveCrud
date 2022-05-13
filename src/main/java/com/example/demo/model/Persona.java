package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("persona")
public class Persona {
	
	@Id
	private int id;
	
	private String nombres;
	private String pri_apell;
	private String seg_apell;
	private String telefono;
	private String email;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Persona(int id, String nombres, String pri_apell, String seg_apell, String telefono, String email) {
		super();
		this.id = id;
		this.nombres = nombres;
		this.pri_apell = pri_apell;
		this.seg_apell = seg_apell;
		this.telefono = telefono;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getPri_apell() {
		return pri_apell;
	}

	public void setPri_apell(String pri_apell) {
		this.pri_apell = pri_apell;
	}

	public String getSeg_apell() {
		return seg_apell;
	}

	public void setSeg_apell(String seg_apell) {
		this.seg_apell = seg_apell;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
