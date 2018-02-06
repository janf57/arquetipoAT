package ${package}.${serviceNameFolder.replace('/','.')}.rest.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

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
import ${package}.${serviceNameFolder.replace('/','.')}.rest.dto.${serviceName}DTO;

@Controller
@RequestMapping(value = "${serviceNameFolder}")
/**
 * Controlador de queries 
 *
 * @author Jose Antonio Navarro janavarro.fuentes@atsistemas.com
 */
public class ${serviceName}QueriesController {

	@Autowired	
	private ${serviceName}Service ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}Service;

	/**
	 * Pide todos los ${serviceName}s.
	 *
	 * @return los ${serviceName}s
	 */
	@ApiOperation(value = "Recupera ${serviceName}s", tags = { "Controlador ${serviceName}s" })
	@ApiResponses(value = { //
			@ApiResponse(code = 200, message = "${serviceName}s obtenidos", response = ${serviceName}DTO.class), @ApiResponse(code = 404, message = "No encontrados") })
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public Collection<${serviceName}DTO> getAll() {
		List<${serviceName}DTO> ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}s = new ArrayList<>();
		for (${serviceName} ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)} : ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}Service.getAll()) {
			${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}s.add(${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}.to${serviceName}DTO());
		}
		return ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}s;
	}

	/**
	 * Pide un ${serviceName} por id.
	 *
	 * @param id int id del ${serviceName}
	 * @return el ${serviceName}
	 */
	@ApiImplicitParams({ //
		@ApiImplicitParam(name = "id", paramType = "header", dataType = "int") })
	@ApiOperation(value = "Recupera ${serviceName}s", tags = { "Controlador ${serviceName}s" })
	@ApiResponses(value = { //
			@ApiResponse(code = 200, message = "${serviceName} recuperado", response = ${serviceName}DTO.class), @ApiResponse(code = 404, message = "No encontrado") })
	@RequestMapping(method = RequestMethod.GET, value = "{id}")
	@ResponseBody
	public ${serviceName}DTO getById(@PathVariable Integer id) {
		${serviceName} ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)} = ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}Service.getById(id);
		return ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}.to${serviceName}DTO();
	}
}
