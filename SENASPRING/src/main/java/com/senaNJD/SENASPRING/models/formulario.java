package com.senaNJD.SENASPRING.models;
import java.sql.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.*;

import jakarta.persistence.Table;

@Entity
@Table(name="formularios")
public class formulario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int idformulario;
	private String nombreFormulario;
	private String descripcionFormulario;
	private String formularioCreadoPor;
	private String formularioDiligenciadPor;
	
	@Column(columnDefinition = "text")
	private Date fechaCreacion;
	private Date fechaDiligenciamiento;
	private Date fechaModificacion;
	
	public int getIdformulario() {
		return idformulario;
	}
	public void setIdformulario(int idformulario) {
		this.idformulario = idformulario;
	}
	public String getNombreFormulario() {
		return nombreFormulario;
	}
	public void setNombreFormulario(String nombreFormulario) {
		this.nombreFormulario = nombreFormulario;
	}
	public String getDescripcionFormulario() {
		return descripcionFormulario;
	}
	public void setDescripcionFormulario(String descripcionFormulario) {
		this.descripcionFormulario = descripcionFormulario;
	}
	public String getFormularioCreadoPor() {
		return formularioCreadoPor;
	}
	public void setFormularioCreadoPor(String formularioCreadoPor) {
		this.formularioCreadoPor = formularioCreadoPor;
	}
	public String getFormularioDiligenciadPor() {
		return formularioDiligenciadPor;
	}
	public void setFormularioDiligenciadPor(String formularioDiligenciadPor) {
		this.formularioDiligenciadPor = formularioDiligenciadPor;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public Date getFechaDiligenciamiento() {
		return fechaDiligenciamiento;
	}
	public void setFechaDiligenciamiento(Date fechaDiligenciamiento) {
		this.fechaDiligenciamiento = fechaDiligenciamiento;
	}
	public Date getFechaModificacion() {
		return fechaModificacion;
	}
	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	
	
	
	
		
	
}


