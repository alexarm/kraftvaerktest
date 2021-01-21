package pages;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class GoogleMainPage {

    private final By SEARCH = By.name("q");

    public void open() {
        Selenide.open("/");
    }

    public void search(String searchQuery) {
        $(SEARCH).setValue(searchQuery);
        $(SEARCH).pressEnter();
    }

}
