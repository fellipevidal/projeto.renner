package pages;

import elementos.ElementosWeb;
import metodos.MetodosDeTestes;

public class PageCompras {

	ElementosWeb elementosweb = new ElementosWeb();
	MetodosDeTestes metodos = new MetodosDeTestes();

	public void login() {

		metodos.clicar(elementosweb.login);
		metodos.digitar(elementosweb.email, "testeRenner@gmail.com");
		metodos.digitar(elementosweb.senha, "123456789");
		metodos.clicar(elementosweb.submit);

	}

	public void buscarProduto1() throws InterruptedException {
		
		metodos.digitar(elementosweb.buscar, "Printed Chiffon Dress");
		metodos.enter(elementosweb.buscar);
		metodos.clicar(elementosweb.produto1);
		metodos.clicar(elementosweb.tamanhoM);
		metodos.clicar(elementosweb.cor);
		metodos.clicar(elementosweb.addCarrinho);
		metodos.esperar();
		metodos.clicar(elementosweb.continuarCompras);
		
	}
	
	public void buscarProduto2() throws InterruptedException {
		
		metodos.apagarDados(elementosweb.buscar);
		metodos.digitar(elementosweb.buscar, "Faded Short Sleeve T-shirts");
		metodos.enter(elementosweb.buscar);
		metodos.clicar(elementosweb.produto2);
		metodos.clicar(elementosweb.tamanhoL);
		metodos.esperar();
		metodos.clicar(elementosweb.cor2);
		metodos.clicar(elementosweb.addCarrinho);
		metodos.esperar();
		metodos.clicar(elementosweb.continuarCompras);
		
	}
	
	public void buscarProduto3() throws InterruptedException {
		
		metodos.apagarDados(elementosweb.buscar);
		metodos.digitar(elementosweb.buscar, "Blouse");
		metodos.enter(elementosweb.buscar);
		metodos.clicar(elementosweb.produto3);
		metodos.esperar();
		metodos.clicar(elementosweb.tamanhoL);
		metodos.esperar();
		metodos.clicar(elementosweb.quantidade);
		metodos.clicar(elementosweb.addCarrinho);
		metodos.esperar();
		metodos.clicar(elementosweb.continuarCompras);
	}
	
	public void buscarProduto4() throws InterruptedException {
		
		metodos.apagarDados(elementosweb.buscar);
		metodos.digitar(elementosweb.buscar, "Printed Dress");
		metodos.enter(elementosweb.buscar);
		metodos.clicar(elementosweb.produto4);
		metodos.esperar();
		metodos.clicar(elementosweb.tamanhoM);
		metodos.esperar();
		metodos.clicar(elementosweb.addCarrinho);
		metodos.esperar();
		metodos.clicar(elementosweb.prosseguir);
		metodos.esperar();
		
	}
}
