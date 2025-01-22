import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class projectactivity7 {

    public static void main(String[] args) {
        // Set up WebDriver (ensure GeckoDriver is installed and in PATH)
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);

        try {
            // Step 1: Open the browser and navigate to the website
            driver.get("https://alchemy.hguy.co/jobs");

            // Step 2: Click the "Post a Job" menu item
            WebElement postJobMenu = driver.findElement(By.linkText("Post a Job"));
            postJobMenu.click();

            // Step 3: Fill in the job details
            // Locate and fill the Job Title field
            WebElement jobTitleField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("job_title")));
            String jobTitle = "Test Automation Engineer"; // Job Title
            jobTitleField.sendKeys(jobTitle);

            // Locate and fill the Location field
            WebElement locationField = driver.findElement(By.id("job_location"));
            locationField.sendKeys("Remote");

            // Locate and fill the Job Description field (TinyMCE editor)
            driver.switchTo().frame(driver.findElement(By.id("job_description_ifr"))); // Switch to the iframe
            WebElement jobDescriptionField = driver.findElement(By.id("tinymce"));
            jobDescriptionField.sendKeys("This is a test job description for a Test Automation Engineer.");
            driver.switchTo().defaultContent(); // Switch back to the main content

            // Locate and fill the Application Email field
            WebElement applicationEmailField = driver.findElement(By.id("application"));
            applicationEmailField.sendKeys("hr@example.com");

            // Locate and fill the Company Name field
            WebElement companyNameField = driver.findElement(By.id("company_name"));
            companyNameField.sendKeys("Example Tech Inc.");

            // Step 4: Click the "Preview" button
            WebElement previewButton = driver.findElement(By.name("submit_job"));
            previewButton.click();

            // Wait for the preview page to load
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("job_preview")));

            // Step 5: Click the "Submit Listing" button
            WebElement submitListingButton = driver.findElement(By.id("job_preview_submit_button"));
            submitListingButton.click();

            // Step 6: Verify that the job listing is posted
            // Navigate to the Jobs page
            WebElement jobsMenu = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Jobs")));
            jobsMenu.click();

            // Search for the job by title
            WebElement searchField = driver.findElement(By.id("search_keywords"));
            searchField.sendKeys(jobTitle);

            // Click the "Search Jobs" button
            WebElement searchButton = driver.findElement(By.cssSelector("input[value='Search Jobs']"));
            searchButton.click();

            // Wait for job listings to load and verify the title
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("job_listing")));
            WebElement firstJobListing = driver.findElement(By.xpath("//ul[@class='job_listings']/li[1]//h3"));
            String listedJobTitle = firstJobListing.getText();

            // Verify the job title matches
            if (listedJobTitle.equals(jobTitle)) {
                System.out.println("Job listing successfully posted: " + listedJobTitle);
            } else {
                System.out.println("Job listing not found or title does not match.");
            }
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
