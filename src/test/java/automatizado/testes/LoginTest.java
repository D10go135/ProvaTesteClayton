package automatizado.testes;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import automatizado.pageObject.LoginPO;

public class LoginTest extends BaseTest{
	
	private static LoginPO LoginPage;
	
	@BeforeClass
	public static void prepararTestes() {
		LoginPage = new LoginPO(driver);
	}
	
	@Test
	public void TC001_naoDeveLogarNoSistemaComEmailESenhaVazio() {
		LoginPage.inputEmail.sendKeys("");
		LoginPage.inputSenha.sendKeys("");
		
		LoginPage.buttonEntrar.click();
		
		String mensagem = LoginPage.obterMensagem();
		
		assertEquals(mensagem, "Informe usuário e senha, os campos não podem ser brancos.");
		
	}
	
	@Test
	public void TC002_naoDeveLogarNoSistemaComEmailIncorretoESenhaVazio() {
		LoginPage.inputEmail.sendKeys("");
		LoginPage.inputSenha.sendKeys("teste123");
		
		LoginPage.buttonEntrar.click();
		
		String mensagem = LoginPage.obterMensagem();
		
		assertEquals(mensagem, "Informe usuário e senha, os campos não podem ser brancos.");
		
	}

}
