package com.api.crud.models;
//Marcela Rincon Ardila 2675835
import jakarta.persistence.*;

@Entity
@Table(name = "users") 

public class UserModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idusers;
	
	@Column
	private String primer_nombre; 
	
	@Column
	private String primer_apellido; 
	
	@Column
	private int edad; 
	
	@Column
	private int  fk_barrio; 
	
        @Column
	private Long celular; 
	
	@Column
	private String email; 
	
	@Column
	private String fecha_ingreso; 
	
	@Column
	private String segundo_apellido; 
	
	@Column
	private String calle; 
	
	@Column
	private String carrera; 
	
	@Column
	private String segundo_nombre; 
	
	@Column
	private String password;
        
        public UserModel(){
        
        }

	public Long getIdusers() {
		return idusers;
	}

	public void setIdusers(Long idusers) {
		this.idusers = idusers;
	}

	public String getPrimer_nombre() {
		return primer_nombre;
	}

	public void setPrimer_nombre(String primer_nombre) {
		this.primer_nombre = primer_nombre;
	}

	public String getPrimer_apellido() {
		return primer_apellido;
	}

	public void setPrimer_apellido(String primer_apellido) {
		this.primer_apellido = primer_apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getFk_barrio() {
		return fk_barrio;
	}

	public void setFk_barrio(int fk_barrio) {
		this.fk_barrio = fk_barrio;
	}

	public Long getCelular() {
		return celular;
	}

	public void setCelular(Long celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFecha_ingreso() {
		return fecha_ingreso;
	}

	public void setFecha_ingreso(String fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}

	public String getSegundo_apellido() {
		return segundo_apellido;
	}

	public void setSegundo_apellido(String segundo_apellido) {
		this.segundo_apellido = segundo_apellido;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public String getSegundo_nombre() {
		return segundo_nombre;
	}

	public void setSegundo_nombre(String segundo_nombre) {
		this.segundo_nombre = segundo_nombre;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	} 
	
	
}
