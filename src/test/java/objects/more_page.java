package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class more_page {
    WebDriver driver;

    public more_page(WebDriver driver) {
        this.driver = driver;
    }

    By click_careers = By.xpath("//h5[text()='Careers']");


    public void click_careers() {
        WebElement careersLink = driver.findElement(click_careers);
        careersLink.click();
    }
}
