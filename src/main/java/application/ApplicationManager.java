package application;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    WebDriver wd;
    SessionHelper sh;
    BoardHelper boardHelper;
    public  void init(){
        wd=new ChromeDriver();
        sh=new SessionHelper(wd);
        wd.manage().window().maximize();
        wd.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        wd.get("http://trello.com/home");
        boardHelper =new BoardHelper(wd);
    }

    public BoardHelper getBoardHelper() {
        return boardHelper;
    }

    public void tears(){wd.quit();

    }

    public SessionHelper getSh() {
        return sh;
    }

}
