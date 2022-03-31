import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;

public class Filter {

    public static void main(String...args){

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver;
        driver.get("https://www.amazon.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Select searchDropdownDescription = new Select(driver.findElement(By.xpath("//form//select)"));
        searchDropdownDescription.selectByVisibleText("Books");


        if(searchDropdownDescription.selectByVisibleText("All Departments")
                || searchDropdownDescription.selectByVisibleText("Arts & Crafts")
                || searchDropdownDescription.selectByVisibleText("Automotive")
                || searchDropdownDescription.selectByVisibleText("Baby")
                || searchDropdownDescription.selectByVisibleText("Beauty & Personal Care")
                || searchDropdownDescription.selectByVisibleText("Books")
                || searchDropdownDescription.selectByVisibleText("Boys' Fashion")
                || searchDropdownDescription.selectByVisibleText("Computers")
                || searchDropdownDescription.selectByVisibleText("Deals")
                || searchDropdownDescription.selectByVisibleText("Digital Music")
                || searchDropdownDescription.selectByVisibleText("Electronics")
                || searchDropdownDescription.selectByVisibleText("Girls' Fashion")
                || searchDropdownDescription.selectByVisibleText("Health & Household")
                || searchDropdownDescription.selectByVisibleText("Home & Kitchen")
                || searchDropdownDescription.selectByVisibleText("Industrial & Scientific")
                || searchDropdownDescription.selectByVisibleText("Kindle Store")
                || searchDropdownDescription.selectByVisibleText("Luggage")
                || searchDropdownDescription.selectByVisibleText("Men's Fashion")
                || searchDropdownDescription.selectByVisibleText("Movies & TV")
                || searchDropdownDescription.selectByVisibleText("Music, CDs & Vinyl")
                || searchDropdownDescription.selectByVisibleText("Pet Supplies")
                || searchDropdownDescription.selectByVisibleText("Prime Video")
                || searchDropdownDescription.selectByVisibleText("Software")
                || searchDropdownDescription.selectByVisibleText("Sports & Outdoors")
                || searchDropdownDescription.selectByVisibleText("Tools & Home Improvement")
                || searchDropdownDescription.selectByVisibleText("Toys & Games")
                || searchDropdownDescription.selectByVisibleText("Video Games")
                || searchDropdownDescription.selectByVisibleText("Women's Fashion")
){
            System.out.print("One of the categories from the drop down list is chosen");

        }else{

            System.out.println("Error");

        }


    }
}



// -  //select[@id="searchDropdownBox"]

// -  //form//select