package rozmovaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class MainPage {
    private WebDriver driver;
    private By russianLanguage = By.cssSelector(".language-select > a:nth-child(2)");
    private By registrationButton = By.id("login_link");
    public MainPage(WebDriver driver){
        this.driver = driver;
    }


    public void open(){
        driver.get("http://rozmova.in.ua/");
        driver.findElement(russianLanguage).click();
    }
    public void goToRegistration(){
        driver.findElement(registrationButton).click();
    }

}
