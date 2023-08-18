import org.junit.jupiter.api.Test;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

class OrderTest {

    @Test
    void shouldTest(){
        open("http://localhost:9999");
        $("[data-test-id=name] input").setValue("Петров Петр");
        $("[data-test-id=phone] input").setValue("+79010000000");
        $("[data-test-id=agreement]").click();
        $(".button").click();
        $("[data-test-id=order-success]").shouldHave(exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));

    }
}