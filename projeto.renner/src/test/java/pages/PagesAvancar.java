package pages;

import elementos.ElementosWeb;
import metodos.MetodosDeTestes;

public class PagesAvancar {
	
	ElementosWeb elementosweb = new ElementosWeb();
	MetodosDeTestes metodos = new MetodosDeTestes();

	
	public void summary() throws InterruptedException {
		
		metodos.clicar(elementosweb.confirmar);
		metodos.esperar();
	}
	
	
	public void address() throws InterruptedException {
		
		metodos.clicar(elementosweb.confirmarEnd);
		metodos.esperar();
	}
	
	public void shipping() throws InterruptedException {
		
		metodos.clicar(elementosweb.checkbox);
		metodos.clicar(elementosweb.confirmarEnvio);
		metodos.esperar();
	}
	
	public void payment() throws InterruptedException {
		
		metodos.clicar(elementosweb.pagamentoBanco);
		metodos.clicar(elementosweb.confirmarPedido);
		metodos.esperar();
	}
	
	public void compraEfetuada() {
		
		metodos.validarTexto(elementosweb.mensagem, "Your order on My Shop is complete.");
	}
}
