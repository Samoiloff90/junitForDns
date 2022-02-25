package samoiloff90.github.io.tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;



public class ParameterizedRegistrationTest extends TestBase{
    @CsvSource(value = {
        "123456789 , E-mail/телефон указан неверно",
        ", Заполните поле",
        "qwerty!qwe.ru, E-mail/телефон указан неверно"
    })
    @ParameterizedTest(name = "Проверка формы регистрации в dns-shop для запроса '{0}'")
    void commonSearchTest(String testData, String expectedText) {
        $(".btn-additional").click();
        $x("//*[text()='Войти']").click();
        $x("//input[@class='base-ui-input-row__input base-ui-input-row__input_with-icon']").setValue(testData);
        $x("//*[text()='Получить код']").click();
        $$x("//*[@class='error-message-block form-entry-or-registry__error']").find(text(expectedText)).shouldBe(visible);
    }
}
