package ca.qaguru.oranghrmbatch22.tests;
import ca.qaguru.oranghrmbatch22.library.TestBase;
import ca.qaguru.oranghrmbatch22.pages.*;
import org.testng.annotations.Test;

import java.util.UUID;
import java.util.logging.Level;

public class LanguageTests extends TestBase{
 @Test
 public void addNewLanguage(){
     LoginPage loginPage = new LoginPage(driver);
     loginPage.login("admin", "admin123", true, null);
     HeaderPage headerPage = new HeaderPage(driver);
     headerPage.selectMenu(MenuOptions.LANGUAGES);
     LanguagePage languagePage = new LanguagePage(driver);

     languagePage.saveNewLanguage("Level1");
     String uuid = UUID.randomUUID().toString();
     languagePage.saveNewLanguage("level1"+uuid);


 }
    @Test 
    public void delNewLanguage(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("admin", "admin123", true, null);
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.selectMenu(MenuOptions.LANGUAGES);
        LanguagePage languagePage = new LanguagePage(driver);

        languagePage.DelLanguage("Level1");
        String uuid = UUID.randomUUID().toString();
        languagePage.DelLanguage("level1"+uuid);


    }


}
