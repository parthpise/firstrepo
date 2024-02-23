package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class extractAword {
    static WebDriver driver;
public static void main(String [] args) throws IllegalStateException, InterruptedException {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\91968\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("https://rahulshettyacademy.com/locatorspractice/");
    WebElement forgotPassword= driver.findElement(By.xpath("//*[text()='Forgot your password?']"));
    forgotPassword.click();
    Thread.sleep(5000);
    WebElement resetLogin = driver.findElement(By.xpath("//button[@class='reset-pwd-btn']"));
    resetLogin.click();
    WebElement info = driver.findElement(By.cssSelector("form p"));
    String infotext = info.getText();
    System.out.println(infotext);
    String [] password1 = infotext.split("'");
    String [] password2 = password1 [1].split("'");
    String pass = password2 [0];
    System.out.println(pass);

}

public static void passwordreturn (){
    driver.get("https://rahulshettyacademy.com/locatorspractice/");
    WebElement forgotPassword= driver.findElement(By.xpath("//*[text()='Forgot your password?']"));
    forgotPassword.click();
    WebElement resetLogin = driver.findElement(By.xpath("//button[@class='reset-pwd-btn']"));
    resetLogin.click();
    WebElement info = driver.findElement(By.xpath("//p[@class='infoMsg"));
    String infotext = info.getText();
    System.out.println(infotext);


}
}
