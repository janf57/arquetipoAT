package ${package}.${serviceNameFolder.replace('/','.')};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Clase principal, anotada como SpringBootApplication
 *
 * @author Jose Antonio Navarro janavarro.fuentes@atsistemas.com
 */
@SpringBootApplication
public class ${serviceName}Application 
{
	public static void main( String[] args )
	{
		SpringApplication.run(${serviceName}Application.class, args);
	}
}
