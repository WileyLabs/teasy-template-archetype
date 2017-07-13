#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.wat.selenium;

/**
 * User: ntyukavkin
 * Date: 06.10.2015
 * Time: 15:30
 */
public enum Environment {

    DEFAULT;

    private String runOn;

    public String getRunOn() {
        return runOn == null ? name() : runOn;
    }

    public Environment setRunOn(String runOn) {
        this.runOn = runOn;
        return this;
    }
}
