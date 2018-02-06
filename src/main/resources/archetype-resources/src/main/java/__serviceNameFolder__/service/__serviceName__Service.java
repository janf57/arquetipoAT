package ${package}.${serviceNameFolder.replace('/','.')}.service;

import java.util.List;

import ${package}.${serviceNameFolder.replace('/','.')}.service.domain.${serviceName};

/**
 * ${serviceName} Service, define el caso de uso del API
 *
 * @author Jose Antonio Navarro janavarro.fuentes@atsistemas.com
 *
 */
public interface ${serviceName}Service 
{
	List<${serviceName}> getAll();

	${serviceName} save(${serviceName} ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)});

	${serviceName} update(${serviceName} ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)});

	${serviceName} delete(Integer id);

	${serviceName} getById(Integer id);
}
