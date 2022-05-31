package ca.qaguru.oranghrmbatch22.tests;

import ca.qaguru.oranghrmbatch22.library.TestBase;
import ca.qaguru.oranghrmbatch22.pages.EducationPage;
import ca.qaguru.oranghrmbatch22.pages.HeaderPage;
import ca.qaguru.oranghrmbatch22.pages.LoginPage;
import ca.qaguru.oranghrmbatch22.pages.MenuOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.UUID;

public class PAY_GRADES extends TestBase {
    @Test(priority = 1)
    public void addNewPaygrade() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123", true, null);
        WebElement admin = driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']/b"));
        admin.click();
        WebElement drp_down = driver.findElement(By.id("menu_admin_Job"));
        drp_down.click();
        WebElement paygrade = driver.findElement(By.id("menu_admin_viewPayGrades"));
        paygrade.click();
        WebElement addPay = driver.findElement(By.xpath("//*[@id='btnAdd']"));
        addPay.click();
        WebElement name = driver.findElement(By.name("payGrade[name]"));
        name.click();
        name.sendKeys("Grade 80");
        WebElement save = driver.findElement(By.id("btnSave"));
        save.click();
        WebElement newpay = driver.findElement(By.id("btnAddCurrency"));
        newpay.click();

        WebElement currency = driver.findElement(By.xpath("//label[@for='payGradeCurrency_currencyName']"));
        currency.click();
        WebElement choice = driver.findElement(By.xpath("//input[@id='payGradeCurrency_currencyName']"));
        choice.click();
        choice.sendKeys("cad");
        driver.findElement(By.xpath("//input[@id='payGradeCurrency_currencyName']")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.xpath("//input[@id='payGradeCurrency_currencyName']")).sendKeys(Keys.ENTER);

        WebElement miniSal = driver.findElement(By.id("payGradeCurrency_minSalary"));
        miniSal.sendKeys("40000");
        miniSal.click();
        WebElement maxSal = driver.findElement(By.id("payGradeCurrency_maxSalary"));
        maxSal.sendKeys("55000");
        maxSal.click();
        WebElement save1 = driver.findElement(By.xpath("//*[@id='btnSaveCurrency']"));
        save1.click();

    }
    @Test(priority = 2)
    public void deleteNewPaygrade() throws InterruptedException{
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123", true, null);
        WebElement admin = driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']/b"));
        admin.click();
        WebElement drp_down = driver.findElement(By.id("menu_admin_Job"));
        drp_down.click();
        WebElement paygrade = driver.findElement(By.id("menu_admin_viewPayGrades"));
        paygrade.click();
        //locating checkbox for the paygrade to be deleted
        WebElement getCheckedValue = driver.findElement(By.id("ohrmList_chkSelectRecord_1"));
        getCheckedValue.click();
        Thread.sleep(1000);
        //Deleting paygrade
        WebElement delete = driver.findElement(By.xpath("//input[@id='btnDelete']"));
        delete.click();
    }




                @Test(priority = 0)
          public void multiEnty()
        {
            LoginPage loginPage = new LoginPage(driver);
            loginPage.login("Admin", "admin123", true, null);
                        WebElement admin = driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']/b"));
                        admin.click();
                        WebElement drp_down = driver.findElement(By.id("menu_admin_Job"));
                        drp_down.click();
                        WebElement paygrade = driver.findElement(By.id("menu_admin_viewPayGrades"));
                        paygrade.click();
                        WebElement addPay = driver.findElement(By.xpath("//*[@id='btnAdd']"));
                        addPay.click();
                        WebElement name = driver.findElement(By.name("payGrade[name]"));
                        name.click();
                name.sendKeys("Grade 9");
                WebElement save = driver.findElement(By.id("btnSave"));
                save.click();
                WebElement getTextCheck = driver.findElement(By.xpath("//span[@class='validation-error']"));
                String text = getTextCheck.getText();
                System.out.println(text);
                if(text.equals("Already exists"))
                {
                        System.out.println("paygrade already entered");
                }
                else
                {

                        Assert.fail("Enter new paygrade");
                }


        }}

