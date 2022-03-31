import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class SearchBox {

    public static void main(String...args){

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver;
        driver.get("https://www.amazon.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("iphone");

        driver.findElement(new By.ByXPath("//form//div/span/input")).click();

        String expectedTitle = "Amazon.com : iphone";
        String actualTitle = driver.getTitle();


        if(expectedTitle.equals(actualTitle)){

            System.out.println("iphone is being searched by the user");

        }else{

            System.out.println("Error");

        }

        // Assert.assertEquals(expectedTitle, actualTitle);

    }

}


// Search field - //form//div[1]/input or id="twotabsearchtextbox"
// Search button - //form//div/span/input or //input[@ type ="submit"]