package utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserDriver {
    public static WebDriver driver;

    public static void initializeDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();

       //     if (System.getenv("JENKINS_HOME") != null) {
                // Running inside Jenkins
       //         options.addArguments("--headless=new");
       //         options.addArguments("--no-sandbox");
       //         options.addArguments("--disable-dev-shm-usage");
       //         options.addArguments("--disable-gpu");
       //     }

            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
        }
    }
}




