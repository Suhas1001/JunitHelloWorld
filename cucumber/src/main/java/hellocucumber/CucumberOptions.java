package hellocucumber;

import java.lang.String;

public @interface CucumberOptions {
    String plugin();
    String features();
}
