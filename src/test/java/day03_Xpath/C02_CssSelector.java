package day03_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_CssSelector {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com/");

        //Sayfayi "refresh" yapin
        driver.navigate().refresh();

        //Sayfa basliginin "Spend less" ifadesi icerdigini test edin
        String actualTitle = driver.getTitle();
        String arananKelime = "Spend less";
        if (actualTitle.contains(arananKelime)){
            System.out.println("Title Testi PASSED");
        }else System.out.println("Title Testi FAILED");

        //Gift Cards sekmesine basin
        driver.findElement(By.cssSelector("a[href='/gift-cards/b/?ie=UTF8&node=2238192011&ref_=nav_cs_gc']")).click();

        //Birthday butonuna basin
        /*
        <img src="https://images-na.ssl-images-amazon.com/images/G/01/gift-certificates/consumer/2021/GCLP/Support/2x/Occ_Birthday_346x130.png"
        alt="Birthday">
         */
        driver.findElement(By.cssSelector("img[alt='Birthday']")).click();
        //Best Seller bolumunden ilk urunu tiklayin
        List<WebElement> myList = driver.findElements(By.className("a-carousel"));
        myList.get(0).click();
        // 9- Gift card details'den 25 $'i secin
        driver.findElement(By.cssSelector("*[id='gc-mini-picker-amount-1']")).click();
        //Urun ucretinin 25$ oldugunu test edin
        //Sayfayi kapatin

    }
}

