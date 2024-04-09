#Autor: fellipe.vidal@outlook.com
#language:pt
#UTF:8


	Funcionalidade: Comprar produtos no site / Cadastrar um novo cliente
  Eu como um cliente cadastrado no automationpractice.com,
	Eu quero fazer a compra de ao menos três produtos,
	Para que eu possa estar bem vestida
	
	Eu como novo usuario gostaria de realizar um novo cadastro no site
  
@Compras
  Cenario: Comprar produtos
   Dado que eu faça login no site 
   E selecione os produtos desejados no carrinho
   Quando avançar as etapas de compras
   Então produtos comprado com sucesso
   

@Cadastro
   Cenario: Realizar um novo cadastro
   Dado que entre no site para fazer login
   E não tenho cadastro, preencho o email para criar conta
   Quando preencher as informações necessárias
   Então cadastro criado com sucesso
   
    


