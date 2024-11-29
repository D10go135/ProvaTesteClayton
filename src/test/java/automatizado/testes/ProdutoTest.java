package automatizado.testes;

import static org.junit.Assert.assertEquals;


import org.junit.BeforeClass;
import org.junit.Test;

import automatizado.pageObject.ProdutoPO;

public class ProdutoTest extends BaseTest {

    private static ProdutoPO produtoPage;

    @BeforeClass
    public static void prepararTestes() {
        produtoPage = new ProdutoPO(driver);
        produtoPage.buttonCriar.click();
    	produtoPage.buttonCriar.click();
    }

    
    /**
     * Teste para verificar se é possível criar um produto com apenas o código preenchido.
     */
    @Test
    public void TC006_deveCriarProdutoComApenasCodigoEscrito() {
    	//produtoPage.buttonCriar.click();
    	//produtoPage.buttonCriar.click();
        produtoPage.inputCodigo.sendKeys("12345");
        produtoPage.inputNome.sendKeys("");
        produtoPage.inputQuantidade.sendKeys("");
        produtoPage.inputValor.sendKeys("");
        produtoPage.inputData.sendKeys("");

        produtoPage.buttonSalvar.click();

        String mensagem = produtoPage.obterMensagem();
		
		assertEquals(mensagem, "Todos os campos são obrigatórios para o cadastro!");
		
    }
    
   
    /**
     * Teste para verificar se é possível criar um produto com apenas o código e o nome preenchidos.
     */
    @Test
    public void TC007_deveCriarProdutoComApenasCodigoENome() {
    	//produtoPage.buttonCriar.click();
    	
        produtoPage.inputCodigo.sendKeys("12345");
        produtoPage.inputNome.sendKeys("Produto Teste");
        produtoPage.inputQuantidade.sendKeys("");
        produtoPage.inputValor.sendKeys("");
        produtoPage.inputData.sendKeys("");

        produtoPage.buttonSalvar.click();

        String mensagem = produtoPage.obterMensagem();
		
		assertEquals(mensagem, "Todos os campos são obrigatórios para o cadastro!");
		
        
    }

    /**
     * Teste para verificar se é possível criar um produto com apenas a quantidade e o valor preenchidos.
     */
    @Test
    public void TC010_deveCriarProdutoComApenasQuantidadeEValor() {
    	//produtoPage.buttonCriar.click();
        produtoPage.inputCodigo.sendKeys("");
        produtoPage.inputNome.sendKeys("");
        produtoPage.inputQuantidade.sendKeys("10");
        produtoPage.inputValor.sendKeys("15.99");
        produtoPage.inputData.sendKeys("");

        produtoPage.buttonSalvar.click();

        String mensagem = produtoPage.obterMensagem();
		
		assertEquals(mensagem, "Todos os campos são obrigatórios para o cadastro!");
		
    }
}

