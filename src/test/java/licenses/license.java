package licenses;

import ca.qaguru.oranghrmbatch22.library.TestBase;
import ca.qaguru.oranghrmbatch22.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class license extends TestBase{
    @Test

    public void addLicense() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("admin", "admin123", true, null);
        driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@id='menu_admin_Qualifications']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@id='menu_admin_viewLicenses']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='btnAdd']")).click();

        WebElement textBox;
        textBox = driver.findElement(By.name("license[name]"));
        textBox.sendKeys("Project Management Professional (PMP)");

        driver.findElement(By.name("btnSave")).click();
        driver.close();













    }

}
