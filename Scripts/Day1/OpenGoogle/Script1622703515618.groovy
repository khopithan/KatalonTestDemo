import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

//WebDriver driver = new ChromeDriver();
//driver.get("https://www.google.com");

System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.get("https://www.youtube.com/");