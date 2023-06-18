package application;

import models.user;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.testng.Assert;

public class SessionHelper extends HelperBase {


    public SessionHelper(WebDriver wd) {
        super(wd);
    }


    public void openLoginForm() {
        click(By.xpath("//a[@class='Buttonsstyles__Button-sc-1jwidxo-0 kTwZBr']"));

    }

    public void fillLoginForm(user user) {
        type(By.xpath("//input[@id='user']"), user.getEmail());
        click(By.xpath("//input[@id='login']"));
        pause(3000);
        type(By.xpath("//input[@id='password']"), user.getPassword());

    }

    public void submitLogin() {
        click(By.xpath("//span[text()='Log in']"));
        pause(3000);
    }

    public void logout(By locator, By locator2, By locator3) {

        wd.findElement(locator).click();
        pause(1000);
        wd.findElement(locator2).click();
        pause(1000);
        wd.findElement(locator3).click();
    }

    public void ifloged() {
        if (wd.findElements(By.cssSelector(".DweEFaF5owOe02.V_PnoJ2AynVwLp.G6CmOLx93OUZez")).size() > 0) {

            logout((By.cssSelector(".DweEFaF5owOe02.V_PnoJ2AynVwLp.G6CmOLx93OUZez")),
                    By.xpath("(//span[normalize-space()='Log out'])[1]"),
                    By.xpath("//button[@id='logout-submit']"));
        }

    }

    public void goback() {
        wd.navigate().back();
        wd.navigate().back();
        wd.navigate().back();
    }
}

