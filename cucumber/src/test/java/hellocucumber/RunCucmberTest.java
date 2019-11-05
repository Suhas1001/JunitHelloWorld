package hellocucumber;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin="pretty", features = "src/test/java/hellocucumber/is_it_friday_yet.feature")
class RunCucmberTest{

}
