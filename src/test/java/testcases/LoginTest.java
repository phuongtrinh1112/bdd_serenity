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

    @Test
    public void doLogin(){
        HashMap<String, String> dictionary = CommonKeywords.readPropertiesFile("src/test/resources/serenity.properties");
        driver.get(dictionary.get("baseUrl"));
    }
}
