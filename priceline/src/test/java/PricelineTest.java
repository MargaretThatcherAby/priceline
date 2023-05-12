/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author margaret
 */
public class PricelineTest {
    private WebDriver driver;
    public PricelineTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
    driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
     @Test
  public void testCase1() throws Exception {
    driver.get("https://www.priceline.com/");
     driver.manage().window().maximize();
    driver.findElement(By.xpath("//button[@id='tab-hotels']/div/div")).click();
    driver.findElement(By.xpath("//button[@id='tab-flights']/div/div/div[2]")).click();
    driver.findElement(By.xpath("//button[@id='tab-vacations']/div/div/div[2]")).click();
    driver.findElement(By.xpath("//button[@id='tab-cars']/div/div/div[2]")).click();
    driver.close();
  }

}
