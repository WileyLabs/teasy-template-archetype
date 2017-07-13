#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.wat.base;

import ${package}.wat.pages.ProjectMainPage;

/**
 * User: dfedorov
 * Date: 7/20/12
 * Time: 3:16 PM
 */
public class AbstractBaseTest<P extends ProjectBaseTest> extends ProjectBaseTest<P> {

    public ProjectMainPage openProjectPageByUrl(String url) {
        return getPage(ProjectMainPage.class, url);
    }

    public ProjectMainPage openProjectPage() {
        return getPage(ProjectMainPage.class, getSettings().getFullHost());
    }
}
