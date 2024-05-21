import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class Selenium_Practice
{
    @Test
    public void calenderPopUp()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        int a = 10;
        try
        {
            System.out.println(a / 0);
        } catch (Exception e)
        {

        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement popupEle = driver.findElement(By.cssSelector("iframe[title*='notification-frame']"));
        driver.switchTo().frame(popupEle);
        WebElement popCloseEle = driver.findElement(By.cssSelector("a[class='close']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(popCloseEle).build().perform();
        popCloseEle.click();
        driver.switchTo().defaultContent();
        try
        {
            Thread.sleep(2000);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        WebElement departurePlace = driver.findElement(By.cssSelector("input[id='fromCity']"));
        departurePlace.click();
        driver.findElement(By.cssSelector("input[placeholder='From']")).sendKeys("Bengaluru");
        driver.findElement(By.xpath("//div[@class='autoSuggestPlugin hsw_autocomplePopup']/descendant::span[1]")).click();
        WebElement destinationPlace = driver.findElement(By.cssSelector("input[id='toCity']"));
        destinationPlace.click();
        driver.findElement(By.cssSelector("input[placeholder='To']")).sendKeys("Mangalore");
        driver.findElement(By.xpath("//div[@class='autoSuggestPlugin hsw_autocomplePopup']/descendant::span[1]")).click();
        WebElement departureDate = driver.findElement(By.xpath("//input[@id='departure']/parent::label/span"));
        departureDate.click();
        while (true)
        {
            try
            {
                String date = "21", month = "January", year = "2025";
                driver.findElement(By.xpath("//div[@class='DayPicker-Caption' and .='" + month + " " + year + "']/parent::div/descendant::p[text()='" + date + "']")).click();
                break;
            } catch (Exception e)
            {
                driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
            }
        }
    }

    @Test
    public void testGoIbibo()
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.booking.com/city/in/calcutta");
    }
}
