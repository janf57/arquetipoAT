package ${package}.${serviceNameFolder.replace('/','.')}.service.domain;

import javax.persistence.Entity;

import ${package}.${serviceNameFolder.replace('/','.')}.rest.dto.${serviceName}DTO;

/**
 * Clase ${serviceName} del dominio tiene su correspondiente {@link ${serviceName}DTO}
 *
 * @author Jose Antonio Navarro janavarro.fuentes@atsistemas.com
 */
@Entity
public class ${serviceName} 
{
	private int id;
	private String descripcion;

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
	
	/**
	 * Metodo estatico para obtener un ${serviceName} a partir de un ${serviceName}DTO origen
	 * 
	 * @param ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)} ${serviceName}DTO origen
	 * 
	 * @return ${serviceName}
	 */
	public static ${serviceName} from${serviceName}DTO(${serviceName}DTO ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}) {
		${serviceName} rest = new ${serviceName}();
		rest.setId(${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}.getId());
		rest.setDescripcion(${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}.getDescripcion());
		return rest;
	}
	
	/**
	 * Metodo para obtener un ${serviceName}DTO a partir de un ${serviceName} origen
	 * 
	 * @return ${serviceName}DTO
	 */
	public ${serviceName}DTO to${serviceName}DTO() {
		 ${serviceName}DTO dto = new  ${serviceName}DTO();
		 dto.setId(this.getId());
		 dto.setDescripcion(this.getDescripcion());
		return dto;
	}
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Persona [id=" + id + ", descripcion=" + descripcion + "]";
	}
}
