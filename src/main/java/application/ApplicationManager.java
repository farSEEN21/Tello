package application;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver wd;
    SessionHelper sh;
    public  void init(){
        wd=new ChromeDriver();
        sh=new SessionHelper(wd);
        wd.manage().window().maximize();
        wd.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        wd.get("http://trello.com/home");
    }

    public void tears(){wd.quit();

    }

    public SessionHelper getSh() {
        return sh;
    }

}
