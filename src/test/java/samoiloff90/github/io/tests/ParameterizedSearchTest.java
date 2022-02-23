package samoiloff90.github.io.tests;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class ParameterizedSearchTest extends TestBase{
    @ValueSource(strings = {"Ноутбуки", "Смартфоны", "Персональные компьютеры"})
    @ParameterizedTest(name = "Проверка отображения поисковых результатов в dns-shop для запроса '{0}'")
    void commonSearchTest(String testData) {
        $(".btn-additional").click();
        $x("(//*[@name='q'])[2]").setValue(testData).pressEnter();
        $$x("//h1[@class='title']").find(text(testData)).shouldBe(visible);
    }
}