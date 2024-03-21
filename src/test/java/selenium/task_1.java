package selenium;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

/**
 * Unit test for simple App.
 */
public class task_1 
{
	WebDriver driver;
	
	@Test
	public void openBrowser() {
		// Set system property for Chrome driver
		System.setProperty("webdriver.chrome.driver", "C:/Users/deepika/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		
		// Initialize Chrome driver
		driver = new ChromeDriver();
		
		// Maximize browser window
		driver.manage().window().maximize();
		
		// Navigate to Coursera website
		driver.get("https://www.coursera.org/");
		
		// Find the search box by class name
		WebElement searchBox = driver.findElement(By.className("react-autosuggest__input"));
		
		// Print attributes of the search box
		printAttributes(searchBox);
		
		// Perform search in the search box
		searchBox.sendKeys("Google Data Analytics");
		searchBox.submit();
		
		// Navigate to a new URL
		driver.navigate().to("https://www.coursera.org/search?query=Data%20Science");
		
		// Find the search box by CSS selector
		searchBox = driver.findElement(By.cssSelector("input[placeholder='What do you want to learn?']"));
		
		// Print attributes of the search box
		printAttributes(searchBox);
		
		// Perform search in the search box
		searchBox.sendKeys("Data Science");
		searchBox.submit();
		
		// Navigate to a new URL
		driver.navigate().to("https://www.coursera.org/search?query=Data%20Analyst");
		
		// Find the search box by XPath
		searchBox = driver.findElement(By.xpath("//input[@aria-label='What do you want to learn?']"));
		
		// Print attributes of the search box
		printAttributes(searchBox);
		
		// Perform search in the search box
		searchBox.sendKeys("Data Analyst");
		searchBox.submit();
		
		// Find the "Log In" link by link text
		WebElement loginLink = driver.findElement(By.linkText("Log In"));
		
		// Print link text and partial link text
		System.out.println("Link text: " + loginLink.getText());
		System.out.println("Partial link text: " + loginLink.getAttribute("innerHTML"));
		
		// Close the browser
		driver.quit();
	}
	
	// Method to print attributes of an element
	private void printAttributes(WebElement element) {
	    String id = element.getAttribute("id");
	    String name = element.getAttribute("name");
	    String className = element.getAttribute("class");
	    String cssValue = element.getCssValue("css");

	    if (id != null && !id.isEmpty()) {
	        System.out.println("ID: " + id);
	    } else {
	        System.out.println("ID: N/A");
	    }

	    if (name != null && !name.isEmpty()) {
	        System.out.println("Name: " + name);
	    } else {
	        System.out.println("Name: N/A");
	    }

	    System.out.println("Class name: " + className);

	    if (cssValue != null && !cssValue.isEmpty()) {
	        System.out.println("CSS value: " + cssValue);
	    } else {
	        System.out.println("CSS value: N/A");
	    }
	}

}
