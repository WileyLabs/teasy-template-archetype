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
 * Time: 17:10
 */
@Component
public class ProjectMainPage<P extends ProjectBasePage> extends ProjectBasePage<P> {

    @Step
    public AboutPage openAboutPage() {
        link(By.cssSelector("${symbol_pound}about-btn a")).click();
        return redirectTo(AboutPage.class);
    }

    @Step
    public ProjectMainPage checkMainPageIsOpened() {
        postponedAssertNotNull(findElementByNoThrow(By.cssSelector("${symbol_pound}homepage")), "Main page is not opened");
        return this;
    }
}
