package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Action {
    static WebDriver driver;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\91968\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.amazon.in/");
        WebElement Hello =driver.findElement(By.cssSelector("span[id*='nav-link-accountList-nav']"));
        Actions a = new Actions(driver);
        a.moveToElement(Hello).build().perform();   //Moves to specific element and makes hover on that

        WebElement searchBox = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
        a.moveToElement(searchBox).click().keyDown(Keys.SHIFT).sendKeys("Tshirt for men").keyDown(Keys.SHIFT).keyDown(Keys.HOME).build().perform();

    }
}
