package application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BoardHelper extends HelperBase{


    public BoardHelper(WebDriver wd) {
        super(wd);
    }


public void boardCounter(){
       List<WebElement> boardsList=wd.findElements(By.cssSelector(boards-page-board-section-list);
       return boardsList.size();
}
}
