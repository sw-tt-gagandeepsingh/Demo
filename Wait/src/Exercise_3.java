import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.gson.annotations.Until;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Exercise_3 {

public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();		
String url = "https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt";
By trybutton_xpath = By.xpath("//button[contains(text(),'Try it')]");
By text_xpath = By.xpath("//p[@id='demo']");


driver.get(url);
driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
driver.manage().window().maximize();
WebElement iframeElement = driver.findElement(By.id("iframeResult"));
driver.switchTo().frame(iframeElement);
WebElement trybutton = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(trybutton_xpath));
trybutton.click();
Alert a1 = driver.switchTo().alert();
a1.sendKeys("Gagandeep");
a1.accept();
WebElement text = driver.findElement(text_xpath);
System.out.println("Your name"+text.getText());
driver.quit();
}//Branch code 

}
