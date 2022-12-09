import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automacao {

    @Test
    public void camposObrigatoriosCEP() {
        System.setProperty("webdriver.chrome.driver", "src\\drive\\chromedriver.exe");
        WebDriver navegar = new ChromeDriver();
        String textCEP = "Informe no mínimo 8 caracteres";

        navegar.get("https://loja.portoseguro.com.br/porto-seguro-celular/dados-iniciais.html");

        //Foi colocado um wait entre os get pois estava dando erro. Tentava se executar o comando antes da página carregar
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
        }

        navegar.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div[2]/div/button[2]")).click();

        navegar.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).click();
        navegar.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("123");
        navegar.findElement(By.xpath("//*[@id=\"spa-root\"]/section/section/section/app-main/aem-page/aem-model-provider/aem-responsivegrid/div[6]/aem-responsivegrid/div[2]/app-spacer/div/div/div")).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
        }
        //Validacoes
        String bodyText = navegar.findElement(By.xpath("/html/body/div[1]/section/section/section/app-main/aem-page/aem-model-provider/aem-responsivegrid/div[6]/aem-responsivegrid/div[5]/app-well-insured/div/form/div[1]/mat-form-field/div/div[3]/div/mat-error")).getText();
        Assert.assertTrue("Text not found!", bodyText.contains(textCEP));

    }

    @Test
    public void camposObrigatoriosCPF() {
        System.setProperty("webdriver.chrome.driver", "src\\drive\\chromedriver.exe");
        WebDriver navegar = new ChromeDriver();
        String textCPF = "Preenchimento obrigatório";

        navegar.get("https://loja.portoseguro.com.br/porto-seguro-celular/dados-iniciais.html");


        //Foi colocado um wait entre os get pois estava dando erro. Tentava se executar o comando antes da página carregar
        try {Thread.sleep(5000);} catch (InterruptedException ex) {}
        navegar.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div[2]/div/button[2]")).click();


        navegar.findElement(By.xpath("/html/body/div[1]/section/section/section/app-main/aem-page/aem-model-provider/aem-responsivegrid/div[6]/aem-responsivegrid/div[5]/app-well-insured/div/form/div[1]/div[4]/mat-form-field/div/div[1]/div[1]/input\n")).click();
        navegar.findElement(By.xpath("//*[@id=\"spa-root\"]/section/section/section/app-main/aem-page/aem-model-provider/aem-responsivegrid/div[6]/aem-responsivegrid/div[2]/app-spacer/div/div/div")).click();

        try {Thread.sleep(2000);} catch (InterruptedException ex) {}
        //Validacoes
        String bodyText = navegar.findElement(By.xpath("/html/body/div[1]/section/section/section/app-main/aem-page/aem-model-provider/aem-responsivegrid/div[6]/aem-responsivegrid/div[5]/app-well-insured/div/form/div[1]/div[4]/mat-form-field/div/div[3]/div/mat-error")).getText();
        Assert.assertTrue("Text not found!", bodyText.contains(textCPF));
    }

    @Test
    public void camposObrigatoriosNome(){
        System.setProperty("webdriver.chrome.driver", "src\\drive\\chromedriver.exe");
        WebDriver navegar = new ChromeDriver();
        String textNome = "Preenchimento obrigatório";

        navegar.get("https://loja.portoseguro.com.br/porto-seguro-celular/dados-iniciais.html");


        //Foi colocado um wait entre os get pois estava dando erro. Tentava se executar o comando antes da página carregar
        try {Thread.sleep(5000);} catch (InterruptedException ex) {}
        navegar.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div[2]/div/button[2]")).click();

        navegar.findElement(By.xpath("//*[@id=\"mat-input-2\"]")).click();
        navegar.findElement(By.xpath("//*[@id=\"spa-root\"]/section/section/section/app-main/aem-page/aem-model-provider/aem-responsivegrid/div[6]/aem-responsivegrid/div[2]/app-spacer/div/div/div")).click();


        try {Thread.sleep(2000);} catch (InterruptedException ex) {}
        //Validacoes
        String bodyText = navegar.findElement(By.xpath("//*[@id=\"mat-error-2\"]")).getText();
        Assert.assertTrue("Text not found!", bodyText.contains(textNome));
    }

    @Test
    public void camposObrigatoriosCelular(){
        System.setProperty("webdriver.chrome.driver", "src\\drive\\chromedriver.exe");
        WebDriver navegar = new ChromeDriver();
        String textNome = "Preenchimento obrigatório";

        navegar.get("https://loja.portoseguro.com.br/porto-seguro-celular/dados-iniciais.html");


        //Foi colocado um wait entre os get pois estava dando erro. Tentava se executar o comando antes da página carregar
        try {Thread.sleep(5000);} catch (InterruptedException ex) {}
        navegar.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div[2]/div/button[2]")).click();

        navegar.findElement(By.xpath("//*[@id=\"mat-input-3\"]")).click();
        navegar.findElement(By.xpath("//*[@id=\"spa-root\"]/section/section/section/app-main/aem-page/aem-model-provider/aem-responsivegrid/div[6]/aem-responsivegrid/div[2]/app-spacer/div/div/div")).click();


        try {Thread.sleep(2000);} catch (InterruptedException ex) {}
        //Validacoes
        String bodyText = navegar.findElement(By.xpath("//*[@id=\"mat-error-3\"]")).getText();
        Assert.assertTrue("Text not found!", bodyText.contains(textNome));
    }

    @Test
    public void camposObrigatoriosEmail(){
        System.setProperty("webdriver.chrome.driver", "src\\drive\\chromedriver.exe");
        WebDriver navegar = new ChromeDriver();
        String textNome = "Preenchimento obrigatório";

        navegar.get("https://loja.portoseguro.com.br/porto-seguro-celular/dados-iniciais.html");


        //Foi colocado um wait entre os get pois estava dando erro. Tentava se executar o comando antes da página carregar
        try {Thread.sleep(5000);} catch (InterruptedException ex) {}
        navegar.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div[2]/div/button[2]")).click();

        navegar.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).click();
        navegar.findElement(By.xpath("//*[@id=\"spa-root\"]/section/section/section/app-main/aem-page/aem-model-provider/aem-responsivegrid/div[6]/aem-responsivegrid/div[2]/app-spacer/div/div/div")).click();


        try {Thread.sleep(2000);} catch (InterruptedException ex) {}
        //Validacoes
        String bodyText = navegar.findElement(By.xpath("//*[@id=\"mat-error-4\"]")).getText();
        Assert.assertTrue("Text not found!", bodyText.contains(textNome));
    }

    @Test
    public void camposObrigatoriosModelo(){
        System.setProperty("webdriver.chrome.driver", "src\\drive\\chromedriver.exe");
        WebDriver navegar = new ChromeDriver();
        String textNome = "Preenchimento obrigatório";

        navegar.get("https://loja.portoseguro.com.br/porto-seguro-celular/dados-iniciais.html");


        //Foi colocado um wait entre os get pois estava dando erro. Tentava se executar o comando antes da página carregar
        try {Thread.sleep(5000);} catch (InterruptedException ex) {}
        navegar.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div[2]/div/button[2]")).click();

        navegar.findElement(By.xpath("//*[@id=\"mat-input-5\"]")).click();
        navegar.findElement(By.xpath("//*[@id=\"spa-root\"]/section/section/section/app-main/aem-page/aem-model-provider/aem-responsivegrid/div[6]/aem-responsivegrid/div[2]/app-spacer/div/div/div")).click();


        try {Thread.sleep(2000);} catch (InterruptedException ex) {}
        //Validacoes
        String bodyText = navegar.findElement(By.xpath("//*[@id=\"mat-error-5\"]")).getText();
        Assert.assertTrue("Text not found!", bodyText.contains(textNome));
    }
}