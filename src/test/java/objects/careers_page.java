package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class careers_page {
    WebDriver driver;

    public careers_page(WebDriver driver) {
        this.driver = driver;
    }

    By our_locations = By.cssSelector(".category-title-media.ml-0");
    By life_at_insider = By.xpath("//h2[text()='Life at Insider']");
    By all_them_button = By.xpath("//a[text()='See all teams']");
    By select_QA = By.xpath("//h3[text()='Quality Assurance']");

    public void verify_careers_page(){
        WebElement locationsBlock = driver.findElement(our_locations);
        WebElement lifeBlock = driver.findElement(life_at_insider);
        assert locationsBlock.isDisplayed() && lifeBlock.isDisplayed();
    }

    public void click_QA(){
        WebElement seeAllTeamsButton = driver.findElement(all_them_button);
        seeAllTeamsButton.click();
        WebElement qualityAssuranceLink = driver.findElement(select_QA);
        qualityAssuranceLink.click();
    }

}
