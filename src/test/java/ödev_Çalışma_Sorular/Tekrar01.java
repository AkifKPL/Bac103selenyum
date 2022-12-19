package ödev_Çalışma_Sorular;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tekrar01 {
    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.amazon.com");
//        System.out.println("Sayfa Başlığı "+driver.getTitle());
//        System.out.println("Sayfanın adresi "+driver.getCurrentUrl());
////        driver.get("https://www.google.com");
////        System.out.println("Sayfa Başlığı "+driver.getTitle());
////        System.out.println("Sayfanın adresi "+driver.getCurrentUrl());
////        driver.get("https://www.techproeducation.com");
////        System.out.println("Sayfa Başlığı "+driver.getTitle());
////        System.out.println("Sayfanın adresi "+driver.getCurrentUrl());
////        System.out.println(driver.getPageSource());
//
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver2 = new ChromeDriver();
        driver2.get("https://www.amazon.com");
        System.out.println("Sayfa Başlığı "+driver2.getTitle());
        String actual = driver2.getTitle();
        if (actual.contains("Amazon")){
            System.out.println("Test Passed");
        }else System.out.println("Test Failed");
        System.out.println("Sayfanın url" + driver2.getCurrentUrl());
        String actual2 = driver2.getCurrentUrl();
        if (actual2.contains("amazon")){
            System.out.println("Test Passed");
        }else System.out.println("Test Failed");
        System.out.println(driver2.getWindowHandle());
        String actual3 = driver2.getWindowHandle();
        String sayfaKodları=driver2.getPageSource();
        if (sayfaKodları.contains("Gateway")){
            System.out.println("Test Passed");
        }else System.out.println("Test Failed");
        driver2.close();


    }
}
