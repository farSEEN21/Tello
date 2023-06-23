import models.user;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends TestBase {


    @Test
    public void positLogin() {

        app.getSh().ifloged();
        app.getSh().openLoginForm();
        app.getSh().fillLoginForm(new user().withEmail("maxmayzel@gmail.com").withPassword("Rfrnec7_*"));
        app.getSh().submitLogin();
        app.getSh().pause(2000);
        Assert.assertTrue(app.getSh().isElement(By.cssSelector(".DweEFaF5owOe02.V_PnoJ2AynVwLp.G6CmOLx93OUZez")));
        app.getSh().logout(By.cssSelector(".DweEFaF5owOe02.V_PnoJ2AynVwLp.G6CmOLx93OUZez"),
                By.xpath("(//span[normalize-space()='Log out'])[1]"),
                By.xpath("//button[@id='logout-submit']"));
        app.getSh().pause(2000);

    }

    @Test
    public void NegLoginpassword() {

        app.getSh().ifloged();
        app.getSh().pause(4000);
        app.getSh().openLoginForm();
        app.getSh().fillLoginForm(new user().withEmail("maxmayzel@gmail.com").withPassword("Rfrnec7_"));
        app.getSh().submitLogin();
        app.getSh().pause(2000);
        Assert.assertTrue(app.getSh().isElement(By.xpath("//div[@class='css-haw22i']")));
        app.getSh().goback();
//        if (!(wd.findElements(By.xpath("//a[@class='Buttonsstyles__Button-sc-1jwidxo-0 kTwZBr']")).size() > 0))
//        {            app.init();
//    }
    }
@Test
    public void negatineLoginwithoitpasswTest(){
        app.getSh().ifloged();
        app.getSh().pause(4000);
        app.getSh().openLoginForm();
        app.getSh().fillLoginForm(new user().withEmail("maxmayzel@gmail.com") );
        app.getSh().submitLogin();
        Assert.assertTrue(app.getSh().isElement(By.id("password-error")));
    }
@Test
    public void logOutTest(){}
}
