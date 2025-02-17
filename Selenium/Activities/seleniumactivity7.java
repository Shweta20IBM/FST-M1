
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class seleniumactivity7 {

	public static void main(String[] args) {
		//Create an instance for firefox driver
		WebDriver driver = new FirefoxDriver();
		//Open the web page
		driver.get("https://training-support.net/webelements/dynamic-controls");
		//Print the title of the page
		System.out.println("Title of the page: " + driver.getTitle());
		//Find the text field
		WebElement textbox = driver.findElement(By.id("textInput"));
		//Check if it is enabled
		System.out.println("Input field is enabled " + textbox.isEnabled());
		//Click the toggle button to enable it
		driver.findElement(By.id("textInputButton")).click();
		//Check if the text field is enabled
		System.out.println("Input field is enabled " + textbox.isEnabled());
		
		//Enter something
		textbox.sendKeys("Example text");
		System.out.println(textbox.getDomProperty("value"));
		
		//close the browser
		driver.quit();
	}
}