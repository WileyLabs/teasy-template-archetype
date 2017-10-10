#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.project.tests.demo;

import ${package}.wat.base.ProjectBaseTest;
import org.testng.annotations.Test;

/**
 * User: ntyukavkin
 * Date: 20.10.2016
 * Time: 17:28
 */
public class OpenMainPageTest extends ProjectBaseTest {

    @Test
    public void open_main_page_test() {
        openProjectPage()
                .checkMainPageIsOpened()
                .openAboutPage()
                .checkAboutPageIsOpened();
    }
}
