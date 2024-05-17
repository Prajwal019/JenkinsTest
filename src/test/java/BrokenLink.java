import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BrokenLink
{
    @Test
    public void BrokenLinks()
    {
        WebDriver driver = new ChromeDriver();

// Navigate to BStackDemo Website
        driver.get("https://www.flipkart.com/");

// Finding all the available links on webpage
        List<WebElement> links = driver.findElements(By.tagName("a"));

// Iterating each link and checking the response status
        for (WebElement link : links)
        {
            String url = link.getAttribute("href");
            try
            {
                int statusCode=0;
                URL linked = new URL(url);
                HttpURLConnection httpURLConnection = (HttpURLConnection) linked.openConnection();
                httpURLConnection.setConnectTimeout(3000); // Set connection timeout to 3 seconds
                httpURLConnection.connect();

                if (httpURLConnection.getResponseCode() >= 400)
                {
                    System.out.println(url + " - " +statusCode+" : "+ httpURLConnection.getResponseMessage()+ " - " + "is a broken link");
                }
                else
                {
                    System.out.println(url + " - " + httpURLConnection.getResponseMessage() );
                }
            }
            catch (Exception e)
            {
                System.out.println(url + " - " + "is a broken link");
            }
            driver.quit();
        }
    }
}
