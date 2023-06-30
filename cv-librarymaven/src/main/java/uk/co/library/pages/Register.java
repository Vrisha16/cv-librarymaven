package uk.co.library.pages;

import uk.co.library.utility.Utility;
import org.openqa.selenium.By;

public class Register extends Utility {


    By Registerlink = By.xpath("//div[@id='loginPanel']/p[2]/a");
    //By ClassName = ( By.className("Register") );
    By Firstname = ( By.xpath("//input[@id='customer.firstName']") );
    By Lastname = ( By.xpath("//input[@id='customer.lastName']") );
    By AdressField = ( By.xpath("//input[@id='customer.address.street']") );
    By CityField = ( By.xpath("//input[@id='customer.address.city']") );
    By StateField = ( By.xpath("//input[@id='customer.address.state']") );
    By ZipCodeField = ( By.xpath("//input[@id='customer.address.zipCode']") );
    By PhoneField = ( By.xpath("//input[@id='customer.phoneNumber']") );
    By SSNField = ( By.xpath("//input[@id='customer.ssn']") );
    By Emailid = ( By.xpath("//input[@id='customer.username']") );
    By Passwordid = ( By.xpath("//input[@id='customer.password']") );
    By MsgField = ( By.xpath("//input[@id='repeatedPassword']") );
    By ClickButton = ( By.xpath("//input[@value='Register']") );

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


    }






























