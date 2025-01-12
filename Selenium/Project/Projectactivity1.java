import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Projectactivity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://training-support.net/");
		
		String title=driver.getTitle();
		System.out.println("Title of the page is: "+title);
		
		driver.findElement(By.linkText("About Us")).click();
		
		String newTitle=driver.getTitle();
		System.out.println("New Title is: "+newTitle);
		
		driver.quit();

	}




}
