package data;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;


public class ReadWritePropertiesFile {

	public static void main(String[] args) throws IOException  {


		FileInputStream f= new FileInputStream("C:\\testing\\prop.properties");
		Properties p1 =new Properties();
		
		p1.load(f);
		
		String browser =p1.getProperty("Browser");
		
		System.out.println(browser);
		System.out.println(p1.getProperty("Browser"));
		
		String inCorrectEmail= p1.getProperty("incorrectemail");
	
		//String inCorrectEmail= p1.getProperty("incorrectemail");
		//String ahi koipan name aapi shakay=p1.getproperty("ahi key value appvani-->which is left and side in your properties file");
		
		System.out.println(inCorrectEmail);
		System.out.println(p1.getProperty("url"));
		System.out.println(p1.getProperty("tool"));
		System.out.println(p1.getProperty("testcase"));
		
		
		p1.setProperty("defect","jira");
		
		System.out.println(p1.getProperty("defect"));
		
		//aa upper ni 2 line no data aapde browser ma joi shakiye chhiye but properties file ma add nai thayo to aene add karva mate FileoutputStream use karvanu
		
		
		
		FileOutputStream fo= new FileOutputStream("C:\\testing\\prop.properties");
		
		p1.store(fo, "Adding to the properties file");

		
		
		
		
		
		
		
		/*sir no code
		FileInputStream f = new FileInputStream("C:\\testing\\prop.properties");
		Properties prop = new Properties();
		prop.load(f);
		
		String browser = prop.getProperty("browser");
		System.out.println(browser);
		
		System.out.println(prop.getProperty("browser"));
		
		String inCorrectEmail = prop.getProperty("incorrectemail");
		System.out.println(inCorrectEmail);
		
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("tool"));
		System.out.println(prop.getProperty("testcase"));
		
		prop.setProperty("defect", "Jira");
		System.out.println(prop.getProperty("defect"));
		
		prop.setProperty("automation", "selenium");
		System.out.println(prop.getProperty("automation"));
		
		FileOutputStream fo = new FileOutputStream("C:\\testing\\prop.properties");
		prop.store(fo, "Adding to the properties file");*/

	
		
		
		
		

	}

}
