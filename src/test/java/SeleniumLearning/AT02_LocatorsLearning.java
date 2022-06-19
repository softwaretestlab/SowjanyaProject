package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AT02_LocatorsLearning {
    @Test
    public void NavHn() throws IOException {
        //From WebDriverManager we are settingup chromedriver
        WebDriverManager.chromedriver().setup();
        // chrome browser will be opened
        // we also created driver object and we use this object to play with webpages
        WebDriver driver = new ChromeDriver();
        //Maximize the window
        driver.manage().window().maximize();
        // Lets navigate to a webpage
        driver.get("https://www.harveynorman.com.au/customer/account/create");
        // implicit wait
        //maximum allocated time to load webpage is 10 sec
        // But for example if webpage loads in 2 seconds then the next line code will be executed
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //id
        driver.findElement(By.id("firstname")).sendKeys("FirstName");
        //name
        driver.findElement(By.name("lastname")).sendKeys("LastName");
        //CSS selector
        driver.findElement(By.cssSelector("#email_address")).sendKeys("test@gmail.com");
        //xpath
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("test@gmail.com");
        //partial link text-- here we give a bit of link text
        driver.findElement(By.partialLinkText("Help & ")).click();
    }
}
