package samoiloff90.github.io.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import static com.codeborne.selenide.Selenide.*;

public class TestBase {
    @BeforeEach
    void precondition() {
        open("https://www.dns-shop.ru/");
    }

    @AfterEach
    void closeBrowser() {
        closeWebDriver();
    }
}
