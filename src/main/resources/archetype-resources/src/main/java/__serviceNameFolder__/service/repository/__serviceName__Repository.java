package ${package}.${serviceNameFolder.replace('/','.')}.service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ${package}.${serviceNameFolder.replace('/','.')}.service.domain.${serviceName};

/**
 * ${serviceName}Repository  Service 
 *
 */
@Repository
public interface ${serviceName}Repository  extends JpaRepository<${serviceName}, Integer> 
{

}
