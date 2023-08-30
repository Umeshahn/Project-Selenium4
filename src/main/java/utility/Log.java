package utility;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Log {
	
	private static Logger log = LogManager.getLogger(Log.class);
	
	public static void info(String message) {
		log.info(message);
	}

}
