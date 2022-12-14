import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.URL;
import java.security.Key;

public class MAIN {
    public static void main(String[] args) throws InterruptedException {
        //תרגיל 6
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\moris\\OneDrive\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        Thread.sleep(2500);
        WebElement searchbox = driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.borderM.box.padT20 > div:nth-child(1) > button"));
        searchbox.click();
        Thread.sleep(2500);
        WebElement choseLOG = driver.findElement(By.cssSelector("#userSelect > option:nth-child(3)"));
        choseLOG.click();
        Thread.sleep(2500);
        WebElement LogHerryPotter = driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > form > button"));
        LogHerryPotter.click();
        Thread.sleep(2500);
        WebElement Deposit = driver.findElement(By.cssSelector(" body > div > div > div.ng-scope > div > div:nth-child(5) > button:nth-child(2) "));
        Deposit.click();
        Thread.sleep(2500);
        WebElement Depositbox = driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.container-fluid.mainBox.ng-scope > div > form > div > input "));
        Depositbox.sendKeys("2000");
        Depositbox.sendKeys(Keys.ENTER);
        Thread.sleep(2500);
        WebElement Withdrawl = driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div:nth-child(5) >  button:nth-child(3)"));
        Withdrawl.click();
        Thread.sleep(2500);
        WebElement Withdrawlbox = driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.container-fluid.mainBox.ng-scope > div > form > div > input "));
        Withdrawlbox.sendKeys("1500");
        Withdrawlbox.sendKeys(Keys.ENTER);
        Thread.sleep(2500);
        WebElement Transaction  = driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div:nth-child(5) >  button:nth-child(1)"));
        Transaction.click();

// תרגיל 5
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\moris\\OneDrive\\Desktop\\chromedriver.exe");
//       WebDriver driver = new ChromeDriver();
//       driver.navigate().to("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
//       Thread.sleep(2500);
//        WebElement Manger = driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.borderM.box.padT20 > div:nth-child(3) > button"));
//        Manger.click();
//        Thread.sleep(2500);
//        WebElement AddCustomer = driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.center > button:nth-child(1)"));
//       AddCustomer.click();
//        Thread.sleep(2500);
//        WebElement Firstname = driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.ng-scope > div > div > form > div:nth-child(1) > input"));
//       Firstname.click();
//       Thread.sleep(2500);
//        WebElement EnterFirstName = driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.ng-scope > div > div > form > div:nth-child(1) > input"));
//        EnterFirstName.sendKeys("moris");
//        EnterFirstName.sendKeys(Keys.ENTER);
//        Thread.sleep(2500);
//        WebElement EnterLastName = driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.ng-scope > div > div > form > div:nth-child(2) > input"));
//        EnterLastName.sendKeys("sheikman");
//        EnterLastName.sendKeys(Keys.ENTER);
//        Thread.sleep(2500);
//        WebElement EnterPostCode = driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.ng-scope > div > div > form > div:nth-child(3) > input"));
//        EnterPostCode.sendKeys("7562001");
//        EnterPostCode.sendKeys(Keys.ENTER);
//        Thread.sleep(2500);
//        WebElement Add = driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.ng-scope > div > div > form > div:nth-child(4) > input"));
//        Add.click();
//        Thread.sleep(2500);
//        Add.click();
//        Thread.sleep(2500);
//        WebElement Customer = driver.findElement(By.cssSelector("  body > div > div > div.ng-scope > div > div.center > button:nth-child(3) "));
//        Customer.click();
//        Thread.sleep(2500);

    }

}
