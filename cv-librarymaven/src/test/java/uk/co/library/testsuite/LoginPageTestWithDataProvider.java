package uk.co.library.testsuite;


import org.testng.annotations.Test;
import resources.testdata.TestData;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.Register;
import uk.co.library.testbase.TestBase;

/**
 * Created by Bhavesh
 */
public class LoginPageTestWithDataProvider extends TestBase {

    HomePage homePage= new HomePage();
    Register loginPage= new Register();



    @Test(dataProvider = "logindata", dataProviderClass = TestData.class)
    public void doLogin(String username, String password){
   // homePage.clickOnLoginLink();
    //loginPage.getWelText(username,password);

    }

}
