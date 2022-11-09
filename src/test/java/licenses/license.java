package licenses;

import ca.qaguru.oranghrmbatch22.library.TestBase;
import ca.qaguru.oranghrmbatch22.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;

public class license extends TestBase{
    @Test

    public void addLicense() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Admin", "admin123", true, null);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).click();

        driver.findElement(By.xpath("//a[@id='menu_admin_Qualifications']")).click();

        driver.findElement(By.xpath("//a[@id='menu_admin_viewLicenses']")).click();

        driver.findElement(By.xpath("//input[@id='btnAdd']")).click();

        // adding new license

        WebElement textBox;
        textBox = driver.findElement(By.name("license[name]"));
        textBox.sendKeys("Project Management Professional (PMP)");

        driver.findElement(By.name("btnSave")).click();

        //delete an existing license

        driver.findElement(By.xpath("//*[@id=\"recordsListTable\"]/tbody/tr[7]/td[1]/input")).click();
        driver.findElement(By.id("btnDel")).click();














    }

}
