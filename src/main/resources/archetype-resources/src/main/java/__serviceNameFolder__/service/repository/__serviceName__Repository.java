package ${package}.${serviceNameFolder.replace('/','.')}.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ${package}.${serviceNameFolder.replace('/','.')}.service.domain.${serviceName};

/**
 * ${serviceName}Repository Repositorio para el almacenamiento de {@link ${package}.${serviceNameFolder.replace('/','.')}.service.domain.${serviceName}} 
 *
 * @author Jose Antonio Navarro janavarro.fuentes@atsistemas.com
 *
 */
@Repository
public interface ${serviceName}Repository  extends JpaRepository<${serviceName}, Integer> 
{

}
