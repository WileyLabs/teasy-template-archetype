#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.project.tests.functional;

import ${package}.wat.base.AbstractBaseTest;
import org.testng.annotations.Test;

/**
 * User: ntyukavkin
 * Date: 20.10.2016
 * Time: 17:28
 */
public class OpenMainPageByUrlTest extends AbstractBaseTest {

    private static final String URL = "http://www.wiley.ru";

    @Test
    public void open_main_page_by_url_test() {
        openProjectPageByUrl(URL)
                .checkMainPageIsOpened()
                .openAboutPage()
                .checkAboutPageIsOpened();
    }
}
