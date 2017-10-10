#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.wat.pages.demo;

import ${package}.wat.base.ProjectBasePage;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * User: ntyukavkin
 * Date: 20.10.2016
 * Time: 17:10
 */
@Component
public class ProjectHomePage<P extends ProjectBasePage> extends ProjectBasePage<P> {

    @Step
    public AboutPage openAboutPage() {
        element(By.cssSelector("${symbol_pound}about-btn a")).click();
        return redirectTo(AboutPage.class);
    }

    @Step
    public ProjectHomePage checkMainPageIsOpened() {
        element(By.cssSelector("${symbol_pound}homepage")).should().beDisplayed();
        return this;
    }
}
