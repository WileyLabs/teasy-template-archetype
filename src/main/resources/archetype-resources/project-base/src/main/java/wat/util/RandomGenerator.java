#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.wat.util;

import org.apache.commons.lang.RandomStringUtils;

import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * User: slesin
 * Date: 7/25/12
 * Time: 3:50 PM
 */
public final class RandomGenerator {
    public static final String RANDOM_NAME_PREFIX = "WAT";

    /**
     * private constructor for utils class
     */
    private RandomGenerator() {
    }

    public static String getString(int count) {
        return RandomStringUtils.randomAlphanumeric(count);
    }

    /**
     * Recommended to use when creation new objects in WP to know in future was this object created by automation framework or wasn't.
     *
     * @return random alphanumeric String with WAT abbreviation that indicates our framework object (user/class/assignment etc...)
     */
    public static String getAlphanumeric() {
        return RANDOM_NAME_PREFIX + getString(7);
    }

    public static String getAlphabetic() {
        return RANDOM_NAME_PREFIX + RandomStringUtils.randomAlphabetic(7);
    }

    public static int getRandomNumberWithinRange(int max, int min) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

    public static String getRandomNumeric(int count) {
        return RandomStringUtils.randomNumeric(count);
    }
}
