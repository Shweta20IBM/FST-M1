import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class projectactivity4 {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set up WebDriver (ensure GeckoDriver is in PATH)
        driver = new FirefoxDriver();
        // Navigate to the website
        driver.get("https://alchemy.hguy.co/jobs");
    }

    @Test
    public void verifySecondHeading() {
        // Locate the second heading (use appropriate locator for the page structure)
        WebElement secondHeading = driver.findElement(By.xpath("(//h2)[2]"));
        // Get the text of the second heading
        String headingText = secondHeading.getText();
        // Expected text
        String expectedHeading = "Quia quis non";
        // Verify the heading matches
        Assert.assertEquals(headingText, expectedHeading, "The second heading does not match the expected value.");
    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}