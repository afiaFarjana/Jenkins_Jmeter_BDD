package home;

import base.CommonClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Search extends CommonClass {
    @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[6]/form/input")
    public static WebElement searchTextBox;
    @FindBy(xpath = "//*[@id=\"primary-navigation\"]/div[6]/form/button")
    public static WebElement searchSubmitButton;
    @FindBy(css = "#header-right-links > ul > li:nth-child(3) > a > span")
    public static WebElement searchIcon;

    public static  void waitToBeVisible(){
        searchIcon.click();
        wait.until(ExpectedConditions.visibilityOf(searchTextBox));
    }
    public void searchWithENTER(String searchKeys){
        waitToBeVisible();
        searchTextBox.sendKeys(searchKeys, Keys.ENTER);
    }
    public void searchUsingButton(String searchKeys){
         waitToBeVisible();
        searchTextBox.sendKeys(searchKeys);
        searchSubmitButton.click();
    }
}
