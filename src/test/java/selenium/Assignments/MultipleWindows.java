package selenium.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MultipleWindows {
    static WebDriver driver;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\91968\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/");
        WebElement multipleWindow = driver.findElement(By.xpath("//a[text()='Multiple Windows']"));
        multipleWindow.click();
        WebElement clickhere = driver.findElement(By.xpath("//a[text()='Click Here']"));
        clickhere.click();

        Set<String> windows =driver.getWindowHandles();
        Iterator<String> it =windows.iterator();
        String parentId = it.next();
        String childId = it.next();

        driver.switchTo().window(childId);
        WebElement newWindow = driver.findElement(By.xpath("//h3[text()='New Window']"));
        String childWindowText = newWindow.getText();
        System.out.println(childWindowText);

        driver.switchTo().window(parentId);
        WebElement parentwindowheading = driver.findElement(By.xpath("//h3[text()='Opening a new window']"));
        String parentWindowText = parentwindowheading.getText();
        System.out.println(parentWindowText);
    }
}
