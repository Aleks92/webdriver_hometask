import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

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

        mainSteps.onAllCarsPage().priceFrom().sendKeys("500000");

        mainSteps.scrollToElement(mainSteps.onAllCarsPage().oneOwner());

        mainSteps.onAllCarsPage().oneOwner().click();

        mainSteps.onAllCarsPage().checkboxPtsStatus().click();

        mainSteps.onAllCarsPage().showResult().click();

        mainSteps.shouldSeeUrl("cars/audi/all/?sort=fresh_relevance_1-desc&price_from=500000&" +
                "owners_count_group=ONE&pts_status=1");

    }
}