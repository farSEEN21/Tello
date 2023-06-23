import models.user;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BoardDelet extends TestBase{
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
    public void
}
