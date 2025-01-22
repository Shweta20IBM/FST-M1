import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class projectactivity6 {

    public static void main(String[] args) {
        // Set up WebDriver (ensure GeckoDriver is installed and in PATH)
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);

        try {
            // Step 1: Open the Alchemy Jobs site and navigate to the Jobs page
            driver.get("https://alchemy.hguy.co/jobs");

            // Locate and click on the "Jobs" menu
            WebElement jobsMenu = driver.findElement(By.linkText("Jobs"));
            jobsMenu.click();

            // Step 2: Search for a particular job
            WebElement searchField = driver.findElement(By.id("search_keywords"));
            searchField.sendKeys("Developer"); // Replace "Developer" with your desired job keyword

            // Click the "Search Jobs" button
            WebElement searchButton = driver.findElement(By.cssSelector("input[value='Search Jobs']"));
            searchButton.click();

            // Wait for job listings to load
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("job_listing")));

            // Step 3: Click and open the first job listing
            WebElement firstJobListing = driver.findElement(By.xpath("//ul[@class='job_listings']/li[1]"));
            firstJobListing.click();

            // Step 4: Click the "Apply for job" button
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("application_button")));
            WebElement applyButton = driver.findElement(By.className("application_button"));
            applyButton.click();

            // Step 5: Print the email address from the application details
            WebElement applicationDetails = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("application_details")));
            System.out.println("Application Email: " + applicationDetails.getText());
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}