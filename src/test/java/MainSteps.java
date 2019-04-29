import io.qameta.htmlelements.WebPage;
import io.qameta.htmlelements.WebPageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class MainSteps {

    private WebDriver webDriver;

    MainSteps(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void  open(String url){
        webDriver.get(url);
    }

    public void  shouldSeeUrl(String url){
        assertThat("Перешли на другую страницу",
                webDriver.getCurrentUrl(),
                containsString(url));
    }

    public AllCarsPage onAllCarsPage() {
        return on(AllCarsPage.class);
    }

    public void scrollToElement(String xpath){
        WebElement element = webDriver.findElement(By.xpath(xpath));
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true);", element);
    }


    protected <T extends WebPage> T on(Class<T> pageClass) {
        WebPageFactory factory = new WebPageFactory();
        return factory.get(webDriver, pageClass);
    }

}