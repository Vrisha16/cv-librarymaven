package uk.co.library.driverfactory;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.propertyreader.PropertyReader;

/**
 * Created by Bhavesh
 */
public class ManageDriver {

    //public static WebDriver driver;
    public static WebDriver driver;
    public String baseUrl = PropertyReader.getInstance().getProperty("baseUrl");
    public String baseurl1 =PropertyReader.getInstance().getProperty("baseurl");
    public String secondInString = PropertyReader.getInstance().getProperty("implicitywait");

    public ManageDriver(){
        PageFactory.initElements(driver,this);
        PropertyConfigurator.configure(System.getProperty("User.dir")+"/src/test/java/resourses");
    }


    public void selectBrowser(String browser){
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong browser name");
        }
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get(baseUrl);
    }

    public void closeBrowser(){
        if (driver != null){
            driver.quit();
        }
    }

}
