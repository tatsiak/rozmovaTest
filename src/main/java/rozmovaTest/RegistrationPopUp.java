package rozmovaTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Random;

public class RegistrationPopUp {
    private WebDriver driver;
    public RegistrationPopUp(WebDriver driver){this.driver =driver;}

    private By emailField = By.id("register_username");
    private By nameField = By.id("register_name");
    private By surnameField = By.id("register_surname");
    private By nicknameField = By.id("register_nickname");
    private By passwordField = By.id("register_password");
    private By confirmPasswordField = By.id("register_password_confirm");
    private By bDay = By.id("register_b_day");
    private By bMonth = By.id("register_b_month");
    private By bYear = By.id("register_b_year");
    private By registerAgreed = By.id("register_agreed");
    private By register = By.xpath("//span[text()='Зарегистрироваться']");
    private By errorMessage = By.id("noty_center_layout_container");

    public void enterMail (){
        driver.findElement(emailField).sendKeys(random()+"@gmail.com");
    }
    public void enterMail(String mail) {
        driver.findElement(emailField).sendKeys(mail);
    }
    public void enterName (String name){
        driver.findElement(nameField).sendKeys(name);
    }
    public void enterSurname (String surname){
        driver.findElement(surnameField).sendKeys(surname);
    }
    public void enterNick () {
        driver.findElement(nicknameField).sendKeys(random());
    }
    public void enterNick (String nick) {
        driver.findElement(nicknameField).sendKeys(nick);
    }
    public void enterPassword (String password) {
        driver.findElement(passwordField).sendKeys(password);
    }
    public void confirmPassword (String confirmPassword) {
        driver.findElement(confirmPasswordField).sendKeys(confirmPassword);
    }
    public void chooseBDay (String day, String month, String year){
        driver.findElement(bDay).sendKeys(day);
        driver.findElement(bMonth).sendKeys(month);
        driver.findElement(bYear).sendKeys(year);
    }
    public void registerAgreed (){
        driver.findElement(registerAgreed).click();
    }
    public void clickRegister (){
        driver.findElement(register).click();
    }
    public boolean errorMessageIsShown(){
        return driver.findElement(errorMessage).isDisplayed();
    }
    public String random (){
        Random r = new Random(System.currentTimeMillis() );
        return "gates"+((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
    }


}
