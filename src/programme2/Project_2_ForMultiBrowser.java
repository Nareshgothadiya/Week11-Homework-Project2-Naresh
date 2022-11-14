package programme2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Project_2_ForMultiBrowser {

    static String browser = "edge";
    static String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "drivers/msedgedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        } else {
            System.out.println("Wronge Browser");
        }
        //get page url
        driver.get(baseUrl);
        //maximise window
        driver.manage().window().maximize();
        //give implicit tioumeout
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get page title
        System.out.println("The Page title is :" + driver.getTitle());
        //get current url
        System.out.println("The Current URL is :" + driver.getCurrentUrl());
        //get page source elements
        System.out.println("The Page Source Element is :" + driver.getPageSource());

        //find email field element and send email
        WebElement emailField = driver.findElement(By.name("username"));
        emailField.sendKeys("orangetest@gmail.com");

        //find password field and send password
        WebElement passField = driver.findElement(By.name("password"));
        passField.sendKeys("pass1234");
        //close the browser
        // driver.quit();
    }
}
