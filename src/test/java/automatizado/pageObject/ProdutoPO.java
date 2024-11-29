package automatizado.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProdutoPO extends BasePO {
	
	@FindBy(id = "btn-adicionar")
	public WebElement buttonCriar;
	
	@FindBy(id = "codigo")
	public WebElement inputCodigo;
	
	@FindBy(id = "nome")
	public WebElement inputNome;
	
	@FindBy(id = "quantidade")
	public WebElement inputQuantidade;
	
	@FindBy(id = "valor")
	public WebElement inputValor;
	
	@FindBy(id = "data")
	public WebElement inputData;
	
	@FindBy(id="btn-salvar")
	public WebElement buttonSalvar;
	
	@FindBy(id="btn-sair")
	public WebElement buttonSair;
	
	@FindBy(css = "div.alert>span") // Ajuste o seletor CSS para o elemento da mensagem de erro.
	public WebElement mensagemErro;

    public ProdutoPO(WebDriver driver) {
        super(driver);
    }
    
    // Método para salvar o produto
    public void salvarProduto() {
        buttonSalvar.click();
    }

    // Método para fechar o modal
    public void sairModal() {
        buttonSair.click();
    }
    
    public String obterMensagem() {
        return mensagemErro.getText(); // Certifique-se de que 'mensagemErro' está mapeado corretamente.
    }

}
