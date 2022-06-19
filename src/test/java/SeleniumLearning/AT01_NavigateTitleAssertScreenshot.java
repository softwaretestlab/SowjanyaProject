package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AT01_NavigateTitleAssertScreenshot {

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
        driver.get("https://www.harveynorman.com.au/");
        // implicit wait
        //maximum allocated time to load webpage is 10 sec
        // But for example if webpage loads in 2 seconds then the next line code will be executed
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Get Title
        String ActualTitle = driver.getTitle();
        System.out.println("ActualTitle : "+ActualTitle);
        String ExpectedTitle= "Harvey Norman | Shop Online for Computers, Electrical, Furniture, Bedding, Bathrooms & Flooring | Harvey Norman Australia";
        //Assertion Version-1
        Assert.assertEquals(ExpectedTitle,ActualTitle);
        //Assertion Version-2
        Assert.assertTrue(ActualTitle.contains("Computers"));
        //Screenshot
        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File("C:\\Users\\etikalaj\\screenshot.jpeg"));

    }
}
