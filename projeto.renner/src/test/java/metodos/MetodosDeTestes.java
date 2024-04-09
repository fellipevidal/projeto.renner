package metodos;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import drivers.Drivers;

public class MetodosDeTestes extends Drivers{

	public void clicar (By elemento) {
		
		driver.findElement(elemento).click();

	}

	public void digitar (By elemento, String texto) {
		
		driver.findElement(elemento).sendKeys(texto);

	}
	
	public void enter(By elemento) {
		
		driver.findElement(elemento).submit();
	}
	
	public void apagarDados(By elemento) {
		
		driver.findElement(elemento).clear();
	}
	
	public void esperar() throws InterruptedException {
		
		Thread.sleep(3000);
		
	}
	
	public void validarTexto(By elemento, String textoEsperado) {
		
		String textoCapturado = driver.findElement(elemento).getText();
		assertTrue(textoCapturado.contains(textoEsperado));
		
	}

}
