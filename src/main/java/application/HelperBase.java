package application;

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
        wd.findElement(locator).click();
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(Text);

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

}
