package HanndlingDynamicWebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Step3
{
    @Test
    public void testKnowDataOfTotalNumOfRows() throws InterruptedException
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.opencart.com/admin/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("input-username")).sendKeys("demo");
        driver.findElement(By.id("input-password")).sendKeys("demo");
        driver.findElement(By.xpath("//button[text()=' Login']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@class='btn-close']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[text()=' Sales']")).click();
        driver.findElement(By.xpath("//a[text()='Orders']")).click();

        String totalNumPages=driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']")).getText();
        System.out.println(totalNumPages);
        int totalPages = Integer.valueOf(totalNumPages.substring(totalNumPages.indexOf("(") + 1, totalNumPages.indexOf("Pages") - 1));
        System.out.println(totalPages);
        for (int p=1;p<3;p++)
        {
            WebElement activePage = driver.findElement(By.xpath("//ul[@class='pagination']/li/span"));
            System.out.println(activePage.getText());

            int rows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr")).size();
            System.out.println("No of Rows: "+ rows);

            for (int i=1;i<=rows;i++)
            {
                String orderId=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr["+i+"]/td[2]")).getText();
                String customer=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr["+i+"]/td[4]")).getText();
                String status=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr["+i+"]/td[5]")).getText();
                System.out.println(orderId+" : "+customer+" : "+status);
            }
            JavascriptExecutor j=(JavascriptExecutor)driver;
            j.executeScript("window.scrollTo(0, document.body.scrollHeight)");
            String pageNo=Integer.toString(p+1);
            Thread.sleep(4000);
            driver.findElement(By.xpath("//ul[@class='pagination']/descendant::a[text()='"+pageNo+"']")).click();
        }
    }
}

