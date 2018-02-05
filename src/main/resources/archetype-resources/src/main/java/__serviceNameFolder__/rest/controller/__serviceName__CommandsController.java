package ${package}.${serviceNameFolder.replace('/','.')}.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.util.UriComponentsBuilder;

import ${package}.${serviceNameFolder.replace('/','.')}.service.domain. ${serviceName};
import ${package}.${serviceNameFolder.replace('/','.')}.service. ${serviceName}Service;
import ${package}.${serviceNameFolder.replace('/','.')}.rest.to. ${serviceName}DTO;

@Controller
@RequestMapping(value = "${serviceNameFolder}")
public class  ${serviceName}CommandsController {

	@Autowired
	private ${serviceName}Service ${serviceName.substring(0,1).toLowerCase()}${serviceName.substring(1)}Service;

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<TicketRest> create(@RequestBody @Valid TicketRest ticket, UriComponentsBuilder builder) {

		TicketDetails ticketCreated = ticketService.save(ticket.toTicketDetails());

		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(builder.path("/api/v1/tickets/{code}")
				.buildAndExpand(String.valueOf(ticketCreated.getCode())).toUri());

		TicketRest output = TicketRest.fromTicketDetails(ticketCreated);
		return new ResponseEntity<TicketRest>(output, headers, HttpStatus.CREATED);
	}

}
