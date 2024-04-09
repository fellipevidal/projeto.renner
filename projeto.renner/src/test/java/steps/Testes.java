package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.PageCadastro;
import pages.PageCompras;
import pages.PagesAvancar;

public class Testes {
	
	PageCompras pagecompras = new PageCompras();
	PagesAvancar pagesavancar = new PagesAvancar();
	PageCadastro pgcadastro = new PageCadastro();
	
	@Dado("que eu faça login no site")
	public void que_eu_faça_login_no_site() throws InterruptedException {
	  
		pagecompras.login();
		
	}

	@Dado("selecione os produtos desejados no carrinho")
	public void selecione_os_produtos_desejados_no_carrinho() throws InterruptedException {
	    
		pagecompras.buscarProduto1();
		pagecompras.buscarProduto2();
		pagecompras.buscarProduto3();
		pagecompras.buscarProduto4();
	}

	@Quando("avançar as etapas de compras")
	public void avançar_as_etapas_de_compras() throws InterruptedException {
	  
		pagesavancar.summary();
		pagesavancar.address();
		pagesavancar.shipping();
		pagesavancar.payment();
	}

	
	
	@Então("produtos comprado com sucesso")
	public void produtos_comprado_com_sucesso() {
		
		pagesavancar.compraEfetuada();
	 
	}
	
	
	//=================================================TESTE CADASTRO ===========================================================//
	
	@Dado("que entre no site para fazer login")
	public void que_entre_no_site_para_fazer_login() {
		
		pgcadastro.loginCadastro();
	}
	
	@Dado("não tenho cadastro, preencho o email para criar conta")
	public void não_tenho_cadastro_preencho_o_email_para_criar_conta() {
	   
		pgcadastro.preencherDadosIniciais("testeRenner11@gmail.com");
		
	}

	@Quando("preencher as informações necessárias")
	public void preencher_as_informações_necessárias() throws InterruptedException {
	
		pgcadastro.preencherDadosCadastro("Fellipe", "Vidal", "123456789", "10", "March", "1995");
	}

	@Então("cadastro criado com sucesso")
	public void cadastro_criado_com_sucesso() {
	  
		pgcadastro.finalizarCadastro();
		
	}


}
