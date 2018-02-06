package ${package}.${serviceNameFolder.replace('/','.')}.rest.dto;

/**
 * Data Transfer Object para el {@link ${package}.${serviceNameFolder.replace('/','.')}.service.domain.${serviceName}} del modelo de dominio
 *
 * @author Jose Antonio Navarro janavarro.fuentes@atsistemas.com
 */
public class ${serviceName}DTO 
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PersonaDTO [id=" + id + ", descripcion=" + descripcion + "]";
	}
}
