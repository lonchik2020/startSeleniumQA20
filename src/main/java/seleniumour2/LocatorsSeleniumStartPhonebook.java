package seleniumour2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LocatorsSeleniumStartPhonebook {

    WebDriver driver;//object that works with browser

    @Test
    public void test() {
        driver = new ChromeDriver();
        driver.navigate().to("https://telranedu.web.app/home");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        WebElement h1TextElement = driver.findElement(By.cssSelector("h1"));
        System.out.println(h1TextElement.getText());

        WebElement h3ByTagName = driver.findElement(By.tagName("h3"));
        System.out.println(h3ByTagName.getTagName());

        WebElement h1TextElementByClass = driver.findElement(By.cssSelector(".active"));
        System.out.println(h1TextElementByClass.getText());

        WebElement h1TextElementByClassName = driver.findElement(By.className("active"));
        System.out.println(h1TextElementByClassName.getText());


        WebElement divById = driver.findElement(By.cssSelector("#root"));
        System.out.println(divById.getAttribute("id"));

        WebElement elementAttribute = driver.findElement(By.cssSelector("[href='/home']"));
        System.out.println(elementAttribute.getText());















//        try {
//            Thread.sleep(5000);//to stop all the actions for 5 sec
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//
//        }

        driver.quit();
    }

}
