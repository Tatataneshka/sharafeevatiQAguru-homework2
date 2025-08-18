package guru.qa.tests;

import com.codeborne.selenide.Configuration;
//import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Configuration.*;

public class TestBase {
    @BeforeAll
    static void beforeAll() {
        //Configuration.startMaximized = true;
        //WebDriverManager.chromedriver().clearDriverCache();
        baseUrl = "https://demoqa.com";

        // Set settings for selenide browser

        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
        Configuration.screenshots = false;
    }
}