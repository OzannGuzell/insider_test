package test_scenarios;

import objects.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class verify_QA_jobs {
    private WebDriver driver;
    private WebDriverWait wait;


    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://useinsider.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15).getSeconds(), TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
        driver.quit();
    }


    @Test
    public void verify_jobs() throws InterruptedException {
        homepage home_page = new homepage(driver);
        more_page more_page = new more_page(driver);
        careers_page careers = new careers_page(driver);
        QA_page QA = new QA_page(driver);
        open_position_page position = new open_position_page(driver);
        verify_lever_page verify_lever = new verify_lever_page(driver);

        home_page.insider_logo();
        home_page.acceptAllPermission();
        home_page.click_more();
        more_page.click_careers();
        careers.verify_careers_page();
        careers.click_QA();
        QA.select_QA();
        position.open_position();
        verify_lever.verify_page();
    }


}
