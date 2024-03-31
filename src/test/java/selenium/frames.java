package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class frames {
    static WebDriver driver;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\91968\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
        WebElement link = driver.findElement(By.xpath("//a[text()='Free Access to InterviewQues/ResumeAssistance/Material']"));
        link.click();

        Point poi = link.getLocation();  //To get the location or co-ordinates of particular element
        System.out.println(poi);

        Set<String> windows =driver.getWindowHandles();
        Iterator<String> it =windows.iterator();
        String parentId = it.next();
        String childId = it.next();
        driver.switchTo().window(childId);

        WebElement email = driver.findElement(By.xpath("//p[@class='im-para red']"));
        String EmailText = email.getText();
        System.out.println(EmailText);

        String trimedEmail = EmailText.split("at")[1].trim();
        String finalEmail = trimedEmail.split(" ")[0];
        System.out.println(finalEmail);  //only emailId is extracted here

        driver.switchTo().window(parentId); //Back to parent window

        WebElement userName = driver.findElement(By.cssSelector("input[id='username']"));
        userName.sendKeys(finalEmail);

    }
}
