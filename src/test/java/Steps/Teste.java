package Steps;

import Elementos.elementosDeTela;
import Metodos.MetodosPage;
import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;

public class Teste {
	 
	elementosDeTela e = new elementosDeTela();
	MetodosPage m = new MetodosPage();
	
	@Dado("^que eu esteje no site \"([^\"]*)\"$")
	public void que_eu_esteje_no_site(String url) throws Throwable {   
	m.abrirNavegador(url);
	}

	@Quando("^eu clicar para alterar a versao$")
	public void eu_clicar_para_alterar_a_versao() throws Throwable {
	  m.clicar(e.getBtnMudarVersao());
	  
	  
	}

	@Quando("^clicar no botao add record$")
	public void clicar_no_botao_add_record() throws Throwable {
		m.clicar(e.getBtnAddRecord());
	    
	}
	@Quando("^preencher os campos do cadastro$")
	public void preencher_os_campos_do_cadastro() throws Throwable {
		m.preencherTexto(e.getBtncustomeName(), "marta");
		m.preencherTexto(e.getBtnContactLastName(), "marinho");
		m.preencherTexto(e.getContactFirstName(), "marta");
		m.preencherTexto(e.getPhone(), "991919191");
		m.preencherTexto(e.getAddressLine1(), "teste");
		m.preencherTexto(e.getAddressLine2(), "teste2");
		m.preencherTexto(e.getCity(),"Serra Dourada");
		m.preencherTexto(e.getState(), "Bahia" );
		m.preencherTexto(e.getCountry(), "Brasil");
		m.preencherTexto(e.getPostalCode(), "47740000");
		m.preencherTexto(e.getSalesRepEmployeeNumber(), "999999999");
		m.preencherTexto(e.getCreditLimit(), "1000");
		
	}
	
	   
	@Entao("^o cadastro e efetuado com sucesso$")
	public void o_cadastro_e_efetuado_com_sucesso() throws Throwable {
	    m.clicar(e.getSaveAndGoBackButton());
	}



}
