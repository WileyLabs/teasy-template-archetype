#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.wat.selenium;

import com.wiley.autotest.spring.CustomPropertyPlaceholderConfigurer;
import com.wiley.autotest.spring.Settings;

/**
 * @author alexey.a.semenov@gmail.com
 */
public class SeleniumSettings extends Settings {

    private Environment environment;

    private CustomPropertyPlaceholderConfigurer propertyConfigurer;

    public void init() {
        propertyConfigurer.copyTo(environment.getRunOn(), this);
    }

    public void setPropertyConfigurer(final CustomPropertyPlaceholderConfigurer propertyConfigurer) {
        this.propertyConfigurer = propertyConfigurer;
    }

    public Boolean isRunOnDefaultEnvironment() {
        return environment == Environment.DEFAULT;
    }

    public Environment getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        try {
            this.environment = Environment.valueOf(environment);
        } catch (IllegalArgumentException e) {
            this.environment = Environment.DEFAULT.setRunOn(environment);
        }
    }
}
