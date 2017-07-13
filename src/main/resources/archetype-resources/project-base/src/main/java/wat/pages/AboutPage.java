#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.wat.pages;

import ${package}.wat.base.ProjectBasePage;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * User: ntyukavkin
 * Date: 20.10.2016
 * Time: 17:31
 * Test Case modified date:
 * Preconditions:
 * Description:
 */
@Component
public class AboutPage<P extends ProjectMainPage> extends ProjectBasePage<P> {

    @Step
    public AboutPage checkAboutPageIsOpened() {
        postponedAssertEquals(element(By.cssSelector("${symbol_pound}breadcrumb h1")).getText(), "О Компании", "About company page is not opened");
        return this;
    }
}
