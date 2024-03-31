package selenium.Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class dynamicDropdown {
static WebDriver driver;
    public static void main(String [] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\91968\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.xpath("(//input[contains(@id,'_mainContent_ddl_originStation1_CTXT')])")).click();
        WebElement adampur = driver.findElement(By.xpath("//div[contains(@id,'mainContent_ddl_originStation1_CTNR')] //a[@value='AIP']"));
        adampur.click();
        WebElement goa = driver.findElement(By.xpath("//div[contains(@id,'mainContent_ddl_destinationStation1_CTNR')] //a[@value='GOI']"));
        goa.click();

        WebElement countryOptions = driver.findElement(By.xpath("//input[@id='autosuggest']"));
        countryOptions.sendKeys("Ind");
        List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
        for(WebElement option : options)
        if(countryOptions.getText().equalsIgnoreCase("India")){
         option.click();
        }

    }

}
