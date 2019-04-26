package ws;

import javax.ws.rs.*;

@Path("demo")
public class Demo 
{
	@GET
	@Path("hello")
	@Produces("text/plain")	
	// Hello World ohne Parameter
	public String hello()   
	{
		return "Hello World";
	}
	
	@GET 
	@Path("halloText")
	@Produces("text/plain")
	// Hello World mit Parameter, angegeben als Query Parameter ('?')
	public String halloText( @QueryParam("name") String name )
	{
	   return "Hallo " + name;
	}

	@GET 
	@Path("sum/{a}/{b}")
	@Produces("text/plain")
	// Addition mit Parametern die als Pfadbestandteile angegeben sind ('/')
	public String halloText( @PathParam("a") int a, @PathParam("b") int b )
	{
	   return "Summe = " + String.valueOf(a+b);
	}
	
}
