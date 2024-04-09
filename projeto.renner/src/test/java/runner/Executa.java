package runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

import drivers.Drivers;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "src/test/resources/features", 
		glue = "steps", 
		tags = "@Cadastro",
		monochrome = true, 
		dryRun = false, 
		plugin = {
				"pretty", "html:target/cucumber-report.html" }

)

public class Executa extends Drivers {

	@BeforeClass
	public static void IniciarTeste() {

		String urlTest = "http://www.automationpractice.pl/index.php";
		String navegador = "Chrome";

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(urlTest);
		System.out.println("*************** TESTE INICIADO COM SUCESSO ***************");
		
	}
	
	@AfterClass
	public static void finalizarTeste() {
		
		driver.quit();
		System.out.println("*************** TESTE FINALIZADO COM SUCESSO *************");
	}

}
