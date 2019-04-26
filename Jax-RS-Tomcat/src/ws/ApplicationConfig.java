package ws;

// Definition der URI über Annotation anstatt über web.xml

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("rest")

//URI Beispiel:  http://localhost:8080/Jax-RS-Tomcat/rest/demo/hello

//Auswahlseite:  http://localhost:8080/Jax-RS-Tomcat/index.html

public class ApplicationConfig extends Application 
{
	//kein Code notwendig
}
