import io.qameta.htmlelements.WebPage;
import io.qameta.htmlelements.annotation.FindBy;
import io.qameta.htmlelements.element.HtmlElement;

public interface AllCarsPage extends WebPage {

    @FindBy("//div[contains(@class, 'MMMFilter-module__MMMFilter')]" +
            "/child::div[contains(@class, 'MMMFilter-module__MMMFilter__item')][1]")
    HtmlElement mark();

    @FindBy("//div[contains(@class,'ListingPopularMMM-module__container PageListing-module__popularMMM')]" +
            "//a[contains(., 'Audi')]")
    HtmlElement markAudiInPopap();

    @FindBy("//span[contains(@class, 'Link ListingCarsFilters-module__actionCollapse')]")
    HtmlElement allParameters();

    @FindBy("//span[contains(@class, 'Button__text')][.='1 владелец']/parent::span/parent::button")
    HtmlElement owner1();

    @FindBy("//input[contains(@name, 'price_from')]")
    HtmlElement priceFrom();

    @FindBy("//input[contains(@name, 'pts_status')]")
    HtmlElement checkboxPtsStatus();

    @FindBy("//div[contains(@class, 'ListingCarsFilters-module__column')]//span[contains(., 'Показать')]")
    HtmlElement showResult();

}

