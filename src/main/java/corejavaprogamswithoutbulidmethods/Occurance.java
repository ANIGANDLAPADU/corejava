package corejavaprogamswithoutbulidmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Occurance {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		Actions act = new Actions(driver);
		WebElement hold = driver.findElement(By.xpath("//p[normalize-space()='Drag me to my target']"));
		WebElement rlr = driver.findElement(By.xpath("//div[@id='droppable']"));
		act.dragAndDrop(hold, rlr).perform();
		WebElement user = driver.findElement(By.xpath("//input[@id='name']"));
		user.sendKeys("seshu");
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		driver.switchTo().newWindow(WindowType.TAB);

	}
}
