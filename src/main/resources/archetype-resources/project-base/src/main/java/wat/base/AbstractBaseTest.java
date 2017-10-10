#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.wat.base;

import ${package}.wat.pages.ProjectHomePage;

/**
 * User: dfedorov
 * Date: 7/20/12
 * Time: 3:16 PM
 */
public class AbstractBaseTest<P extends ProjectBaseTest> extends ProjectBaseTest<P> {

    public ProjectHomePage openProjectPageByUrl(String url) {
        return getPage(ProjectHomePage.class, url);
    }

    public ProjectHomePage openProjectPage() {
        return getPage(ProjectHomePage.class, getSettings().getFullHost());
    }
}
