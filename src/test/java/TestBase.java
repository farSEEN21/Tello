import application.ApplicationManager;
import org.testng.annotations.BeforeClass;

public class TestBase {



    public static ApplicationManager app =new ApplicationManager();
@BeforeClass

    public void setUp(){app.init();}
public void tears(){app.tears();};



}



