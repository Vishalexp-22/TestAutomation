package com.valuemomentum.retail.TestAutomation;



import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

 

public class PracticeLogin {
    
    //public static void main(String[] args) throws InterruptedException {
    @Test
    public void loginfile()
    {

 

        System.setProperty("webdriver.chrome.driver","C:\\Training\\Java\\TestAutomation\\lib\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://netbanking.kotak.com/knb2/");
        WebElement userName = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("userName")));
        userName.sendKeys("12");
        WebElement next = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@type='submit']")));
        next.click();
        //driver.findElement(By.id("userName")).sendKeys("32123432");
        //driver.findElement(By.xpath("//*[@type='submit']")).click();
        WebElement mobileNumber = new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.id(
                        "mobileNo"))); mobileNumber.sendKeys("12321321");

 

                        // driver.findElement(By.id("credentialInputField")).sendKeys("1312312312");
                        driver.findElement(By.xpath("/html/body/app-root/div/app-login/div/div[3]/div/div/div/app-verify-mobile-number/app-card-layout/div/form/div[5]/button")).click();

 

                        /*
                         * Thread.sleep(10000); // Initialize and wait till element(link) became
                         * clickable - timeout in 10 seconds WebElement firstResult = new
                         * WebDriverWait(driver, Duration.ofSeconds(10))
                         * .until(ExpectedConditions.elementToBeClickable(By.xpath("//a/h3")));
                         * System.out.println("Active element is "+driver.switchTo().activeElement().
                         * getTagName());
                         *
                         * WebElement btnNext = driver.findElement(By.xpath("//*[@type='submit']"));
                         * System.out.println(" Before entering value - Button status displayed "+
                         * btnNext.isDisplayed());
                         * System.out.println(" Before entering value - Button status enebled"+
                         * btnNext.isEnabled());
                         * System.out.println(" Before entering value - Button status selected"+
                         * btnNext.isSelected());
                         *
                         * driver.findElement(By.id("userName")).sendKeys("23456");
                         * System.out.println(" After entering input value - Button status displayed "+
                         * btnNext.isDisplayed());
                         * System.out.println(" After entering input value - Button status enebled"+
                         * btnNext.isEnabled());
                         * System.out.println(" After entering input value - Button status selected"+
                         * btnNext.isSelected());
                         */
                        driver.close(); driver.quit();
    }
}