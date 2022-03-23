package alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo 
{
	
	// Creating an object of LogManager and passing the class name to get the access of the public class
	private static Logger log=LogManager.getLogger(Demo.class.getName());

	public static void main(String[] args) 
	{
		log.debug("it is debuging");
		log.info("object is present");
		log.error("object is not present");

		log .fatal("this is fatal");
	}

}
