#set($symbol_pound='#')
#set($symbol_dollar='$')
#set($symbol_escape='\' )
package ${package}.wat.pages.demo;

import com.wiley.autotest.selenium.elements.upgrade.TeasyElement;
import ${package}.wat.base.ProjectBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.springframework.stereotype.Component;
import io.qameta.allure.Step;

/**
 * User: ntyukavkin
 * Date: 20.10.2016
 * Time: 17:31
 */
@Component
public class GooglePage extends ProjectBasePage<GooglePage> {

    @Step
    public GooglePage inputText(String query) {
        TeasyElement inputField = element(By.tagName("input"));
        inputField.clear();
        inputField.sendKeys(query);
        inputField.sendKeys(Keys.TAB);
        return this;
    }

    @Step
    public GooglePage clickSearchButton() {
        element(By.cssSelector("input[type='submit']")).click();
        return this;
    }

    @Step
    public GooglePage checkSearchResultForQueryIsPresent(String query) {
        element(By.xpath("//a[contains(text(),'" + query + "')]")).should().beDisplayed();
        return this;
    }
}
