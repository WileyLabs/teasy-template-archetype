#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.wat.selenium;

/**
 * Created by IntelliJ IDEA.
 * User: maxim
 * Date: 08.02.12
 * Time: 16:37
 */
public enum Role {
    ADMIN {
        @Override
        public String getName() {
            return "admin";
        }
    },
    DOMAIN_OWNER {
        @Override
        public String getName() {
            return "instructor";
        }
    },
    INSTRUCTOR {
        @Override
        public String getName() {
            return "assistant";
        }
    },
    STUDENT {
        @Override
        public String getName() {
            return "student";
        }
    },
    PRODUCER {
        @Override
        public String getName() {
            return "producer";
        }
    },
    UNKNOWN {
        @Override
        public String getName() {
            return "unknown";
        }
    };

    public abstract String getName();
}
