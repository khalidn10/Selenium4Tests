package selenium_4_0_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

public class RelativeLocatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create Chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Khalid\\Documents\\Documents\\Courses\\Selenium\\Apps\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Load demo eCommerce web app
		driver.get("https://www.rahulshettyacademy.com/angularpractice/");
		
		// Find the label element above the 'Name' input field
		// First create the web element for the 'Name' input field
		/*WebElement nameInputField = driver.findElement(By.cssSelector("[name='name']"));
		
		// Print the label above the 'Name' input field
		System.out.println(driver.findElement(withTagName("label").above(nameInputField)).getText());
		
		// Print the label above the 'Name' input field using a locator instead of web element
		System.out.println(driver.findElement(withTagName("label").above(By.cssSelector("[for='dateofBirth']"))).getText());
		
		// Find the input field below the 'Date of Birth' label
		// First create the web element for the 'Date of Birth' label
		WebElement dobLabel = driver.findElement(By.cssSelector("[for='dateofBirth']"));
		
		// Input a date of birth in the input field below the 'Date of Birth' label
		driver.findElement(withTagName("input").below(dobLabel)).sendKeys("01/01/1990");
		
		// Input a date of birth in the input field below the 'Date of Birth' label using a locator instead of web element
		driver.findElement(withTagName("input").below(By.cssSelector("[for='dateofBirth']"))).sendKeys("01/01/1990");
		
		// Find checkbox to the left of the 'Love IceCream' text
		// First create element for the 'Love IceCream' text
		WebElement checkBoxText = driver.findElement(By.xpath("//*[text()='Check me out if you Love IceCreams!']"));
		
		// Tick checkbox to the left of the 'Love IceCream' text
		driver.findElement(withTagName("input").toLeftOf(checkBoxText)).click();
		
		// Tick checkbox to the left of the 'Love IceCream' text using a locator instead of web element
		driver.findElement(withTagName("input").toLeftOf(By.xpath("//*[text()='Check me out if you Love IceCreams!']"))).click();
		
		// Find radio button to right of 'Employment Status' label
		// First create element for 'Employment Status' label
		WebElement employmentLabel = driver.findElement(By.cssSelector("[for='exampleFormControlRadio1']"));
		
		// Select radio button to right of 'Employment Status' label
		driver.findElement(withTagName("input").toRightOf(employmentLabel)).click();
		
		// Select radio button to right of 'Employment Status' label using a locator instead of web element
		driver.findElement(withTagName("input").toRightOf(By.cssSelector("[for='exampleFormControlRadio1']"))).click();*/
		
	}

}
