package stepDefintions.testRunner;


import com.codeborne.selenide.Configuration;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasspathResource("features")
public class RunCucumberTest {

}