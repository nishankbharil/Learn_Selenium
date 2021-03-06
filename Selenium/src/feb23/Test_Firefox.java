package feb23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test_Firefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("http://localhost:8999/hawtio");
		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(
				By.cssSelector("a[data-placement='bottom'][data-original-title='Connect to other JVMs']")));

		WebElement linkEle = driver
				.findElement(By.cssSelector("a[data-placement='bottom'][data-original-title='Connect to other JVMs']"));
		linkEle.click();

		wait.until(
				ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("input[type='text'][name='name']")));
		driver.findElement(By.cssSelector("input[type='text'][name='name']")).sendKeys("Nishank");
	}
}
