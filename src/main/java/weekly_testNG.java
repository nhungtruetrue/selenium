import org.openqa.selenium.WebElement;
import  org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class weekly_testNG {
WebElement ;
@Test(dataProvider = "loginData")
public void testLogin(String username, String password, boolean expectedResult){
}

