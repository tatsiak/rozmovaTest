package rozmovaTest;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


public class AbstractTest {
    protected WebDriver driver;
    protected MainPage mainPage;
    protected RegistrationPopUp registrationPopUp;
    protected CabinetPage cabinetPage;
    @Before
    public void preCondition(){
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        mainPage = new MainPage(driver);
        registrationPopUp = new RegistrationPopUp(driver);
        cabinetPage = new CabinetPage(driver);
    }
    @After
    public  void postCondition(){
       // driver.close();
    }

}
