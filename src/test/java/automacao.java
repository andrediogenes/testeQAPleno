import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automacao {

    @Test
    public void especificacaoProduto() {
        System.setProperty("webdriver.chrome.driver", "src\\drive\\chromedriver.exe");
        WebDriver navegar = new ChromeDriver();

        navegar.get("https://advantageonlineshopping.com/");

        String text = "Redesigned with you in mind, the HP Pavilion keeps getting better. Our best-selling notebook is now more powerful so you can watch more, play more, and store more, all in style.";


        //Foi colocado um wait entre os get pois estava dando erro. Tentava se executar o comando antes da página carregar
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
        }

        navegar.findElement(By.id("see_offer_btn")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
        }

        //Fazendo a validação
        String bodyText = navegar.findElement(By.tagName("body")).getText();
        Assert.assertTrue("Text not found!", bodyText.contains(text));
    }
}