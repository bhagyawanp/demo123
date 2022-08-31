package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;
	public Properties prop;
	
	public WebDriver browserLaunch() throws IOException {

		//This will help us to read data.properties file
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
  
		// This will access the data.properties
	    prop=new Properties();
		
		prop.load(fis);
		
		String browserName =prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome") ) {
	
	  WebDriverManager.chromedriver().setup();  //This will run with latest chrome browser in your system
	      
	    // WebDriverMAnager.chromDriver.version("102.1.0").setup() // This will run with 
	      driver= new ChromeDriver();
			
		}else if(browserName.equalsIgnoreCase("firefox")) {
			
			//FireFox code
		}
         else if(browserName.equalsIgnoreCase("Edge")) {
			
			//edge code
		}
         else {
        	 System.out.println("please select valid browser");
         }
		
		return driver;
		
		
	}
	
	
	@BeforeMethod
	public void launchBrowser() throws IOException {
		
		browserLaunch();
		driver.get(prop.getProperty("url"));
		
		
	}
	
	
	@AfterMethod
	public void tearDown() throws IOException {
		
	driver.quit();
		
		
	}
	
	
}
