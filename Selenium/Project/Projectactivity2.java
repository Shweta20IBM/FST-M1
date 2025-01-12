import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Projectactivity2 {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set up WebDriver (ensure GeckoDriver is in PATH)
        driver = new FirefoxDriver();
        // Navigate to the website
        driver.get("https://alchemy.hguy.co/jobs");
    }

    @Test
    public void verifyHeading() {
        // Locate the heading element (assumes it's an <h1> tag)
        String heading = driver.findElement(By.tagName("h1")).getText();
        // Expected heading text
        String expectedHeading = "Welcome to Alchemy Jobs";
        // Verify the heading matches
        Assert.assertEquals(heading, expectedHeading, "Page heading does not match the expected value.");
    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}