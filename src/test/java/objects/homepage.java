package objects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homepage {

    WebDriver driver;

    public homepage(WebDriver driver) {
        this.driver = driver;
    }

    By insider_logo = By.cssSelector(".navbar-brand.d-flex.flex-row.align-items-center");
    By acceptAllPermission = By.id("wt-cli-accept-all-btn");
    By click_more = By.xpath("//span[text()='More']");


    public void insider_logo() {
        WebElement verify_insider_logo = driver.findElement(insider_logo);
        verify_insider_logo.isDisplayed();
    }

    public void acceptAllPermission() {
        WebElement acceptAllButton = driver.findElement(acceptAllPermission);
        acceptAllButton.click();
    }

    public void click_more()
    {
        WebElement moreMenu = driver.findElement(click_more);
        moreMenu.click();

    }



}
