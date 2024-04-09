package elementos;

import org.openqa.selenium.By;

public class ElementosWeb {

	
	//Login
	public static By login = By.xpath("//a[@class='login']");
	public static By email = By.xpath("//input[@id='email']");
	public static By senha = By.xpath("//input[@id='passwd']");
	public static By submit = By.xpath("//button[@id='SubmitLogin']");
	
	//Tamanhos roupas
	
	public static By tamanhoM = By.xpath("//select[@id='group_1']/option[@value='2']");
	public static By tamanhoL = By.xpath("//select[@id='group_1']/option[@value='3']");
	
	//Buscar produtos 1
	public static By buscar = By.xpath("//input[@id='search_query_top']");
	public static By produto1 = By.xpath("//a[@title='Printed Chiffon Dress']");
	
	public static By cor = By.xpath("//a[@name='Green']");
	public static By addCarrinho = By.xpath("//p[@id='add_to_cart']");
	public static By continuarCompras = By.xpath("//span[@class='continue btn btn-default button exclusive-medium']");
	
	//Buscar produtos 2
	
	public static By produto2 = By.xpath("//a[@title='Faded Short Sleeve T-shirts']");
	public static By cor2 = By.xpath("//a[@name='Orange']");
	
	
	//Buscar produto 3
	
	public static By produto3 = By.xpath("//a[@title='Blouse']");
	public static By quantidade = By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']");
	public static By prosseguir = By.xpath("//a[@class='btn btn-default button button-medium']");
	
	
	// Buscar produto 4 
	
	public static By produto4 = By.xpath("//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line first-item-of-tablet-line first-item-of-mobile-line']");
	
	// Checkbox termos
	
	public static By checkbox = By.xpath("//input[@id='cgv']");
	
	
	// Pagamento
	
	public static By pagamentoBanco = By.xpath("//a[@title='Pay by bank wire']");
	
	// Summary // Signin
	
	public static By confirmar = By.xpath("//p[@class='cart_navigation clearfix']//a[@title='Proceed to checkout']");
	
	// Address
	
	public static By confirmarEnd = By.xpath("//button[@name='processAddress']");
	
	// Shipping
	
	public static By confirmarEnvio = By.xpath("//button[@name='processCarrier']");
	
	// Confirmar ordem
	
	public static By confirmarPedido = By.xpath("//button[@class='button btn btn-default button-medium']");
	
	
	// Mensagem de sucesso
	
	public static By mensagem = By.xpath("//p[@class='alert alert-success']");
	
	
	//--------------------------------------------//
	
	// Elementos da página cadastro
	
	
	public static By emailCadastro = By.xpath("//input[@id='email_create']");
	public static By criarConta = By.xpath("//button[@id='SubmitCreate']");
	public static By genero = By.xpath("//div[@id='uniform-id_gender1']");
	public static By nome = By.xpath("//input[@id='customer_firstname']");
	public static By sobrenome = By.xpath("//input[@id='customer_lastname']");
	public static By senhaCadastro = By.xpath("//input[@id='passwd']");
	public static By dataAniversario = By.xpath("//select[@id='days']");
	public static By mesAniversario = By.xpath("//select[@id='months']");
	public static By anoAniversario = By.xpath("//select[@id='years']");
	public static By finalizarCadastro = By.xpath("//button[@id='submitAccount']");
	
}
