package firstProjectAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTest {

	WebDriver driver = new ChromeDriver();

	@BeforeTest
	public void mySetup() {

		driver.manage().window().maximize();
		driver.get("https://www.google.co.uk/");

	}

	@Test
	public void firstTest() {

		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Dania Jarad LinkedIn");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/span/a/h3")).click();

		// driver.quit();
		// driver.close();
	}

}
