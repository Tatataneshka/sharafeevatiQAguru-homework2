package guru.qa.tests.RegistrForm.Theme4SelenideSearch;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.itemWithText;
import static com.codeborne.selenide.Condition.matchText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideSearch {
    @Test
    void shouldFindSelenideRepositoryPage() {
        //открыть страницу
        open("https://github.com");
        //ввести в поле поиска selenide и нажать Enter

        $(byText("Search or jump to...")).click();
        $("#query-builder-test").setValue("selenide").pressEnter();

        $("h3").$$("div").get(2).$("a")
                .should(text("selenide / selenide"));

    }
}
