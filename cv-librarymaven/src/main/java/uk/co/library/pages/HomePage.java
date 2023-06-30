package uk.co.library.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import uk.co.library.utility.Utility;




/**
 * Created by Bhavesh
 */
public class HomePage extends Utility {

  //private static final Logger log = LogManager.getLogger(HomePage.class.getName());
   //public HomePage(){Pagefactory.initElements(driver,this);}
  By Titlename = By.xpath("//input[@id='keywords']");
   By Location = By.xpath("//input[@id='location']");
   By salary = By.xpath("//input[@id='salarymin']");
    By salary1 = By.xpath("//input[@id='salarymax']");
    By findJob = By.xpath("//input[@id='hp-search-btn']");

    public void enterjobtitle(String jobTitle) {
        sendTextToElement(Titlename, jobTitle);
    }

    public void enterlocation(String location) {
        sendTextToElement(Location, location);
    }

    public void selectDistance(String distance) {
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='distance']"));
        Select select= new Select(dropdown);
     select.selectByVisibleText(distance);

    }
    public void clickOnMoreSearchOptionLink() {
        WebElement dropdown = driver.findElement(By.xpath("//button[@id='toggle-hp-search']"));
    }

    public void enterMinSalary(String minSalary) {
        sendTextToElement(salary, minSalary);
    }

    public void enterMaxSalary(String maxSalary) {
        sendTextToElement(salary1, maxSalary);
    }

    public void selectSalaryType(String sType) {
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='tempperm']"));
        Select select= new Select(dropdown);
        select.selectByVisibleText(sType);
    }
    public void selectJobType(String jobType) {
        WebElement dropDown = driver.findElement(By.xpath("//select[@class='hp-jobtype form__select']"));
        Select select= new Select(dropDown);
        select.selectByVisibleText(jobType);
    }
    public  void clickOnFindJobsButton(){}

    public void iframeHandle() throws InterruptedException {
        driver.switchTo().frame("gdpr-consent-notice");
        driver.findElement(By.xpath("//button[@id='save']")).click();
        driver.switchTo().defaultContent();
    }
    public void verifyJobSearchResultUsingDifferentDataSet(){

        enterjobtitle("Tester");
       enterlocation ("Harrow");
        selectDistance("upto 5 miles");
        clickOnMoreSearchOptionLink();
         enterMinSalary  ("30000");
        enterMaxSalary ("50000");
        selectSalaryType  ("per annum");
       selectJobType  ("permanent");
        clickOnFindJobsButton();

    }

}













