package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class verify_lever_page {

    WebDriver driver;

    public verify_lever_page(WebDriver driver) {
        this.driver = driver;
    }

    By verify_apply_button = By.xpath("(//a[contains(text(),'Apply for this job')])[1]");

    public void verify_page(){
        Set<String> allWindows = driver.getWindowHandles();
        String parentWindowHandle = driver.getWindowHandle();

        String newWindowHandle = null;
        for(String windowHandle : allWindows){
            if(!windowHandle.equals(parentWindowHandle)){
                newWindowHandle = windowHandle;
            }
        }
        driver.switchTo().window(newWindowHandle);
        WebElement lever = driver.findElement(verify_apply_button);
        lever.isDisplayed();
    }
}