package ${package}.${serviceNameFolder.replace('/','.')}.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticketapp.services.api.objects.TicketDetails;
import com.ticketapp.services.domain.Account;
import com.ticketapp.services.domain.Ticket;
import com.ticketapp.services.repository.AccountRepository;
import com.ticketapp.services.repository.TicketRepository;

import ${package}.${serviceNameFolder.replace('/','.')}.service.${serviceName}Service;

/**
 * Implementacion interna de  {@link ${serviceName}Service}. Esta clase no se debe acceder directamente
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
	public ${serviceName} update(Integer id, ${serviceName} ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}) {
		${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)} = ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}Repository.update(id, ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)});

		return ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)};

	}
	
	@Override
	public ${serviceName} delete(Integer id) {
		${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}Repository.delete(id);

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
