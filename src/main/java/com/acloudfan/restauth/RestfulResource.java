package com.acloudfan.restauth;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.acloudfan.jaxauthfilter.AuthorizeCall;



/**
 * This is the template for creating a RESTful resource
 * 
 * Consumer creation:
 *    1. Bind to the common Auth UPS instance
 *    2. Read the credentials from the UPS
 *    3. For unprotected resources nothing needs to be done
 *    4. For protected - Set the following header with the information from credentials
 *         X_MS_CLIENT_KEY = credentials.clientkey
 *         X_MS_CLIENT_SECRET = credentials.clientsecret
 * 
 */

@Path("/")
public class RestfulResource {

	@GET
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.TEXT_PLAIN)
	@Path("open")
	public	String	simple(){
		return "simple";
	}
	
	@GET
	@Path("protected")		
	@AuthorizeCall
	public String post(@QueryParam("msg") String msg){
		return "Get Query="+msg;
	}
	
}
