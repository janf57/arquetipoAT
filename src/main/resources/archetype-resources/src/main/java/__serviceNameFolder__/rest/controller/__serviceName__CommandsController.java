package ${package}.${serviceNameFolder.replace('/','.')}.rest.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import ${package}.${serviceNameFolder.replace('/','.')}.service.domain.${serviceName};
import ${package}.${serviceNameFolder.replace('/','.')}.service.${serviceName}Service;
import ${package}.${serviceNameFolder.replace('/','.')}.rest.dto.${serviceName}DTO;

@RestController
@RequestMapping(value = "${serviceNameFolder}")
@Api(value = "${serviceName}CommandsController", produces = "application/json")
/**
 * Controlador de commands 
 *
 * @author Jose Antonio Navarro janavarro.fuentes@atsistemas.com
 */
public class  ${serviceName}CommandsController {

	@Autowired
	private ${serviceName}Service ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}Service;

    /**
     * Crea ${serviceName}.
     *
     * @param ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)} ${serviceName}DTO
     * @param builder UriComponentsBuilder
     * @return ${serviceName}DTO
     */
	@ApiImplicitParams({ //
		@ApiImplicitParam(name = "${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}", paramType = "header", dataType = "${serviceName}DTO") })
	@ApiOperation(value = "Crea un ${serviceName}", tags = { "Controlador ${serviceName}s" })
	@ApiResponses(value = { //
			@ApiResponse(code = 200, message = "${serviceName} creado", response = ${serviceName}DTO.class), @ApiResponse(code = 404, message = "No creado") })
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<${serviceName}DTO> create(@RequestBody @Valid ${serviceName}DTO ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}, UriComponentsBuilder builder) {

		${serviceName} ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}Created = ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}Service.save(${serviceName}.from${serviceName}DTO(${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}));

		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(builder.path("${serviceNameFolder}/{id}")
				.buildAndExpand(String.valueOf(${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}Created.getId())).toUri());

		${serviceName}DTO output = ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}Created.to${serviceName}DTO();
		return new ResponseEntity<>(output, headers, HttpStatus.CREATED);
	}

    /**
     * Actualiza ${serviceName}.
     *
     * @param ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)} ${serviceName}DTO
     * @param builder UriComponentsBuilder
     * @return ${serviceName}DTO
     */
	@ApiImplicitParams({ //
		@ApiImplicitParam(name = "${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}", paramType = "header", dataType = "${serviceName}DTO") })
	@ApiOperation(value = "Actualiza un ${serviceName}", tags = { "Controlador ${serviceName}s" })
	@ApiResponses(value = { //
			@ApiResponse(code = 200, message = "${serviceName} actualiza", response = ${serviceName}DTO.class), @ApiResponse(code = 404, message = "No actualizado") })
	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<${serviceName}DTO> update(@RequestBody @Valid ${serviceName}DTO ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}, UriComponentsBuilder builder) {

		${serviceName} ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}Created = ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}Service.save(${serviceName}.from${serviceName}DTO(${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}));

		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(builder.path("${serviceNameFolder}/{id}")
				.buildAndExpand(String.valueOf(${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}Created.getId())).toUri());

		${serviceName}DTO output = ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}Created.to${serviceName}DTO();
		return new ResponseEntity<>(output, headers, HttpStatus.ACCEPTED);
	}
	#if ($type == "DELETE")
    /**
     * Borra ${serviceName}.
     *
     * @param id Integer
     * @return ${serviceName}DTO
     */
	@ApiImplicitParams({ //
		@ApiImplicitParam(name = "id", paramType = "header", dataType = "int") })
	@ApiOperation(value = "Elimina un ${serviceName}", tags = { "Controlador ${serviceName}s" })
	@ApiResponses(value = { //
			@ApiResponse(code = 200, message = "${serviceName} eliminado", response = ${serviceName}DTO.class), @ApiResponse(code = 404, message = "No eliminado") })
	@RequestMapping(method = RequestMethod.DELETE, value = "{id}")
	public ResponseEntity<${serviceName}DTO> delete(@PathVariable Integer id) {

		${serviceName} ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}Deleted = ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}Service.delete(id);

		HttpHeaders headers = new HttpHeaders();
		
		${serviceName}DTO output = ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}Deleted.to${serviceName}DTO();
		return new ResponseEntity<>(output, headers, HttpStatus.ACCEPTED);
	}
	#end
}
