package ${package}.${serviceNameFolder.replace('/','.')}.service;

import java.util.List;

/**
 * ${serviceName} Service 
 *
 */
public interface ${serviceName}Service 
{
	List<${serviceName}> getAll();

	${serviceName} save(${serviceName} ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)});

	${serviceName} update(Integer id, ${serviceName} ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)});

	${serviceName} delete(Integer id);

	${serviceName} getById(Integer id);
}
