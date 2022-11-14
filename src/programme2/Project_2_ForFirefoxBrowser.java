package programme2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Project_2_ForFirefoxBrowser {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();

        //Launch the url
        driver.get("https://opensource-demo.orangehrmlive.com/");

        //Maximise the window
        driver.manage().window().maximize();

        //give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get page title
        System.out.println("The page title is :"+driver.getTitle());
        //get current url
        System.out.println("The Current URL is :"+driver.getCurrentUrl());
        //get page source element
        System.out.println("The Page Source elements is :"+driver.getPageSource());

        //find the email field and send the email
        WebElement userName =driver.findElement(By.name("username"));
        userName.sendKeys("orange2022@gmail.com");

        //find the password field and send the password
        WebElement password=driver.findElement(By.name("password"));
        password.sendKeys("adtala123");

        //driver.quit();
    }
}
