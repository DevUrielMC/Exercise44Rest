package com.exercise44rest.services;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/msgs")
public class Mensajes {

	
	@GET									//Si se quiere acceder por la barra de direcciones tiene que ser GET
											//Con el metodo POST no es posible acceder
	public String diHola() 
	{
		return "HOLA MUNDO DESDE EL GET";
	}
	
	@POST
	public String diHolaMundoMsg()
	{
		return "HOLA MUNDO DESDE EL POST";
	}
}
