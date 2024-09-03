package StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    public class Login {

        public static WebDriver driver;

        static {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        }

        @Given("url set to open website")
        public void url_set_to_open_website() {

            driver.get("https://www.saucedemo.com/");
            driver.manage().window().maximize();


        }

        @Then("login with username {string} and password {string}")
        public void login_with_username_and_password(String username, String password) throws InterruptedException {
            Thread.sleep(2000);
            driver.findElement(By.id("user-name")).sendKeys(username);
            driver.findElement(By.id("password")).sendKeys(password);
            Thread.sleep(2000);
            driver.findElement(By.id("login-button")).click();

            driver.findElement(By.className("inventory_item_name")).click();
            driver.findElement(By.id("add-to-cart")).click();
            driver.findElement(By.className("shopping_cart_link")).click();
            driver.findElement(By.id("checkout")).click();

        }

        @Given("give firstName {string} and Last Name {string} and zip {string}")
        public void give_first_name_and_last_name_and_zip(String firstname, String lastname, String pin_code) throws InterruptedException {
            Thread.sleep(2000);
            driver.findElement(By.id("first-name")).sendKeys(firstname);
            driver.findElement(By.id("last-name")).sendKeys(lastname);
            driver.findElement(By.id("postal-code")).sendKeys(pin_code);


        }

        @Then("complete the process")
        public void complete_the_process() throws InterruptedException {

            driver.findElement(By.id("continue")).click();
            driver.findElement(By.id("finish")).click();
            driver.findElement(By.id("back-to-products")).click();

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(300,0)", ""); //300 (x) 0 (y)
            Thread.sleep(2000);
            driver.findElement(By.id("react-burger-menu-btn")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("logout_sidebar_link")).click();
            driver.quit();

        }
    }


