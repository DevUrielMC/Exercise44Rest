package com.exercise44rest.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/msgs")
public class Mensajes {

	
	@GET
	public String diHola() 
	{
		return "HOLA MUNDO";
	}
}
