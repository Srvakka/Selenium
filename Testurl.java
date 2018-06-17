import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Testurl {


    public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver","C:\\Users\\hp1\\Downloads\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
    	
        String baseUrl = "https://www.bing.com/translator";
        driver.get(baseUrl);
       //driver.findElement(By.id("mslogo")).click();
       driver.findElement(By.id("BingLogo")).click();
       //driver.close();
    }

}