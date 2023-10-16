package seleniumour2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumXpathPhoneBook {
    WebDriver driver;

    @BeforeClass
    public void preConditions(){
        driver = new ChromeDriver();
        driver.navigate().to("https://telranedu.web.app/home");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @Test
    public void test1Xpath(){
        System.out.println(driver.findElement(By.xpath("//div/h1")).getText());//by "daughter" element on every level

        driver.findElement(By.xpath("//*[text() = 'ABOUT']"));//by text

        driver.findElement(By.xpath("//*[contains(text(), 'Component')]"));//by partial text

        driver.navigate().to("https://telranedu.web.app/login");

        driver.findElement(By.xpath("//div[@class='navbar-component_nav__1X_4m']"));

        driver.findElement(By.xpath("//input[contains(@name, 'ema')]"));

        List<WebElement> listInputs = driver.findElements(By.xpath("//input[@name]"));
        System.out.println("length of list of inputs with name: " + listInputs.size());

        WebElement parentOfInput = driver.findElement(By.xpath("//input[@name='password']/.."));

        System.out.println("print attribute name " + parentOfInput.getText());


    }

    @AfterClass
    public void postConditions(){
        driver.quit();
    }
}
