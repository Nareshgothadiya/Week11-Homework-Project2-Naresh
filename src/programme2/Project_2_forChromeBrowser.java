package programme2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Project_2_forChromeBrowser {
    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        //Create Object
        WebDriver driver = new ChromeDriver();

        //Launch the URL
        driver.get(baseUrl);  //method also like driver.get("https://opensource-demo.orangehrmlive.com/");

        //Maximize Window
        driver.manage().window().maximize();

        //we get implicit time to driver for wait until few second
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Print the title of the page
        String title = driver.getTitle();
        System.out.println("The page title is :" + title);

        //Print Current URL
        System.out.println("The Current URL is :" + driver.getCurrentUrl());

        //Print the Page Source
        System.out.println("The page source is :" + driver.getPageSource());

        //Find the Email field element and send the email
        WebElement enterEmail = driver.findElement(By.name("username"));

        //Type email in to email field
        enterEmail.sendKeys("naresh23@gmail.com");

        //Type email in to email field
        WebElement enterPassword = driver.findElement(By.name("password"));
        //Enter the password
        enterPassword.sendKeys("Primetest12");

        //Close the browser
        //driver.quit();
    }
}
