package ca.qaguru.oranghrmbatch22.tests;

import ca.qaguru.oranghrmbatch22.library.TestBase;

import ca.qaguru.oranghrmbatch22.pages.LoginPage;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;


public class MembershipTest extends TestBase {
    @Test(priority = 1)
    public void addNewMembership(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123", true, null);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).click();

        driver.findElement(By.xpath("//a[@id='menu_admin_Qualifications']")).click();

        driver.findElement(By.xpath("//a[@id='menu_admin_membership']")).click();

        driver.findElement(By.xpath("//input[@id='btnAdd']")).click();

        // adding new license

        WebElement textBox;
        textBox = driver.findElement(By.name("membership[name]"));
        textBox.sendKeys("Automation Testing Membership");

        driver.findElement(By.name("btnSave")).click();
    }

    @Test(priority = 2)
    public void deleteMembership(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123", true, null);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).click();

        driver.findElement(By.xpath("//a[@id='menu_admin_Qualifications']")).click();

        driver.findElement(By.xpath("//a[@id='menu_admin_membership']")).click();

        driver.findElement(By.id("ohrmList_chkSelectRecord_14")).click();
        driver.findElement(By.id("btnDelete")).click();
        driver.findElement(By.id("dialogDeleteBtn")).click();
    }

    @Test(priority = 3)
    public void checksMembership()

    {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123", true, null);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).click();

        driver.findElement(By.xpath("//a[@id='menu_admin_Qualifications']")).click();

        driver.findElement(By.xpath("//a[@id='menu_admin_membership']")).click();

        driver.findElement(By.xpath("//input[@id='btnAdd']")).click();

        WebElement textBox = driver.findElement(By.name("membership[name]"));
        textBox.sendKeys("Automation Testing Membership");
        driver.findElement(By.name("btnSave")).click();
        WebElement getTextCheck = driver.findElement(By.xpath("//span[@class='validation-error']"));
        String text = getTextCheck.getText();
        System.out.println(text);
        if (text.equals("Already exists"))
            System.out.println("Error.! Membership already entered.!");
        else
            Assert.fail("Please proceed to Enter the Membership name.!");
    }
}