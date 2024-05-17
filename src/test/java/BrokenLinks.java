import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class BrokenLinks
{
    @Test
    public void brokenLinks()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.shopsy.in/");
        List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
        int size = allLinks.size();
        ArrayList<String> links = new ArrayList<>();
        for (int i = 0; i < size; i++)
        {
            URL url = null;
            int statusCode = 0;
            String eachLink = allLinks.get(0).getAttribute("href");
            try
            {
                url = new URL(eachLink);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                if (statusCode > 400)
                {
                    links.add(eachLink + " : " + statusCode);
                }
            } catch (Exception e)
            {
                links.add(eachLink + " : " + statusCode);
            }
        }
        System.out.println(links);
    }
}
