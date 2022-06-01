package ca.qaguru.oranghrmbatch22.pages;

import ca.qaguru.oranghrmbatch22.library.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LanguagePage extends PageBase{
    private final String idLanAddBtn = "btnAdd";
    private final String idLanDelBtn = "btnDel";
    private final String idLanTxtName="language_name";
    private final String idLanChkBox ="//*[@id=\"recordsListTable\"]/tbody/tr[4]/td[1]/input";
    private final String idLanSaveBtn="btnSave";
    private final String getIdLanCancelBtn= "btnCancel";


    public LanguagePage(WebDriver driver) {
        super(driver);
    }

    public void saveNewLanguage(String level1) {
        click(By.id(idLanAddBtn));
        setText(By.id(idLanTxtName), level1);
        click(By.id(idLanSaveBtn));
    }

    public void DelLanguage(String level1){
        click(By.xpath(idLanChkBox));
        click(By.id(idLanDelBtn));


    }
}


