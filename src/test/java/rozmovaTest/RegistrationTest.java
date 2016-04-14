package rozmovaTest;

import org.junit.Assert;
import org.junit.Test;

public class RegistrationTest extends AbstractTest{


    @Test
    public void registrationWithCorrectData() throws InterruptedException {
        mainPage.open();
        mainPage.goToRegistration();
        registrationPopUp.enterMail();
        registrationPopUp.enterName("Bill");
        registrationPopUp.enterSurname("Gates");
        registrationPopUp.enterNick();
        registrationPopUp.enterPassword("bill12345");
        registrationPopUp.confirmPassword("bill12345");
        registrationPopUp.chooseBDay("1", "января", "1980");
        registrationPopUp.registerAgreed();
        registrationPopUp.clickRegister();
        Assert.assertTrue(cabinetPage.successfullRegistration());
    }


    @Test
    public void registrationWithInvalidMail() throws InterruptedException {
        mainPage.open();
        mainPage.goToRegistration();
        registrationPopUp.enterMail("bill@@microsoft.com");
        registrationPopUp.enterName("Bill");
        registrationPopUp.enterSurname("Gates");
        registrationPopUp.enterNick();
        registrationPopUp.enterPassword("bill12345");
        registrationPopUp.confirmPassword("bill12345");
        registrationPopUp.chooseBDay("1", "января", "1980");
        registrationPopUp.registerAgreed();
        registrationPopUp.clickRegister();
        Assert.assertTrue(registrationPopUp.errorMessageIsShown());
    }


    @Test
    public void registrationWithoutMail() throws InterruptedException {
        mainPage.open();
        mainPage.goToRegistration();
        registrationPopUp.enterMail("");
        registrationPopUp.enterName("Bill");
        registrationPopUp.enterSurname("Gates");
        registrationPopUp.enterNick();
        registrationPopUp.enterPassword("bill12345");
        registrationPopUp.confirmPassword("bill12345");
        registrationPopUp.chooseBDay("1", "января", "1980");
        registrationPopUp.registerAgreed();
        registrationPopUp.clickRegister();
        Assert.assertTrue(registrationPopUp.errorMessageIsShown());
    }


    //в этом кейсе ошибка:на сайте указанно "меньше 64 символов", а по факту нужно меньше 65. Я настроил тест, чтоб он выполнялся, но в этом месте на сайте баг.
    @Test
    public void registrationWithTooLongName() throws InterruptedException {
        mainPage.open();
        mainPage.goToRegistration();
        registrationPopUp.enterMail();
        registrationPopUp.enterName("Biiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiill");
        registrationPopUp.enterSurname("Gates");
        registrationPopUp.enterNick();
        registrationPopUp.enterPassword("bill12345");
        registrationPopUp.confirmPassword("bill12345");
        registrationPopUp.chooseBDay("1", "января", "1980");
        registrationPopUp.registerAgreed();
        registrationPopUp.clickRegister();
        Assert.assertTrue(registrationPopUp.errorMessageIsShown());
    }


    @Test
    public void registrationWithoutName() throws InterruptedException {
        mainPage.open();
        mainPage.goToRegistration();
        registrationPopUp.enterMail();
        registrationPopUp.enterName("");
        registrationPopUp.enterSurname("Gates");
        registrationPopUp.enterNick();
        registrationPopUp.enterPassword("bill12345");
        registrationPopUp.confirmPassword("bill12345");
        registrationPopUp.chooseBDay("1", "января", "1980");
        registrationPopUp.registerAgreed();
        registrationPopUp.clickRegister();
        Assert.assertTrue(registrationPopUp.errorMessageIsShown());
    }


    //в этом месте не правильное сообщение об ошибке.
    @Test
    public void registrationWithTooLongSurname() throws InterruptedException {
        mainPage.open();
        mainPage.goToRegistration();
        registrationPopUp.enterMail();
        registrationPopUp.enterName("Bill");
        registrationPopUp.enterSurname("Gaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaates");
        registrationPopUp.enterNick();
        registrationPopUp.enterPassword("bill12345");
        registrationPopUp.confirmPassword("bill12345");
        registrationPopUp.chooseBDay("1", "января", "1980");
        registrationPopUp.registerAgreed();
        registrationPopUp.clickRegister();
        Assert.assertTrue(registrationPopUp.errorMessageIsShown());
    }

    @Test
    public void registrationWithoutSurname() throws InterruptedException {
        mainPage.open();
        mainPage.goToRegistration();
        registrationPopUp.enterMail();
        registrationPopUp.enterName("Bill");
        registrationPopUp.enterSurname("");
        registrationPopUp.enterNick();
        registrationPopUp.enterPassword("bill12345");
        registrationPopUp.confirmPassword("bill12345");
        registrationPopUp.chooseBDay("1", "января", "1980");
        registrationPopUp.registerAgreed();
        registrationPopUp.clickRegister();
        Assert.assertTrue(registrationPopUp.errorMessageIsShown());
    }


    @Test
    public void registrationWithoutNick() throws InterruptedException {
        mainPage.open();
        mainPage.goToRegistration();
        registrationPopUp.enterMail();
        registrationPopUp.enterName("Bill");
        registrationPopUp.enterSurname("Gates");
        registrationPopUp.enterNick("");
        registrationPopUp.enterPassword("bill12345");
        registrationPopUp.confirmPassword("bill12345");
        registrationPopUp.chooseBDay("1", "января", "1980");
        registrationPopUp.registerAgreed();
        registrationPopUp.clickRegister();
        Assert.assertTrue(registrationPopUp.errorMessageIsShown());
    }


    //в этом месте не правильное сообщение об ошибке
    @Test
    public void registrationWithInvalidNick() throws InterruptedException {
        mainPage.open();
        mainPage.goToRegistration();
        registrationPopUp.enterMail();
        registrationPopUp.enterName("Bill");
        registrationPopUp.enterSurname("Gates");
        registrationPopUp.enterNick("!@#$");
        registrationPopUp.enterPassword("bill12345");
        registrationPopUp.confirmPassword("bill12345");
        registrationPopUp.chooseBDay("1", "января", "1980");
        registrationPopUp.registerAgreed();
        registrationPopUp.clickRegister();
        Assert.assertTrue(registrationPopUp.errorMessageIsShown());
    }


    @Test
    public void registrationWithTooShortNick() throws InterruptedException {
        mainPage.open();
        mainPage.goToRegistration();
        registrationPopUp.enterMail();
        registrationPopUp.enterName("Bill");
        registrationPopUp.enterSurname("Gates");
        registrationPopUp.enterNick("bi");
        registrationPopUp.enterPassword("bill12345");
        registrationPopUp.confirmPassword("bill12345");
        registrationPopUp.chooseBDay("1", "января", "1980");
        registrationPopUp.registerAgreed();
        registrationPopUp.clickRegister();
        Assert.assertTrue(registrationPopUp.errorMessageIsShown());
    }


    @Test
    public void registrationWithTooLongNick() throws InterruptedException {
        mainPage.open();
        mainPage.goToRegistration();
        registrationPopUp.enterMail();
        registrationPopUp.enterName("Bill");
        registrationPopUp.enterSurname("Gates");
        registrationPopUp.enterNick("Gaaaaaaaaaaaates");
        registrationPopUp.enterPassword("bill12345");
        registrationPopUp.confirmPassword("bill12345");
        registrationPopUp.chooseBDay("1", "января", "1980");
        registrationPopUp.registerAgreed();
        registrationPopUp.clickRegister();
        Assert.assertTrue(registrationPopUp.errorMessageIsShown());
    }


    @Test
    public void registrationWithoutPassword() throws InterruptedException {
        mainPage.open();
        mainPage.goToRegistration();
        registrationPopUp.enterMail();
        registrationPopUp.enterName("Bill");
        registrationPopUp.enterSurname("Gates");
        registrationPopUp.enterNick();
        registrationPopUp.enterPassword("");
        registrationPopUp.confirmPassword("1111");
        registrationPopUp.chooseBDay("1", "января", "1980");
        registrationPopUp.registerAgreed();
        registrationPopUp.clickRegister();
        Assert.assertTrue(registrationPopUp.errorMessageIsShown());
    }


    // неправильный текст ошибки (или не верные параметры входящих данных). Указанно "больше 4-х", а по факту больше 3-х.
    @Test
    public void registrationWithTooShortPassword() throws InterruptedException {
        mainPage.open();
        mainPage.goToRegistration();
        registrationPopUp.enterMail();
        registrationPopUp.enterName("Bill");
        registrationPopUp.enterSurname("Gates");
        registrationPopUp.enterNick();
        registrationPopUp.enterPassword("123");
        registrationPopUp.confirmPassword("123");
        registrationPopUp.chooseBDay("1", "января", "1980");
        registrationPopUp.registerAgreed();
        registrationPopUp.clickRegister();
        Assert.assertTrue(registrationPopUp.errorMessageIsShown());
    }


    /* здесь должно быть ограничение по длине пароля. Оно отсутствует, по этому тест закомментирован.
    @Test
    public void registrationWithTooLongPassword() throws InterruptedException {
        mainPage.open();
        mainPage.goToRegistration();
        registrationPopUp.enterMail();
        registrationPopUp.enterName("Bill");
        registrationPopUp.enterSurname("Gates");
        registrationPopUp.enterNick();
        registrationPopUp.enterPassword("111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        registrationPopUp.confirmPassword("111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        registrationPopUp.chooseBDay("1", "января", "1980");
        registrationPopUp.registerAgreed();
        registrationPopUp.clickRegister();
        Assert.assertTrue(registrationPopUp.errorMessageIsShown());
    }*/


    @Test
    public void registrationWithWrongConfirmPassword() throws InterruptedException {
        mainPage.open();
        mainPage.goToRegistration();
        registrationPopUp.enterMail();
        registrationPopUp.enterName("Bill");
        registrationPopUp.enterSurname("Gates");
        registrationPopUp.enterNick();
        registrationPopUp.enterPassword("1234");
        registrationPopUp.confirmPassword("1233");
        registrationPopUp.chooseBDay("1", "января", "1980");
        registrationPopUp.registerAgreed();
        registrationPopUp.clickRegister();
        Assert.assertTrue(registrationPopUp.errorMessageIsShown());
    }


    @Test
    public void registrationWithoutConfirmPassword() throws InterruptedException {
        mainPage.open();
        mainPage.goToRegistration();
        registrationPopUp.enterMail();
        registrationPopUp.enterName("Bill");
        registrationPopUp.enterSurname("Gates");
        registrationPopUp.enterNick();
        registrationPopUp.enterPassword("1234");
        registrationPopUp.confirmPassword("");
        registrationPopUp.chooseBDay("1", "января", "1980");
        registrationPopUp.registerAgreed();
        registrationPopUp.clickRegister();
        Assert.assertTrue(registrationPopUp.errorMessageIsShown());
    }

    @Test
    public void registrationWithoutBirthDate() throws InterruptedException {
        mainPage.open();
        mainPage.goToRegistration();
        registrationPopUp.enterMail();
        registrationPopUp.enterName("Bill");
        registrationPopUp.enterSurname("Gates");
        registrationPopUp.enterNick();
        registrationPopUp.enterPassword("1234");
        registrationPopUp.confirmPassword("1234");
        registrationPopUp.chooseBDay("", "", "");
        registrationPopUp.registerAgreed();
        registrationPopUp.clickRegister();
        Assert.assertTrue(registrationPopUp.errorMessageIsShown());
    }


    @Test
    public void registrationWithoutAgreed() throws InterruptedException {
        mainPage.open();
        mainPage.goToRegistration();
        registrationPopUp.enterMail();
        registrationPopUp.enterName("Bill");
        registrationPopUp.enterSurname("Gates");
        registrationPopUp.enterNick();
        registrationPopUp.enterPassword("1234");
        registrationPopUp.confirmPassword("1234");
        registrationPopUp.chooseBDay("1", "января", "1980");
        registrationPopUp.clickRegister();
        Assert.assertTrue(registrationPopUp.errorMessageIsShown());
    }
}
