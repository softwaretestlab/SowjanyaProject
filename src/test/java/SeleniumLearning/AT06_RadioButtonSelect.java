package SeleniumLearning;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AT06_RadioButtonSelect {

    @Test
    public void NavHn() throws InterruptedException {
        //setting up chromedriver
        WebDriverManager.chromedriver().setup();
        //options
        ChromeOptions chromeOptions = new ChromeOptions();
        //we create an object of WebDriver
        WebDriver driver = new ChromeDriver(chromeOptions);
        //At this point browser will be opened
        //maximize browser
        driver.manage().window().maximize();
        //Navigate to HN website
        driver.get("http://www.echoecho.com/htmlforms10.htm");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        List<WebElement> RadioButtonsList=driver.findElements(By.name("radio1"));
        int RadioSize=RadioButtonsList.size();
        System.out.println("RadioSize :"+RadioSize);
            // this will click on second button
     //   RadioButtonsList.get(1).click();

//        for(int i=0;i<RadioSize;i++){
//            // this is how we get attribute values
//            String AttVal= RadioButtonsList.get(i).getAttribute("type");
//            System.out.println("AttVal :"+AttVal);
//            if(AttVal.equalsIgnoreCase("radio")){
//                RadioButtonsList.get(i).click();
//                //this will break the loop
//                break;
//            }
//
//        }


        for(int i=0;i<RadioSize;i++){
            // this is how we get attribute values
            boolean RadioTxt= RadioButtonsList.get(i).isSelected();
            System.out.println("RadioTxt :"+RadioTxt);
            if(RadioTxt==false){
                RadioButtonsList.get(i).click();
                //this will break the loop
                break;
            }

        }

    }
}
