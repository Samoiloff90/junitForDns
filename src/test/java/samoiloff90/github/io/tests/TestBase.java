package samoiloff90.github.io.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.*;

public class TestBase {
    @BeforeEach
    void precondition() {
        open("https://www.dns-shop.ru/");
        browserSize = "1920x1080";
    }

    @AfterEach
    void closeBrowser() {
        closeWebDriver();
    }
}
