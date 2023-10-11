package seleniumour2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SeleniumCssIlcarro {

    WebDriver driver;//object that works with browser

    @Test
    public void test1(){
        driver = new ChromeDriver();
        driver.navigate().to("https://ilcarro.web.app/search");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);//to wait 60 sec in searching for each element
        //if the element found earlier than 60 sec, the driver will continue forward

        WebElement h2TextElement = driver.findElement(By.cssSelector("h2"));//h2 - it is tag name
        System.out.println(h2TextElement.getText());

        WebElement h2ByTagName = driver.findElement(By.tagName("h2"));

        //        By.cssSelector("h2.subtitle")

        WebElement h2TextElementByClass = driver.findElement(By.cssSelector(".subtitle"));//by class value
        System.out.println(h2TextElementByClass.getText());

        WebElement h2TextElementByClassName = driver.findElement(By.className("subtitle"));//using class name
        System.out.println(h2TextElementByClassName.getText());


        WebElement h2ByClassAndTagTogether = driver.findElement(By.cssSelector("h2.subtitle"));

        WebElement inputCityById = driver.findElement(By.cssSelector("#city"));//by id value
        //id='city'
        System.out.println(inputCityById.getAttribute("type"));

        WebElement inputCityByIdDirectly = driver.findElement(By.id("city"));//by id value
        System.out.println(inputCityByIdDirectly.getAttribute("type"));

        WebElement wildElementAttribute = driver.findElement(By.cssSelector("[style='touch-action: none; user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);']"));
        //find by full attribute incl name and value


       // WebElement hrByText = driver.findElement(By.linkText("Type your data and hit Yalla!"));
        WebElement hrByText = driver.findElement(By.partialLinkText("hit"));




//        try {
//            Thread.sleep(5000);//to stop all the actions for 5 sec
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);


        //xpath

        WebElement xpathLabel = driver.findElement(By.xpath("//label[@for='city']"));
        //label[@for='city']/.. to jump to 1 tag up
        ////label[@for='city']// to go to tag span

        System.out.println(xpathLabel.getText());//to get the text between two labels

        driver.quit();

    }
}
