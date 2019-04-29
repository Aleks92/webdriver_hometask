import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class WebDriverTest {

    MainSteps mainSteps;

    @Rule
    public WebDriverRule driverRule = new WebDriverRule();

    @Before
    public void setUp() {
        mainSteps = new MainSteps(driverRule.driver());
    }

    @Test
    public void test() {

        mainSteps.open("https://auto.ru/cars/all/");

        mainSteps.onAllCarsPage().mark().click();

        mainSteps.onAllCarsPage().markAudiInPopap().click();

        mainSteps.onAllCarsPage().allParameters().click();

        mainSteps.scrollToElement("//span[contains(@class, 'Button__text')][.='1 владелец']" +
                "/parent::span/parent::button");

        //mainSteps.scrollToElement();

        mainSteps.onAllCarsPage().owner1().click();

        //mainSteps.shouldSeeUrl("cars/all/");

    }
}