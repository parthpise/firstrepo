package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class xpathSiblings {
    static WebDriver driver;
    public static void main(String [] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\91968\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //here by using siblings we have used the xpath
        driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[2]")).click();
        //child to parent
        String practice =driver.findElement(By.xpath("//header/div/button[1]/parent::div")).getText();
        System.out.println(practice);

    }
}
