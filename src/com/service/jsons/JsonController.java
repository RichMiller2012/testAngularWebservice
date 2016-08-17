package com.service.jsons;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
 
import javax.print.attribute.standard.Media;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/service")
public class JsonController {

	@GET
	@Path("/person")
	@Produces(MediaType.APPLICATION_OCTET_STREAM)
	public Response getPersonJson(){
		File file = new File("C:/Users/R629251/workspace/JsonFactory/resources/person.json");
		
		return Response.ok(file, MediaType.APPLICATION_OCTET_STREAM)
				.build();
	}
	
	@GET
	@Path("/test")
	@Produces(MediaType.TEXT_PLAIN)
	public Response getTestString(){
		String testString = "This is a quick rest template test string";
		
		return Response.ok(testString, MediaType.TEXT_PLAIN)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
				.build();
	}
	
}
