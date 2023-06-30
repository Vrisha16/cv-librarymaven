package uk.co.library.testsuite;

import org.testng.annotations.Test;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.Login;
import uk.co.library.pages.Register;
import uk.co.library.testbase.TestBase;

/**
 * Created by Bhavesh
 */
public class LoginTest extends TestBase {
    Login logintest1 = new Login();

    HomePage homePage = new HomePage();
    Register loginPage = new Register();

    @Test
    public void reg1() {
        logintest1.loginpage();
    }

}


