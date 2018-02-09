package ${package}.${serviceNameFolder.replace('/','.')};

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Clase principal, anotada como SpringBootApplication
 *
 * @author Jose Antonio Navarro janavarro.fuentes@atsistemas.com
 */
@SpringBootApplication
@EnableSwagger2
@ComponentScan({"${package}.${serviceNameFolder.replace('/','.')}.*"})
public class ${serviceName}Application 
{
	public static void main( String[] args )
	{
		SpringApplication.run(${serviceName}Application.class, args);
	}
}
