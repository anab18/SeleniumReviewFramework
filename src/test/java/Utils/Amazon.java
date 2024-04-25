package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

import static Utils.ConfigReader.read;
public class Amazon {
    public static  WebDriver driver;
    public static void OpenBrowser() {
        driver = new ChromeDriver();
        driver.get("www.amazon.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // WebElement tv= (WebElement) driver.findElements(By.id("hm-icon nav-sprite"));
        WebElement clickHomburger = driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']"));
        clickHomburger.click();
        WebElement clickSeeAll = driver.findElement(By.name("See all"));
        clickSeeAll.click();
        WebElement Electronic = driver.findElement(By.name("Electronics"));
        Electronic.click();
        WebElement TVAndVideo = driver.findElement(By.xpath("//a[@class='hmenu-item']"));
        TVAndVideo.click();
    }




}
