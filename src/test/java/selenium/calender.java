package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender {
    static WebDriver driver;
    public static void main(String [] args){
        System.setProperty("WebDriver.chrome.driver","C:\\Users\\91968\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.findElement(By.xpath("//div[@data-testid='departure-date-dropdown-label-test-id']")).click();

    }
}
