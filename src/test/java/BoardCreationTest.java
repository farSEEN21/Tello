import models.Board;
import models.user;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BoardCreationTest extends TestBase{

@BeforeMethod
public void Precond(){
   if(!app.getBoardHelper().isElement(By.cssSelector(".DweEFaF5owOe02.V_PnoJ2AynVwLp.G6CmOLx93OUZez"))){
        app.getSh().openLoginForm();
        app.getSh().fillLoginForm(new user().withEmail("maxmayzel@gmail.com").withPassword("Rfrnec7_*"));
        app.getSh().submitLogin();
        app.getSh().pause(2000);
    }
}

@Test
    public void BoardcreateTest(){
String Boardname="QA_38"+(System.currentTimeMillis()/1500)/3600;
    app.getBoardHelper().pressCreat();
    app.getSh().pause(2000);
    app.getBoardHelper().chooseboard();
    app.getSh().pause(2000);
    app.getBoardHelper().creatboard(new Board().withName(Boardname));
    app.getSh().pause(2000);
  //  Assert.assertTrue(app.getSh().isElement(By.xpath("//div[@class='list-add-controla u-clearfix']")));

    app.getSh().pause(2000);
    app.getBoardHelper().clicknoard();
    app.getBoardHelper().backToWorkSpase();
//    app.getSh().click(;

    }


}
