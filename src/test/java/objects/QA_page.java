package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QA_page {

    WebDriver driver;

    public QA_page(WebDriver driver) {
        this.driver = driver;
    }

    By see_all_job = By.xpath("//a[text()='See all QA jobs']");

    public void select_QA(){
        WebElement seeAllQAjobs = driver.findElement(see_all_job);
        seeAllQAjobs.click();
    }
}
