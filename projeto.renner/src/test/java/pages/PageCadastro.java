package pages;

import elementos.ElementosWeb;
import metodos.MetodosDeTestes;

public class PageCadastro {
	
	MetodosDeTestes metodos = new MetodosDeTestes();
	ElementosWeb elementos = new ElementosWeb();
	
	
	public void loginCadastro() {
		
		metodos.clicar(elementos.login);
	}
	
	public void preencherDadosIniciais(String email) {
		
		metodos.digitar(elementos.emailCadastro,email);
		metodos.clicar(elementos.criarConta);
	}
	
	public void preencherDadosCadastro(String nome, String sobrenome, String senhaCadastro, String dataAniversario, String mesAniversario,String anoAniversario) throws InterruptedException {
		
		metodos.esperar();
		metodos.clicar(elementos.genero);
		metodos.digitar(elementos.nome, nome);
		metodos.digitar(elementos.sobrenome, sobrenome);
		metodos.digitar(elementos.senhaCadastro, senhaCadastro);
		metodos.digitar(elementos.dataAniversario, dataAniversario);
		metodos.digitar(elementos.mesAniversario, mesAniversario);
		metodos.digitar(elementos.anoAniversario, anoAniversario);
	
	}
	
	public void finalizarCadastro() {
		
		metodos.clicar(elementos.finalizarCadastro);
		metodos.validarTexto(elementos.mensagem, "Your account has been created.");
	}

}
