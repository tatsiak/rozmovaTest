package rozmovaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CabinetPage {
    private WebDriver driver;
    private By profileHeader = By.className("status-caption");
    public CabinetPage(WebDriver driver){this.driver = driver;}
    public boolean successfullRegistration (){
        return driver.findElement(profileHeader).isDisplayed();
    }

}
