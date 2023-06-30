package uk.co.library.pages;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import uk.co.library.utility.Utility;

public class Login extends Utility {

    By Username = By.xpath("//input[@name='username']");
    By password = By.xpath("//input[@name='password']");
    By loginbutton = By.xpath("//div/input[@type='submit']");

    public void uname(String Uname1){sendTextToElement(Username,Uname1);}

    public void enterpw(String pw1){sendTextToElement(password,pw1);}

    public void clickbutton(){clickOnElement(loginbutton);}

    public void loginpage(){
        uname("utisletap");
        enterpw("Msm_2023");
        clickbutton();
    }
    By Registerlink = By.xpath("//div[@id='loginPanel']/p[2]/a");
    //By ClassName = ( By.className("Register") );
    By Firstname = ( By.id("First name") );
    By Lastname = ( By.id("Last name") );
    By AdressField = ( By.className("Adress") );
    By CityField = ( By.className("City") );
    By StateField = ( By.className("State") );
    By ZipCodeField = ( By.id("Zip Code") );
    By PhoneField = ( By.id("phone") );
    By SSNField = ( By.id("SSN") );
    By Emailid = ( By.id("Username") );
    By Passwordid = ( By.id("Password") );
    By MsgField = ( By.id("Conform") );
    By ClickButton = ( By.className("Register") );

    public void Reglink() {
        clickOnElement(Registerlink);
    }
    // public void ClassName(){
    //clickOnElement(Register);

    public void Firstname(String fname1) {
        sendTextToElement(Firstname, fname1);
    }

    public void Lastname(String lname1) {
        sendTextToElement(Lastname, lname1);
    }

    public void AdressField(String adress1) {
        sendTextToElement(AdressField, adress1);
    }

    public void CityField(String cityname) {
        sendTextToElement(CityField, cityname);
    }

    public void StateField(String statename) {
        sendTextToElement(StateField, statename);
    }

    public void ZipCodeField(String Zipcode) {
        sendTextToElement(ZipCodeField, Zipcode);
    }

    public void PhoneField(String phone1) {
        sendTextToElement(PhoneField, phone1);
    }

    public void SSNField(String ssn) {
        sendTextToElement(SSNField, ssn);
    }

    public void Emailid(String email) {
        sendTextToElement(Emailid, email);
    }

    public void Passwordid(String password1) {
        sendTextToElement(Passwordid, password1);
    }

    public void MsgField(String msg) {
        sendTextToElement(MsgField, msg);
    }

    public void ClickButton(String ClickButton1) {
        sendTextToElement(ClickButton, ClickButton1);
    }

    public void registerpage() {
        Reglink();
        Firstname("Jai");
        Lastname("patel");
        AdressField("20");
        CityField("Anand");
        StateField("gujarat");
        ZipCodeField("388520");
        PhoneField("07912345678");
        SSNField("1234");
        Emailid("utisletap@gmail.com");
        Passwordid("Msm_2023");
        MsgField("Msm_2023");
        ClickButton("reglink");
    }

    @AfterMethod
    public void tearDown() {
        //closeBrowser();
    }

}






























