package ${package}.${serviceNameFolder.replace('/','.')}.service.domain;

import javax.persistence.Entity;

import ${package}.${serviceNameFolder.replace('/','.')}.dto.${serviceName}DTO;

/**
 * Clase del dominio ${serviceName} 
 *
 * @author Jose Antonio Navarro janavarro.fuentes@atsistemas.com
 */
@Entity
public class ${serviceName} 
{
	private int id;
	private String descripcion;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	

	public static ${serviceName} from${serviceName}DTO(${serviceName}DTO ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}) {
		${serviceName} rest = new ${serviceName}();
		rest.setId(${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}.getId());
		rest.setDescripcion(${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}.getDescripcion());
		return rest;
	}

	public ${serviceName}DTO to${serviceName}DTO() {
		 ${serviceName}DTO dto = new  ${serviceName}DTO();
		 dto.setId(this.getId());
		 dto.setDescripcion(this.getDescripcion());
		return dto;
	}
}
