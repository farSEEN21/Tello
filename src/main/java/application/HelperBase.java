package application;

import models.Board;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperBase {
WebDriver wd;

    public HelperBase(WebDriver wd) {
        this.wd = wd;
    }
    public void click(By locator){
        wd.findElement(locator).click();
    }
    public void type(By locator, String Text){
      if (Text!=null) {
          wd.findElement(locator).click();
          wd.findElement(locator).clear();
          wd.findElement(locator).sendKeys(Text);
      }
    }
public void pause(int t){
    try {
        Thread.sleep(t);
    } catch (InterruptedException e) {

    }
}
public boolean isElement(By locator){
        return wd.findElements(locator).size()>0;
}
public boolean isLogin(By locator){
        return isElement(locator);
}

    public void pressCreat() {
        click(By.xpath("//p[@class='X7iA6JJNiXCA2r']"));
    }

    public void chooseboard() {
        click(By.xpath("//span[.='Create board']"));
    }

    public void creatboard(Board board) {
        type(By.xpath("//input[@class='nch-textfield__input lsOhPsHuxEMYEb lsOhPsHuxEMYEb VkPAAkbpkKnPst']"),new Board().getName());
    }public void clicknoard() {
        type(By.xpath("//button[contains(@data-testid,'create-board-submit-button')]"),new Board().getName());
    }

}
