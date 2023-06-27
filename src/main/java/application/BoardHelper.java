package application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BoardHelper extends HelperBase{


    public BoardHelper(WebDriver wd) {
        super(wd);
    }


//public void boardCounter(){
//       List<WebElement> boardsList=wd.findElements(By.cssSelector(boards-page-board-section-list);
//       return boardsList.size();
//}

    public void backToWorkSpase() {
        click(By.xpath("//a[@class='Ra1oz0qwdTKqEZ']"));
    }


    public void selectFirstboard() {
        click(By.xpath("//ul[@class='boards-page-board-selection-list']//li[1]"));
    }

    public void openMenu() {
        click(By.xpath("//button[@aria-lable='Show menu']"));
    }

    public void openMenuMore() {

        click(By.cssSelector(".icon-sm.icon-overflow-menu-horizontal.board-menu-navigation-item-link-icon"));
    }

    public void Closeboard() {
        click(By.xpath("//a[.='NBSPClose board...']"));
        click(By.cssSelector(".js-confirm.full.nch-button.nch-button--danger"));
        click(By.cssSelector(".Bp80TGmc9hQIdE.bxgKMAm3lq5BpA.V_9lMAQ0dk_AYt.SEj5vUdI3VvxDc"));




    }
}
