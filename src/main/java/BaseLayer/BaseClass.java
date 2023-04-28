package BaseLayer;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {
	protected static WebDriver driver;
	protected static Properties prop;

	public BaseClass() {
		prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream(
					System.getProperty("user.dir") + "//src//main//java//ConfigLayer//config.properties");
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void inilization() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//AllDrivers//chromedriver.exe");
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		
		driver=new ChromeDriver(opt);		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

		driver.get(prop.getProperty("url"));
	}

	public static void tearDown()
	{
		driver.close();
	}

	
}
