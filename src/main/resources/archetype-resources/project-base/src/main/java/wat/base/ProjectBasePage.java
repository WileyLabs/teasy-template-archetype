#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.wat.base;

import com.wiley.autotest.selenium.SeleniumHolder;
import com.wiley.autotest.selenium.context.AbstractPage;
import com.wiley.autotest.services.CookiesService;
import ${package}.wat.selenium.SeleniumSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import io.qameta.allure.Step;

/**
 * User: dfedorov
 * Date: 7/20/12
 * Time: 2:27 PM
 */

@Component
public class ProjectBasePage extends AbstractPage {

    @Autowired
    private CookiesService cookiesService;

    @Autowired
    private SeleniumSettings seleniumSettings;

    public CookiesService getCookiesService() {
        return cookiesService;
    }

    protected SeleniumSettings getSettings() {
        return seleniumSettings;
    }

    @Step
    protected void switchToMainWindow() {
        SeleniumHolder.getWebDriver().switchTo().window(SeleniumHolder.getWebDriver().getWindowHandles().iterator().next());
    }
}
