package co.com.pruebachoucair.runners;

import cucumber.api.CucumberOptions;
        import cucumber.api.SnippetType;
        import net.serenitybdd.cucumber.CucumberWithSerenity;
        import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features ="src/test/resources/feature/correcto_redireccionamiento.feature",
        tags ={ "@tag1",},
        glue = {"co.com.pruebachoucair.stepdefinitions","co.com.pruebachoucair.util"},
        snippets = SnippetType.CAMELCASE )

public class RunnerTag {

}
