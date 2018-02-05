package ${package}.${serviceNameFolder.replace('/','.')}.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ${package}.${serviceNameFolder.replace('/','.')}.service.domain.${serviceName};
import ${package}.${serviceNameFolder.replace('/','.')}.service.${serviceName}Service;
import ${package}.${serviceNameFolder.replace('/','.')}.dto.${serviceName}DTO;

@Controller
@RequestMapping(value = "${serviceNameFolder}")
public class ${serviceName}QueriesController {

	@Autowired	
	private ${serviceName}Service ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}Service;

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public Collection<${serviceNameDTO}> getAll() {
		List<${serviceName}DTO> ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}s = new ArrayList<${serviceName}>();
		for (${serviceName} ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)} : ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}Service.getAll()) {
			${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}s.add(${serviceName}.from${serviceName}DTO(${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}));
		}
		return ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}s;
	}

	@RequestMapping(method = RequestMethod.GET, value = "{id}")
	@ResponseBody
	public ${serviceName}DTO getById(@PathVariable Integer id) {
		${serviceName} ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}= ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}Service.getById(id);
		return ${serviceName}.to{serviceName}DTO(dto);
	}
}
