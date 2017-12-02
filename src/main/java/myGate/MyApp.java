/**
 * 
 */
package myGate;

import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * @author sanjayprasad.burnwal
 *
 */
@ApplicationPath("/webapp")
public class MyApp extends Application{

	/**
	 * 
	 */
	public MyApp() {
		
	}
	
	@Override
	public Set<Class<?>> getClasses() {
		// TODO Auto-generated method stub
		return super.getClasses();
	}

}
