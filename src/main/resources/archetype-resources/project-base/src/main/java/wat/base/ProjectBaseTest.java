#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.wat.base;

import com.wiley.autotest.selenium.AbstractSeleniumTest;
import ${package}.wat.selenium.Login;
import ${package}.wat.selenium.SeleniumSettings;
import ${package}.wat.util.RandomGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.testng.Reporter;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Step;

import ${package}.wat.pages.demo.GooglePage;

import java.lang.reflect.Method;

import static org.testng.Reporter.log;

/**
 * User: dfedorov
 * Date: 7/20/12
 * Time: 1:04 PM
 */
@ContextConfiguration(locations = {
        "classpath*:/spring/component-scan.xml",
        "classpath:/spring/settings.xml"
})
public abstract class ProjectBaseTest<P extends ProjectBaseTest> extends AbstractSeleniumTest {

    @Autowired
    private SeleniumSettings seleniumSettings;

    private ThreadLocal<Login> login = new ThreadLocal<>();

    public SeleniumSettings getSettings() {
        return seleniumSettings;
    }

    @Step("{0}")
    protected P reportWithStep(final String message) {
        log(message);
        LOGGER.info(message);
        return (P) this;
    }

    protected P report(final String message) {
        log(message);
        LOGGER.info(message);
        return (P) this;
    }

    public GooglePage openGooglePage(String url) {
        return getPage(GooglePage.class, url);
    }

    protected String getEmailByKey(String key) {
        return getSettings().getProperty(key).split("${symbol_escape}${symbol_escape}|")[0];
    }

    protected String getPasswordByKey(String key) {
        return getSettings().getProperty(key).split("${symbol_escape}${symbol_escape}|")[1];
    }

    public static String getRandomName(String name) {
        return name.trim() + " " + RandomGenerator.getAlphanumeric();
    }

    public static String getRandomString() {
        return RandomGenerator.getAlphanumeric();
    }

    public static void fail(final String errorMessage) {
        Reporter.log("ERROR: " + errorMessage);
        throw new AssertionError(errorMessage);
    }

    public Method getTestMethod() {
        Method[] methods = this.getClass().getDeclaredMethods();
        for (Method method : methods) {
            if (method.getAnnotation(Test.class) != null) {
                return method;
            }
        }
        return null;
    }
}
