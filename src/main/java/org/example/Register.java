package org.example;
import org.openqa.selenium.By;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Register {

    private WebDriver driver;
    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\DatlaLakshmiBhavani\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
         driver = new ChromeDriver();
        // code that will be invoked when this test is instantiated
    }

    @Test
    public void register() {
        driver.get("https://practice.expandtesting.com/register");
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Bhanutest9");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Bhanutest9");
        driver.findElement(By.xpath("//input[@id='confirmPassword']")).sendKeys("Bhanutest9");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        String ExpectedTitle=driver.findElement(By.xpath("//div[@id='flash']")).getText();
        String ActualTitle="Successfully registered, you can log in now.";
        assert(ExpectedTitle.equals(ActualTitle));

    }

    @Test
    public void login() {
        driver.get("https://practice.expandtesting.com/login");
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Bhanutest9");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Bhanutest9");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }

    @Test(groups = {"fast"})
    public void aFastTest() {
        System.out.println("Fast test");
    }

    @Test(groups = {"slow"})
    public void aSlowTest() {
        System.out.println("Slow test");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
