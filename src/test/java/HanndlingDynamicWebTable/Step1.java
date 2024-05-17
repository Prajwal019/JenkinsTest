package HanndlingDynamicWebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Step1
{
    @Test
    public void testNoOfPagesInWebTable() throws InterruptedException
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.opencart.com/admin/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("input-username")).sendKeys("demo");
        driver.findElement(By.id("input-password")).sendKeys("demo");
        driver.findElement(By.xpath("//button[text()=' Login']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@class='btn-close']")).click();
        driver.findElement(By.xpath("//a[text()=' Sales']")).click();
        driver.findElement(By.xpath("//a[text()='Orders']")).click();

        // To get the total number of pages

        String totalNumPages=driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
        System.out.println(totalNumPages);
        int totalPages = Integer.valueOf(totalNumPages.substring(totalNumPages.indexOf("(") + 1, totalNumPages.indexOf("Pages") - 1));
        System.out.println(totalPages);
        driver.close();
    }
}
