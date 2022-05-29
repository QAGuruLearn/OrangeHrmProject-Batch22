package org.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class OrangeHRMTest
{

    @Test
    public void FinalProject() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\QA Testing\\chromedriver.exe");
        System.out.println("Property Set..!!");
        //------------------ Opening OrangeHRM Website ---------------------------------
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        System.out.println("Opened Website..!!");
        //------------------ Entering Credentials -------------------------------

        driver.manage().window().maximize();
        Thread.sleep(1000);
        //------------------------------------------------------------------------------

        driver.findElement(By.id("txtUsername"));
        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("admin123");
        //------------------- entered values -----------------------------------
        System.out.println("Values entered..!!");
        Thread.sleep(1000);
        //------------------- Logged In ---------------------------------------------
        WebElement login = driver.findElement(By.id("btnLogin"));
        login.click();
        Thread.sleep(1000);
        System.out.println("Login Successful..!!");
        //--------------------- Clicking Admin --------------------------------------
        WebElement Admin = driver.findElement(By.id("menu_admin_viewAdminModule"));
        Admin.click();
        System.out.println("Admin Page..!!");
        Thread.sleep(1000);
        //------------------ Getting Qualifications --------------------------------
        WebElement quali = driver.findElement(By.xpath("//*[@id=\"menu_admin_Qualifications\"]"));
        quali.click();
        Thread.sleep(1000);
        System.out.println("Qualification ..!!");

        WebElement membrshp = driver.findElement(By.id("menu_admin_membership"));
        membrshp.click();
        Thread.sleep(1000);
        System.out.println("Membership Page..!!");

        //---------------------------- Adding Member ---------------------------------------
        WebElement add_membr = driver.findElement(By.id("btnAdd"));
        add_membr.click();
        Thread.sleep(1000);
        System.out.println("Add Member..!!");

        WebElement enterName = driver.findElement(By.id("membership_name"));
        enterName.sendKeys("Sreejith");
        Thread.sleep(2000);
        enterName.clear();
        Thread.sleep(1000);
        enterName.sendKeys("Testing Automation");

        WebElement saveButton = driver.findElement(By.id("btnSave"));
        saveButton.click();
        System.out.println("Member Added..!!");
        Thread.sleep(5000);

        // Please increment ohrmList_chkSelectRecord_20 by one always when running the TEST
        // Eg: For next Test Run it should be ohrmList_chkSelectRecord_21

        WebElement Chkbox = driver.findElement(By.id("ohrmList_chkSelectRecord_20"));

        Chkbox.click();
        System.out.println("Checkbox Selected..!!");
        Thread.sleep(2000);

        WebElement DelEntry = driver.findElement(By.xpath("//*[@id=\"btnDelete\"]"));
        DelEntry.click();
        System.out.println("Clicked Delete after Selection..!!");
        Thread.sleep(2000);


        WebElement CnfrmDel = driver.findElement(By.id("dialogDeleteBtn"));
        CnfrmDel.click();
        Thread.sleep(2000);

        System.out.println("Confirmed Deletion..!!");

        driver.close();
// ----------------------------- End Of Project ---------------------------------------------
    }
}
