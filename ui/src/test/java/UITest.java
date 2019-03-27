import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.CompletableFuture;

public class UITest {
    @Test
    public void test() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Серегй\\Desktop\\projects\\spring-boot\\ui\\target\\test-classes\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        CompletableFuture.runAsync(()->{
            while (true){
                Object element = ((JavascriptExecutor) webDriver).executeScript("return document.getElementsByClassName(\"gLFyf gsfi\")[0].value");
                System.out.println(element);
            }
        });
        webDriver.get("https://www.google.com");
        webDriver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("1233123");
        Thread.sleep(1000);
        webDriver.quit();
    }
}
