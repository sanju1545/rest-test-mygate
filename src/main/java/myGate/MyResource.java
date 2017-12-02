/**
 * 
 */
package myGate;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * @author sanjayprasad.burnwal
 *
 */
@Path("/myresource")
@Singleton
public class MyResource {

	private int count;
//	@QueryParam("queryVal") private String query;
	/**
	 * 
	 */
	public MyResource() {
		// TODO Auto-generated constructor stub
	}
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getMessage() {
		count = count+1;
		return "Good Job! this site has access "+count+" times.";
	}

}
