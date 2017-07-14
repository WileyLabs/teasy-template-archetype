#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.wat.selenium;

import com.wiley.autotest.spring.Settings;

/**
 * Created by IntelliJ IDEA.
 * User: maxim
 * Date: 27.01.12
 * Time: 10:13
 */
public class Login {

    private String user = null;
    private String password = null;
    private String customUser = "";
    private String customPassword = "";

    private String url = "";
    private Role role = Role.UNKNOWN;
    private String baseUrl = "";

    public String getCustomUser() {
        return customUser;
    }

    public Login setCustomUser(String customUserString) {
        this.customUser = customUserString;
        return this;
    }

    public String getCustomPassword() {
        return customPassword;
    }

    public Login setCustomPassword(String customPasswordString) {
        this.customPassword = customPasswordString;
        return this;
    }

    public Login(Settings settings) {
        baseUrl = settings.createUrl();
    }

    public Login() {
        baseUrl = "";
    }

    public Login setLogin(final String login) {
        if (login != null) {
            final String[] s = login.split("${symbol_escape}${symbol_escape}|");
            if (s.length == 2) {
                user = s[0];
                password = s[1];
            }
        }
        return this;
    }

    public Login setLogin(final String login, final String password) {
        this.user = login;
        this.password = password;
        return this;
    }

    public String getUrl() {
        return baseUrl + url;
    }

    public Login setUrl(final String urlString) {
        this.url = urlString;
        return this;
    }

    public Login setEmptyBaseUrl() {
        this.baseUrl = "";
        return this;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public Login setRole(final Role roleString) {
        this.role = roleString;
        return this;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public Login setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
        return this;
    }

    public Role getRole() {
        return role;
    }

    public Login setUser(String user) {
        this.user = user;
        return this;
    }

    public Login setPassword(String password) {
        this.password = password;
        return this;
    }
}
