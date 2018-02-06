package ${package}.${serviceNameFolder.replace('/','.')}.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ${package}.${serviceNameFolder.replace('/','.')}.service.domain.${serviceName};
import ${package}.${serviceNameFolder.replace('/','.')}.service.repository.${serviceName}Repository;
import ${package}.${serviceNameFolder.replace('/','.')}.service.${serviceName}Service;

/**
 * Implementacion interna de {@link ${package}.${serviceNameFolder.replace('/','.')}.service.${serviceName}Service}. Esta clase no se debe acceder directamente
 *
 * @author Jose Antonio Navarro janavarro.fuentes@atsistemas.com
 */
@Service
public class ${serviceName}ServiceImpl implements ${serviceName}Service 
{
	@Autowired
	private ${serviceName}Repository ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}Repository;

	@Override
	public List<${serviceName}> getAll() {
		List<${serviceName}> ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}s = ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}Repository.findAll();

		return ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}s;
	}


	@Override
	public ${serviceName} save(${serviceName} ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}) {
		${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)} = ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}Repository.save(${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)});

		return ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)};

	}

	@Override
	public ${serviceName} update(${serviceName} ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}) {
		${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)} = ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}Repository.save(${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)});

		return ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)};

	}

	@Override
	public ${serviceName} delete(Integer id) {
		${serviceName} ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)} = getById(id);

		List<${serviceName} > ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}List = new ArrayList<>();

		${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}List.add(${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)});
		${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}Repository.deleteInBatch(${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}List);

		return ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)};
	}
	@Override
	public ${serviceName} getById(Integer id) {
		${serviceName} domain = ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}Repository.findOne(id);
		if (domain == null) {
			return null;// not found
		}
		return domain;
	}
}
