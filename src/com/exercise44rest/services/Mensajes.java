package com.exercise44rest.services;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HEAD;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/msgs")
public class Mensajes {

	
	@GET									//Si se quiere acceder por la barra de direcciones tiene que ser GET
											//Con el metodo POST no es posible acceder
	public String diHolaGET() 
	{
		return "HOLA MUNDO DESDE EL GET";
	}
	
	@POST
	public String diHolaPOST()
	{
		return "HOLA MUNDO DESDE EL POST";
	}
	
	@PUT
	public String diHolaPUT()
	{
		return "HOLA MUNDO DESDE EL PUT";
	}
	@DELETE
	public String diHolaDELETE()
	{
		return "HOLA MUNDO DESDE EL DELETE";
	}
	@HEAD
	public String diHolaHEAD()
	{
		return "HOLA MUNDO DESDE EL HEAD";
	}
	@OPTIONS
	public String diHolaOPTIONS()
	{
		return "HOLA MUNDO DESDE EL OPTIONS";
	}
	
	@GET
	@Path("/holaFulanito")
	public String diHolaFulanito(@QueryParam("nombre")String nombre) {  //que querry param pide un parametro
		return "Hola "+ nombre;		//http://localhost:8080/Exercise44Rest/msgs/holaFulanito/?nombre=URIEL
	}
	
	@GET
	@Path("/{nombre}")
	public String diHolaFulanito2(@PathParam("nombre")String nombre) {  //que querry param pide un parametro
		return "Hola " + nombre+ ",esto es generation!!";    //http://localhost:8080/Exercise44Rest/msgs/nombre
	}		
	
	@POST
	@Path("/suma/{numero1}/{numero2}")
	public double sumaNumeros (@PathParam("numero1")double numero1,@PathParam("numero2")double numero2)
	{
		return numero1+numero2;		//http://localhost:8080/Exercise44Rest/msgs/suma/5/5
	}
	
	@GET
	@Path("/suma/")
	public double sumaNumerosGET (@QueryParam("numero1")double numero1,@QueryParam("numero2")double numero2)
	{
		return numero1+numero2;		//http://localhost:8080/Exercise44Rest/msgs/suma?numero1=4&numero2=5
	}
	
	@GET
	@Path("/resta/{numero1}/{numero2}")
	@Produces(MediaType.APPLICATION_JSON)
	public double restaNumerosGET (@PathParam("numero1")double minuendo,@PathParam("numero2")double sustraendo)
	{
		return minuendo-sustraendo;		//http://localhost:8080/Exercise44Rest/msgs/resta/10/2
	}
}
