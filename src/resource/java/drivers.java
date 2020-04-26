import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class drivers 
{
public static WebDriver drivers;
public static WebDriver Drive(String browser)
{
if(browser.equalsIgnoreCase("chrome"))
{
System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Selenium\\Driver\\chromedriver.exe");	
drivers=new ChromeDriver();
}
else if(browser.equalsIgnoreCase("firefox"))
{
System.setProperty("webdriver.gecko.driver","E:\\Selenium\\Selenium\\Driver\\geckodriver.exe");	
WebDriver driver=new FirefoxDriver();
}
else
{
System.out.println("Browser not Present");
}
drivers.get("https://www.facebook.com/");
return drivers;
}
}
