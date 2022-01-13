package Utils;

import io.cucumber.datatable.DataTable;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.sql.SQLOutput;

public class Utils {

    public static boolean isElementPresent(WebElement webElement) {
        try {
            boolean isPresent = webElement.isDisplayed();
            return isPresent;
        } catch (NoSuchElementException e) {
            return false;
        }

    }

    public static void customWait(int seconds) {

        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) SeleniumDriverClass.getDriver();

        //!This will scroll the page till the element is found
        js.executeScript("arguments[0].scrollIntoView();", element);

    }

    public static void SelectDropDown(WebElement element, String value){
        System.out.println("the element is: "+element.getText());

        try{
            Select dropList = new Select(element);
            dropList.selectByValue(value);
            System.out.println("Value available in the dropdown"+value);

        }catch(NoSuchElementException e){
            System.out.println("Value not available in the dropdown"+value);

        }

    }



//    public static void navigateToPage(String url) {
//        DataTable.ColumnView driver;
//        driver.get(url);
//    }


}
