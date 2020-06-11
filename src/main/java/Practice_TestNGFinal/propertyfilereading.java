package Practice_TestNGFinal;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;

public class propertyfilereading {
	
	static void log4jpropertyfile(String sPathpropertyfile) throws Exception
	{
		FileInputStream fi=new FileInputStream(sPathpropertyfile);
		Properties props =new Properties();
		props.load(fi);
      PropertyConfigurator.configure(props);
		
	}

}
