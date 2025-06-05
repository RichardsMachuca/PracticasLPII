package entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Animal
 *
 */
@Entity
@Table(name = "tb_animal")
public class Animal implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Animal() {
		super();
	}	
	
	public Animal(Integer animalId, String nombreAnimal, String dniEncargado, BigDecimal precioAnimal,
			Date fechaNacimiento, Date fechaMoraVenta, boolean estado) {
		super();
		this.animalId = animalId;
		this.nombreAnimal = nombreAnimal;
		this.dniEncargado = dniEncargado;
		this.precioAnimal = precioAnimal;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaMoraVenta = fechaMoraVenta;
		this.estado = estado;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) //Para que mi tabla se autoincrementable
	@Column(name="animal_id", nullable=false) //para no tener un campo vacio
	private Integer animalId;
	
	@Column(name="nombre_animal" , nullable=false)
	private String nombreAnimal;
		
	@Column(
			name="dni_encargado",
			nullable=false,              // Que sea obligatorio
			length=8,                    // Cantidad del campo siempre va ser 8
			columnDefinition="CHAR(8)",  // Quiero que sea char-menos espacio de memoria
			unique=true                  // Que no se repita el valor
			) 
	private String dniEncargado;
	
	@Column(
			name="precio_animal",
			nullable=false,              // Que sea obligatorio
			scale=2                      // Acepte dos decimales
			) 
	private BigDecimal precioAnimal;
	
	@Column(
			name="fecha_nacimiento",
			nullable=false,              // Que sea obligatorio
			updatable=false              // No se debe actualizar
			) 	
	@Temporal(TemporalType.DATE)          //Formato
	private Date fechaNacimiento;
	
	@Column(
			name="fecha_hora_venta",
			nullable=false,              // Que sea obligatorio
			updatable=false              // No se debe actualizar
			) 	
	@Temporal(TemporalType.TIMESTAMP)          //Formato
	private Date fechaMoraVenta;
	
	@Column(name="estado")                // Si no pasamos el valor automaticamente pasa el true
	private boolean estado=true;

	public Integer getAnimalId() {
		return animalId;
	}

	public void setAnimalId(Integer animalId) {
		this.animalId = animalId;
	}

	public String getNombreAnimal() {
		return nombreAnimal;
	}

	public void setNombreAnimal(String nombreAnimal) {
		this.nombreAnimal = nombreAnimal;
	}

	public String getDniEncargado() {
		return dniEncargado;
	}

	public void setDniEncargado(String dniEncargado) {
		this.dniEncargado = dniEncargado;
	}

	public BigDecimal getPrecioAnimal() {
		return precioAnimal;
	}

	public void setPrecioAnimal(BigDecimal precioAnimal) {
		this.precioAnimal = precioAnimal;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Date getFechaMoraVenta() {
		return fechaMoraVenta;
	}

	public void setFechaMoraVenta(Date fechaMoraVenta) {
		this.fechaMoraVenta = fechaMoraVenta;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
   
}
