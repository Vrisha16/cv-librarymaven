package uk.co.library.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import uk.co.library.pages.HomePage;
import uk.co.library.testbase.TestBase;

/**
 * Created by Bhavesh
 */
public class LoginPageTest extends TestBase {
    HomePage homePage = new HomePage();

    @BeforeMethod
    public void inlt() {
        homePage = new HomePage();
    }
    @Test
    public void home() throws InterruptedException {
        homePage.iframeHandle();}
    @Test
            public void home1(){
        homePage.verifyJobSearchResultUsingDifferentDataSet();

        }


    }




