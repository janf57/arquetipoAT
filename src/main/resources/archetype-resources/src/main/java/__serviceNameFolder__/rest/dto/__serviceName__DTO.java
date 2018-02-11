package ${package}.${serviceNameFolder.replace('/','.')}.rest.dto;

import io.swagger.annotations.ApiModel;

/**
 * Data Transfer Object para el {@link ${package}.${serviceNameFolder.replace('/','.')}.service.domain.${serviceName}} del modelo de dominio
 *
 * @author Jose Antonio Navarro janavarro.fuentes@atsistemas.com
 */
@ApiModel(value = "Informacion de un ${serviceName}", description = "Datos del ${serviceName}")
public class ${serviceName}DTO 
{
	private int id;
	private String descripcion;

	/**
	 * Constructor de ${serviceName}DTO sin argumentos
	 */
	public ${serviceName}DTO () {
		
	}
	/**
	 * Constructor de ${serviceName}DTO con todos los atributos como argumentos
	 * 
	 * @param id the id to set
	 * @param descripcion the descripcion to set
	 * 
	 */
	public ${serviceName}DTO (int id, String descripcion) {
		this.id = id;
		this.descripcion = descripcion;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PersonaDTO [id=" + id + ", descripcion=" + descripcion + "]";
	}
}
