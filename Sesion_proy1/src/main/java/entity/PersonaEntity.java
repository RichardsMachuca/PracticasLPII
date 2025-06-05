package entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: PersonaEntity
 *
 */
@Entity

public class PersonaEntity implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public PersonaEntity() {
		super();
	}
   
	
	public PersonaEntity(String dni, String nombre, String apellido, String edad) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}


	@Id
	private String dni;
	private String nombre;
	private String apellido;
	private String edad;

	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getEdad() {
		return edad;
	}


	public void setEdad(String edad) {
		this.edad = edad;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

	
}
