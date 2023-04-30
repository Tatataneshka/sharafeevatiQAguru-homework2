package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestBoxTests {
    @BeforeAll
    static void beforeAll(){
        // Configuration.browser = "FIREFOX";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1600x800";
    }


    @Test
    void fillFormTest(){
String permanentAddress = "Alex Address";

        open("/text-box");
        $("#userName").setValue("Alex");
        $("#userEmail").setValue("alex@qaguru.com");
        $("input#currentAddress").setValue("some street 1");
        $("permanentAddress").setValue(permanentAddress);
        $("#submit").click();

        $("#output #name").shouldHave(text("Alex"));
        $("#output #email").shouldHave(text("Alex@alex.com"));
        $("#output p#currentAddress").shouldHave(text("Alex Address"));
        $("#output #permanentAddress").shouldHave(text(permanentAddress));
    }


}
