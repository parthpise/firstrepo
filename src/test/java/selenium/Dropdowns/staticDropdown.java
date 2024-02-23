package selenium.Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class staticDropdown {
    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\91968\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
        WebElement currency = driver.findElement(By.xpath("//select[contains(@id,'mainContent_DropDownListCurrency')]"));
        Select staticdrp = new Select(currency);
        staticdrp.selectByVisibleText("AED");
        String Selectedopt = staticdrp.getFirstSelectedOption().getText();
        System.out.println(Selectedopt);
    }
}
