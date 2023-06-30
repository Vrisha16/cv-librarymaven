package uk.co.library.testsuite;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import uk.co.library.excelutility.ExcelUtility;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.Register;
import uk.co.library.testbase.TestBase;

public class LoginTestWithExcelData extends TestBase {
    public static final String FILE_PATH = System.getProperty("user.dir") + "/src/test/java/resources/testdata/ExcelData.xlsx";

    HomePage homePage = new HomePage();
    Register loginPage = new Register();

    @BeforeClass
    public void setExcel(){
        //Tell the code about the location of Excel file
        try {
            ExcelUtility.setExcelFile(FILE_PATH, "LoginTests");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @DataProvider
    public Object[][] getData(){
        return ExcelUtility.getTestData("Invalid_Login");
    }

    @Test
    public void verifyErrorMessageWithInvalidCredentials(String username, String password) {

    }

}
