import com.codeborne.selenide.Configuration;

public abstract class InitTests {

    public InitTests() {
        Configuration.baseUrl = "https://www.google.com";
        Configuration.browser = "Chrome";
    }
}
