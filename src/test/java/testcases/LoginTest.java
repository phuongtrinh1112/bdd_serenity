package testcases;

import common_keywords.CommonKeywords;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.yecht.Data;

import java.util.HashMap;

@RunWith(SerenityRunner.class)
public class LoginTest {
    @Managed
    WebDriver driver;
    //String baseUrl="http://www.demo.guru99.com/v4/index.php";

    @Test
    public void doLogin(){
        HashMap<String, String> dictionary = CommonKeywords.readPropertiesFile("serenity.properties");
        driver.get(dictionary.get("baseUrl"));
    }
}
