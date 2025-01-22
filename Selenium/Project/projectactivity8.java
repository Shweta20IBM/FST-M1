import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BackendLogin {

    public static void main(String[] args) {
        // Set up WebDriver (ensure GeckoDriver is installed and in PATH)
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);

        try {
            // Step 1: Open the browser and navigate to the backend login page
            driver.get("https://alchemy.hguy.co/jobs/wp-admin");

            // Step 2: Enter the username
            WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_login")));
            usernameField.sendKeys("root"); // Replace with your username if different

            // Step 3: Enter the password
            WebElement passwordField = driver.findElement(By.id("user_pass"));
            passwordField.sendKeys("pa$$w0rd"); // Replace with your password if different

            // Step 4: Click the login button
            WebElement loginButton = driver.findElement(By.id("wp-submit"));
            loginButton.click();

            // Step 5: Verify successful login
            WebElement dashboardHeader = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("wpadminbar")));
            if (dashboardHeader.isDisplayed()) {
                System.out.println("Login successful. Dashboard is displayed.");
            } else {
                System.out.println("Login failed.");
            }
        } finally {
            // Step 6: Close the browser
            driver.quit();
        }
    }
}
