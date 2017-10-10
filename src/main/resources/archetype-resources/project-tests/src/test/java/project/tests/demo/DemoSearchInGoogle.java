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
public class DemoSearchInGoogle extends ProjectBaseTest {

    private static final String URL = "http://google.com";
    private static final String QUERY = "selenium";

    @Test
    public void demo_test() {
        openGooglePage(URL)
                .inputText(QUERY)
                .clickSearchButton()
                .checkSearchResultForQueryIsPresent(QUERY);
    }
}
