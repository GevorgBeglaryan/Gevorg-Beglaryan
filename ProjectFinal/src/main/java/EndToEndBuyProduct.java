import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import java.util.Scanner;

import java.util.concurrent.TimeUnit;


public class  EndToEndBuyProduct{

    public static void main(String...args) {

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver;
        driver.get("https://www.amazon.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Java Schildt The Complete Reference, Eleventh Edition");

        driver.findElement(new By.ByXPath("//form//div/span/input")).click();

        String expectedTitle1 = "Amazon.com : Java Schildt The Complete Reference, Eleventh Edition";
        String actualTitle1 = driver.getTitle();


        if(expectedTitle1.equals(actualTitle1)){

            System.out.println("The title is successfully displayed");

        }else{

            System.out.println("Error");

        }

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(new By.ByXPath("//div[2]/div[2]/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div/img")).click();

        String expectedTitle2 = "Java: The Complete Reference, Eleventh Edition: Schildt, Herbert: 9781260440232: Amazon.com: Books";
        String actualTitle2 = driver.getTitle();
        Assert.assertEquals(expectedTitle2, actualTitle2);


        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(new By.ByXPath("//form//span[2]//input") ) .click();

        String expectedTitle3 = "Amazon Sign-In";
        String actualTitle3 = driver.getTitle();
        Assert.assertEquals(expectedTitle3, actualTitle3);

//

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(new By.ByXPath("//span/a") ).release();
        System.out.println("Background color changes to dark gray color when hovering over the 'Create your Amazon account' button");

//

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(new By.ByXPath("//span/a") ).click();
        String expectedTitle4 = "Amazon Registration";
        String actualTitle4 = driver.getTitle();
        Assert.assertEquals(expectedTitle4, actualTitle4);


//
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(new By.ByXPath("//form/div/div/div[1]/input")).sendKeys.empty();
        driver.findElement(new By.ByXPath("//form//span/span/input")).click();
        String expectedTitle5 = "Enter your name";
        String actualTitle5 = driver.findElement(new By.ByXPath("//form/div/div/div[1]/div/div/div")).getText();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(new By.ByXPath("//form//div[2]/span/input")).sendKeys.empty();
        driver.findElement(new By.ByXPath("//form//span/span/input")).click();
        String expectedTitle6 = "Enter your email or mobile phone number";
        String actualTitle6 = driver.findElement(new By.ByXPath("//form//div[2]/div[3]/div/div")).getText();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(new By.ByXPath("//form/div/div/div[3]/div[1]/input")).sendKeys.empty();
        driver.findElement(new By.ByXPath("//form//span/span/input")).click();
        String expectedTitle7 = "Minimum 6 characters required";
        String actualTitle7 = driver.findElement(new By.ByXPath("//form//div[3]/div[1]/div[2]/div/div")).getText();


        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(expectedTitle5, actualTitle5);
        softAssert.assertEquals(expectedTitle6, actualTitle6);
        softAssert.assertEquals(expectedTitle7, actualTitle7);
        softAssert.assertAll();


//

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(new By.ByXPath("//form/div/div/div[1]/input")).sendKeys.empty();
        driver.findElement(new By.ByXPath("//form//div[2]/span/input")).sendKeys("gevorbeglaryan091@gmail.com"); //correct value
        driver.findElement(new By.ByXPath("//form/div/div/div[3]/div[1]/input")).sendKeys("Abcdefg"); //correct value
        driver.findElement(new By.ByXPath("//form/div/div/div[3]/div[2]/input")).sendKeys("Abcdefg"); //incorrect value
        driver.findElement(new By.ByXPath("//form//span/span/input")).click();

        String expectedTitle8 = "Enter your name";
        String actualTitle8 = driver.findElement(new By.ByXPath("//form/div/div/div[1]/div/div/div")).getText();

        Assert.assertEquals(expectedTitle8,actualTitle8);


//

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(new By.ByXPath("//form/div/div/div[1]/input")).sendKeys.(); //correct value
        driver.findElement(new By.ByXPath("//form//div[2]/span/input")).sendKeys.empty();
        driver.findElement(new By.ByXPath("//form/div/div/div[3]/div[1]/input")).sendKeys("Abcdefg"); //correct value
        driver.findElement(new By.ByXPath("//form/div/div/div[3]/div[2]/input")).sendKeys("Abcdefg"); //incorrect value
        driver.findElement(new By.ByXPath("//form//span/span/input")).click();

        String expectedTitle9 = "Enter your name";
        String actualTitle9 = driver.findElement(new By.ByXPath("//form/div/div/div[1]/div/div/div")).getText();

        Assert.assertEquals(expectedTitle9,actualTitle9);










//
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(new By.ByXPath("//form/div/div/div/div[1]/input[1]") ) .click();
        WebElement signIn = driver.findElement(By.id("ap_email"));
        signIn.sendKeys("ge.beglaryan@gmail.com");
        driver.findElement(By.id("signInSubmit")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //driver.findElement(new By.ByXPath(\"//form//span/span/input") ) .click();
        driver.findElement(By.name("password")).sendKeys("Gevorg1991!");
        driver.findElement(By.id("signInSubmit")).click();


        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Select countryRegion = new Select(driver.findElement(By.xpath("//form/div/div[1]/div/div[2]/span/span/span/span"));
        countryRegion.selectByVisibleText("Armenia");

        if(countryRegion.selectByVisibleText("Armenia") ){
            System.out.print("Armenia text is displayed as Armenia is selected as a value");

        }else{

            System.out.println("error");

        }



        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        if(driver.findElement(By.name("address-ui-widgets-enterAddressFullName")).sendKeys.empty()){

            driver.findElement(new By.ByXPath("//form/div//span/input")).click();
            System.out.println("When leaving Full Name field empty and clicking on 'Use this address' button, it changes to red color warning border");

        }
        if(driver.findElement(By.name("address-ui-widgets-enterAddressLine1")).sendKeys.empty())

            driver.findElement(new By.ByXPath("//form/div//span/input")).click();
            System.out.println("When leaving 'Street address' field empty and clicking on 'Use this address' button, it changes to red color warning border");

        }

        if(driver.findElement(By.name("address-ui-widgets-enterAddressCity")).sendKeys.empty())

                driver.findElement(new By.ByXPath("//form/div//span/input").click();
            System.out.println("When leaving 'City' field empty and clicking on 'Use this address' button, it changes to red color warning border");

        }

        if(driver.findElement(By.name("address-ui-widgets-enterAddressPostalCode")).sendKeys.empty()){

                driver.findElement(new By.ByXPath("//form/div//span/input")).click();
                System.out.println("When leaving 'Zip Code' field empty and clicking on 'Use this address' button, it changes to red color warning border");


        }

        if(driver.findElement(By.name("address-ui-widgets-enterAddressPhoneNumber")).sendKeys.empty()){

                driver.findElement(new By.ByXPath("//form/div//span/input")).click();
                System.out.println("When leaving 'Phone number' field empty and clicking on 'Use this address' button, it changes to red color warning border");


        }

       // if(driver.findElement(By.name("address-ui-widgets-enterAddressPostalCode")==String.value{
       //         driver.findElement(new By.ByXPath("//form/div//span/input")).click();
        //        System.out.println("When filling in the 'Zip code' field only letters and clicking on 'Use this address' button, Please enter a valid ZIP or postal code message is displayed");

          //      }


        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        if(driver.findElement(By.name("address-ui-widgets-enterAddressPostalCode")).sendKeys{

            int, char [] array = new int[3];
            Scanner scanner1 = new Scanner(System.in);

            for(int i=0;i<array.length,i++){

            System.out.print("Please enter a number");
            array[i]=scanner1.nextInt();


                if(!(array.charAt[i] == Integer))){

                driver.findElement(new By.ByXPath("//form/div//span/input")).click();
                System.out.println(" 'Please enter a valid ZIP or postal code' warning message is displayed ");
                }

                if( !(array.charAt[i] == Integer){

                    System.out.print(" 'Please enter a valid ZIP or postal code' warning message is displayed ");

                }

            }

        }





        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        if(driver.findElement(By.name("address-ui-widgets-enterAddressPhoneNumber")).sendKeys(){

        char [] array = new int[20];
        Scanner scanner2 = new Scanner(System.in);

        for(int i=0;i<array.length,i++){

            System.out.print("Please enter yout phone number");
            array[i]=scanner2.nextLine();


            if(!(array.charAt[i] == Integer)){

            driver.findElement(new By.ByXPath("//form/div//span/input")).click();
            System.out.println(" 'Please provide a valid phone number' warning message is displayed ");
            }


        }


        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.name("address-ui-widgets-enterAddressFullName")).sendKeys("Some name");
        driver.findElement(By.name("address-ui-widgets-enterAddressLine1")).sendKeys("Some address");
        driver.findElement(By.name("address-ui-widgets-enterAddressCity")).sendKeys("Some city name");
        driver.findElement(By.name("address-ui-widgets-enterAddressPostalCode")).sendKeys("Some zip code consisting of 4 digit");
        driver.findElement(By.name("address-ui-widgets-enterAddressPhoneNumber")).sendKeys("Some phone number");
        driver.findElement(new By.ByXPath("//form/div//span/input") ).click();

        String expectedTitle10 = "Select a Payment Method - Amazon.com Checkout";
        String actualTitle10 = driver.getTitle();

        if(expectedTitle10.equals(actualTitle10)){

        System.out.println("The title is successfully displayed");

        }else{

        System.out.println("Error");

        }


        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("pp-YLMGEY-69")).release();
        System.out.println("Background color changes to dark shade of gray color");


        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("pp-YLMGEY-69")).click();

        String expectedTitle11 = "Add a credit or debit card";
        String actualTitle11 = driver.findElement(new By.ByXPath("//*[@id="a-popover-header-1"]") ).getTitle();

        if(expectedTitle11.equals(actualTitle11)){

        System.out.println("The title is successfully displayed");

        }else{

        System.out.println("Error");

        }


        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(new By.ByXPath("//form//div/div[1]/div/input")).sendKeys.empty();
        driver.findElement(new By.ByXPath("//span[2]/span/input")).click();
        String expectedTitle12 = "There was a problem.";
        String actualTitle12 = driver.findElement(new By.ByXPath("//form/div[1]/div[1]/div/div/div/h4") ).getText();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(new By.ByXPath("//form//div[2]/div[2]/input")).sendKeys.empty();
        driver.findElement(new By.ByXPath("//span[2]/span/input")).click();
        String expectedTitle13 = "There was a problem.";
        String actualTitle13 = driver.findElement(new By.ByXPath("//form/div[1]/div[1]/div/div/div/h4") ).getText() ;



        //int[] month = {01,02,03,04,05,06,07,08,09,10,11,12};
        //for(int i = 0; i < month.length; i++){
        //System.out.println(month[i]);
        //}

        //int[] month = new int[11];
        //for(int i = 0; i < month.length; i++){
        //int random = (int) (Math.random() * 12 );
        //month[i] = random;
        //}
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Select drpMonth = new Select(driver.findElement(new By.ByXPath("//form//span[1]/span/span/i")));
        for(int i = 0; i < drpMonth.length; i++){

        drpMonth.selectByVisibleText("01"); //Select any option from the listed numbers from the drop down list for Expiration date(month)

        }
        driver.findElement(new By.ByXPath("//span[2]/span/input")).click();
        String expectedTitle14 = "There was a problem.";
        String actualTitle14 = driver.findElement(new By.ByXPath("//form/div[1]/div[1]/div/div/div/h4") ).getText();


        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Select drpYear = new Select(driver.findElement(new By.ByXPath("//form//span[3]/span/span/i")));
        for(int i = 0; i < drpYear.length; i++){

        drpYear.selectByVisibleText("2040"); //Select any option from the listed years from the drop down list for Expiration date(month)

        }

        driver.findElement(new By.ByXPath("//span[2]/span/input")).click();
        String expectedTitle15 = "There was a problem.";
        String actualTitle15 = driver.findElement(new By.ByXPath("//form/div[1]/div[1]/div/div/div/h4")).getText();



        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(expectedTitle12, actualTitle12);
        softAssert.assertEquals(expectedTitle13, actualTitle13);
        softAssert.assertEquals(expectedTitle14, actualTitle14);
        softAssert.assertEquals(expectedTitle15, actualTitle15);
        softAssert.assertAll();



//         Select drpMonth = new Select(driver.findElement(new By.ByXPath("//*[@id="pp-SJM3l6-21"]/span/i")));
//            for(int i = 0; i < drpMonth.length; i++){
//
//                drpMonth.selectByVisibleText("01"); //Select any option of the listed numbers from the drop down list for Expiration date(month)
//
//            }

//        Select drpYear = new Select(driver.findElement(new By.ByXPath("//span[3]/span/span/span/span")));
//            for(int i = 0; i < drpYear.length; i++){
//
//            drpYear.selectByVisibleText("2040"); //Select any option of the listed years from the drop down list for Expiration date(month)
//
//            }



          driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
          driver.findElement(new By.ByXPath("//form//div/div[1]/div/input")).sendKeys("1234567891011121"); //inputting random digits
          driver.findElement(new By.ByXPath("//form//div[2]/div[2]/input")).sendKeys.empty();
          Select drpMonth = new Select(driver.findElement(new By.ByXPath("//form//span[1]/span/span/i")));
            for(int i = 0; i < drpMonth.length; i++){

            drpMonth.selectByVisibleText("01"); //Select any option from the listed numbers from the drop down list for Expiration date(month)

            }

          Select drpYear = new Select(driver.findElement(new By.ByXPath("//form//span[3]/span/span/i")));
            for(int i = 0; i < drpYear.length; i++){

            drpYear.selectByVisibleText("2040"); //Select any option from the listed years from the drop down list for Expiration date(month)

            }

          driver.findElement(new By.ByXPath("//span[2]/span/input")).click();

          String expectedTitle16 = "There was a problem.";
          String actualTitle16 = driver.findElement(new By.ByXPath("//form/div[1]/div[1]/div/div/div/h4")).getText();

          Assert.assertEquals(expectedTitle16, actualTitle16);



//
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(new By.ByXPath("//form//div/div[1]/div/input")).sendKeys.empty();
        driver.findElement(new By.ByXPath("//form//div[2]/div[2]/input")).sendKeys("Gevorg Beglaryan"); //Name on card, accountHolderName
        Select drpMonth = new Select(driver.findElement(new By.ByXPath("//form//span[1]/span/span/i")));
        for(int i = 0; i < drpMonth.length; i++){

        drpMonth.selectByVisibleText("01"); //Select any option from the listed numbers from the drop down list for Expiration date(month)

        }

        Select drpYear = new Select(driver.findElement(new By.ByXPath("//form//span[3]/span/span/i")));
        for(int i = 0; i < drpYear.length; i++){

        drpYear.selectByVisibleText("2040"); //Select any option from the listed years from the drop down list for Expiration date(month)

        }

        driver.findElement(new By.ByXPath("//span[2]/span/input")).click();

        String expectedTitle17 = "There was a problem.";
        String actualTitle17 = driver.findElement(new By.ByXPath("//form/div[1]/div[1]/div/div/div/h4")).getText();

        Assert.assertEquals(expectedTitle17, actualTitle17);



//

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(new By.ByXPath("//form//div/div[1]/div/input")).sendKeys("5450570002105357"); //correct value the 16 digits taken from the plastic card
        driver.findElement(new By.ByXPath("//form//div[2]/div[2]/input")).sendKeys("Gevorg Beglaryan"); //correct value, Name on card, accountHolderName
        Select drpMonth = new Select(driver.findElement(new By.ByXPath("//form//span[1]/span/span/i")));
        for(int i = 0; i < drpMonth.length; i++){

        drpMonth.selectByVisibleText("01"); //Select incorrect option for Expiration date(month) from the listed numbers from the drop down list

        }

        Select drpYear = new Select(driver.findElement(new By.ByXPath("//form//span[3]/span/span/i")));
        for(int i = 0; i < drpYear.length; i++){

        drpYear.selectByVisibleText("2040"); //Select incorrect option for Expiration date(month) from the listed years from the drop down list

        }

        driver.findElement(new By.ByXPath("//span[2]/span/input")).click();

        String expectedTitle18 = "There was a problem.";
        String actualTitle18 = driver.findElement(new By.ByXPath("//form/div[1]/div[1]/div/div/div/h4")).getText();

        Assert.assertEquals(expectedTitle18, actualTitle18);



//

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(new By.ByXPath("//form//div/div[1]/div/input")).sendKeys("5450570002105357"); //correct value the 16 digits taken from the plastic card
        driver.findElement(new By.ByXPath("//form//div[2]/div[2]/input")).sendKeys("ABCD EFGH"); //incorrect value, Name on card, accountHolderName
        Select drpMonth = new Select(driver.findElement(new By.ByXPath("//form//span[1]/span/span/i")));
        for(int i = 0; i < drpMonth.length; i++){

        drpMonth.selectByVisibleText("01"); //Select incorrect option for Expiration date(month) from the listed numbers from the drop down list

        }

        Select drpYear = new Select(driver.findElement(new By.ByXPath("//form//span[3]/span/span/i")));
        for(int i = 0; i < drpYear.length; i++){

        drpYear.selectByVisibleText("2040"); //Select incorrect option for Expiration date(month) from the listed years from the drop down list

        }

        driver.findElement(new By.ByXPath("//span[2]/span/input")).click();

        String expectedTitle19 = "There was a problem.";
        String actualTitle19 = driver.findElement(new By.ByXPath("//form/div[1]/div[1]/div/div/div/h4")).getText();

        Assert.assertEquals(expectedTitle19, actualTitle19);


//

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(new By.ByXPath("//form//div/div[1]/div/input")).sendKeys("5450570002105357"); //correct value the 16 digits taken from the plastic card
        driver.findElement(new By.ByXPath("//form//div[2]/div[2]/input")).sendKeys("Gevorg Beglaryan"); //correct value, Name on card, accountHolderName
        Select drpMonth = new Select(driver.findElement(new By.ByXPath("//form//span[1]/span/span/i")));
        for(int i = 0; i < drpMonth.length; i++){

        drpMonth.selectByVisibleText("01"); //Select incorrect option for Expiration date(month) from the listed numbers from the drop down list

        }

        Select drpYear = new Select(driver.findElement(new By.ByXPath("//form//span[3]/span/span/i")));
        for(int i = 0; i < drpYear.length; i++){

        drpYear.selectByVisibleText("2040"); //Select incorrect option for Expiration date(month) from the listed years from the drop down list

        }

        driver.findElement(new By.ByXPath("//span[2]/span/input")).click();

        String expectedTitle20 = "There was a problem.";
        String actualTitle20 = driver.findElement(new By.ByXPath("//form/div[1]/div[1]/div/div/div/h4")).getText();

        Assert.assertEquals(expectedTitle20, actualTitle20);


//

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(new By.ByXPath("//form//div/div[1]/div/input")).sendKeys("5450570002105357"); //correct value the 16 digits taken from the plastic card
        driver.findElement(new By.ByXPath("//form//div[2]/div[2]/input")).sendKeys("Gevorg Beglaryan"); //correct value, Name on card, accountHolderName
        Select drpMonth = new Select(driver.findElement(new By.ByXPath("//form//span[1]/span/span/i")));
        for(int i = 0; i < drpMonth.length; i++){

        drpMonth.selectByVisibleText("06"); //Select correct option for Expiration date(month) from the listed numbers from the drop down list

        }

        Select drpYear = new Select(driver.findElement(new By.ByXPath("//form//span[3]/span/span/i")));
        for(int i = 0; i < drpYear.length; i++){

        drpYear.selectByVisibleText("2040"); //Select incorrect option for Expiration date(month) from the listed years from the drop down list

        }

        driver.findElement(new By.ByXPath("//span[2]/span/input")).click();

        String expectedTitle21 = "There was a problem.";
        String actualTitle21 = driver.findElement(new By.ByXPath("//form/div[1]/div[1]/div/div/div/h4")).getText();

        Assert.assertEquals(expectedTitle21, actualTitle21);



//

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(new By.ByXPath("//form//div/div[1]/div/input")).sendKeys("5450570002105357"); //correct value the 16 digits taken from the plastic card
        driver.findElement(new By.ByXPath("//form//div[2]/div[2]/input")).sendKeys("Gevorg Beglaryan"); //correct value, Name on card, accountHolderName
        Select drpMonth = new Select(driver.findElement(new By.ByXPath("//form//span[1]/span/span/i")));
        for(int i = 0; i < drpMonth.length; i++){

        drpMonth.selectByVisibleText("01"); //Select incorrect option for Expiration date(month) from the listed numbers from the drop down list

        }

        Select drpYear = new Select(driver.findElement(new By.ByXPath("//form//span[3]/span/span/i")));
        for(int i = 0; i < drpYear.length; i++){

        drpYear.selectByVisibleText("2022"); //Select correct option for Expiration date(month) from the listed years from the drop down list

        }

        driver.findElement(new By.ByXPath("//span[2]/span/input")).click();

        String expectedTitle22 = "There was a problem.";
        String actualTitle22 = driver.findElement(new By.ByXPath("//form/div[1]/div[1]/div/div/div/h4")).getText();

        Assert.assertEquals(expectedTitle22, actualTitle22);



//


        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(new By.ByXPath("//form//div/div[1]/div/input")).sendKeys.empty(); //empty value
        driver.findElement(new By.ByXPath("//form//div[2]/div[2]/input")).sendKeys("Gevorg Beglaryan"); //correct value, Name on card, accountHolderName
        Select drpMonth = new Select(driver.findElement(new By.ByXPath("//form//span[1]/span/span/i")));
        for(int i = 0; i < drpMonth.length; i++){

        drpMonth.selectByVisibleText("06"); //Select correct option for Expiration date(month) from the listed numbers from the drop down list

        }

        Select drpYear = new Select(driver.findElement(new By.ByXPath("//form//span[3]/span/span/i")));
        for(int i = 0; i < drpYear.length; i++){

        drpYear.selectByVisibleText("2022"); //Select correct option for Expiration date(month) from the listed years from the drop down list

        }

        driver.findElement(new By.ByXPath("//span[2]/span/input")).click();

        String expectedTitle23 = "There was a problem.";
        String actualTitle23 = driver.findElement(new By.ByXPath("//form/div[1]/div[1]/div/div/div/h4")).getText();

        Assert.assertEquals(expectedTitle23, actualTitle23);




//

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(new By.ByXPath("//form//div/div[1]/div/input")).sendKeys("5450570002105357"); //correct value
        driver.findElement(new By.ByXPath("//form//div[2]/div[2]/input")).sendKeys.empty(); //empty value
        Select drpMonth = new Select(driver.findElement(new By.ByXPath("//form//span[1]/span/span/i")));
        for(int i = 0; i < drpMonth.length; i++){

        drpMonth.selectByVisibleText("06"); //Select correct option for Expiration date(month) from the listed numbers from the drop down list

        }

        Select drpYear = new Select(driver.findElement(new By.ByXPath("//form//span[3]/span/span/i")));
        for(int i = 0; i < drpYear.length; i++){

        drpYear.selectByVisibleText("2022"); //Select correct option for Expiration date(month) from the listed years from the drop down list

        }

        driver.findElement(new By.ByXPath("//span[2]/span/input")).click();

        String expectedTitle24 = "There was a problem.";
        String actualTitle24 = driver.findElement(new By.ByXPath("//form/div[1]/div[1]/div/div/div/h4")).getText();

        Assert.assertEquals(expectedTitle24, actualTitle24);



 //

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(new By.ByXPath("//form//div/div[1]/div/input")).sendKeys("1234567891012131"); //incorrect value
        driver.findElement(new By.ByXPath("//form//div[2]/div[2]/input")).sendKeys("Gevorg Beglaryan"); //correct value
        Select drpMonth = new Select(driver.findElement(new By.ByXPath("//form//span[1]/span/span/i")));
        for(int i = 0; i < drpMonth.length; i++){

        drpMonth.selectByVisibleText("06"); //Select correct option for Expiration date(month) from the listed numbers from the drop down list

        }

        Select drpYear = new Select(driver.findElement(new By.ByXPath("//form//span[3]/span/span/i")));
        for(int i = 0; i < drpYear.length; i++){

        drpYear.selectByVisibleText("2022"); //Select correct option for Expiration date(month) from the listed years from the drop down list

        }

        driver.findElement(new By.ByXPath("//span[2]/span/input")).click();

        String expectedTitle25 = "There was a problem.";
        String actualTitle25 = driver.findElement(new By.ByXPath("//form/div[1]/div[1]/div/div/div/h4")).getText();

        Assert.assertEquals(expectedTitle25, actualTitle25);


//

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(new By.ByXPath("//form//div/div[1]/div/input")).sendKeys("5450570002105357"); //correct value
        driver.findElement(new By.ByXPath("//form//div[2]/div[2]/input")).sendKeys("ABCD EFGH"); //incorrect value
        Select drpMonth = new Select(driver.findElement(new By.ByXPath("//form//span[1]/span/span/i")));
        for(int i = 0; i < drpMonth.length; i++){

        drpMonth.selectByVisibleText("06"); //Select correct option for Expiration date(month) from the listed numbers from the drop down list

        }

        Select drpYear = new Select(driver.findElement(new By.ByXPath("//form//span[3]/span/span/i")));
        for(int i = 0; i < drpYear.length; i++){

        drpYear.selectByVisibleText("2022"); //Select correct option for Expiration date(month) from the listed years from the drop down list

        }

        driver.findElement(new By.ByXPath("//span[2]/span/input")).click();

        String expectedTitle26 = "There was a problem.";
        String actualTitle26 = driver.findElement(new By.ByXPath("//form/div[1]/div[1]/div/div/div/h4")).getText();

        Assert.assertEquals(expectedTitle26, actualTitle26);




//

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(new By.ByXPath("//form//div/div[1]/div/input")).sendKeys("5450570002105357"); //correct value
        driver.findElement(new By.ByXPath("//form//div[2]/div[2]/input")).sendKeys("Gevorg Beglaryan"); //correct value
        Select drpMonth = new Select(driver.findElement(new By.ByXPath("//form//span[1]/span/span/i")));
        for(int i = 0; i < drpMonth.length; i++){

        drpMonth.selectByVisibleText("06"); //Select correct option for Expiration date(month) from the listed numbers from the drop down list

        }

        Select drpYear = new Select(driver.findElement(new By.ByXPath("//form//span[3]/span/span/i")));
        for(int i = 0; i < drpYear.length; i++){

        drpYear.selectByVisibleText("2022"); //Select correct option for Expiration date(month) from the listed years from the drop down list

        }

        driver.findElement(new By.ByXPath("//span[2]/span/input")).click();

        String expectedTitle27 = "Mastercardending in 5357";
        String actualTitle27 = driver.findElement(new By.ByXPath("//form//span/div/label/span/span")).getText();

        Assert.assertEquals(expectedTitle27, actualTitle27);


    }

}
















