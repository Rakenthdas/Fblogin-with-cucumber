package Runner_file;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features="/Cucumber_project/src/test/java/Feature_file/Fblogin.feature",
glue="Step_definition",tags="@RegressionTest")


public class Fblogin {
	
	

}
