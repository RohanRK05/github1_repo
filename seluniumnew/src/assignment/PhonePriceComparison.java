package assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PhonePriceComparison {
    public static void main(String[] args) {
        //Rohan
    	System.setProperty("webdriver.chrome.driver","./softy/chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //Rohan
        driver.get("https://www.flipkart.com/apple-iphone-14-pro-silver-1-tb/p/itm87b6f4daf8cd0?pid=MOBGHWFHSY5K7VGA&lid=LSTMOBGHWFHSY5K7VGAM3MJJG&marketplace=FLIPKART&q=iphone+14+pro+silver+1tb&store=tyy%2F4io&srno=s_1_1&otracker=AS_Query_HistoryAutoSuggest_6_0_na_na_na&otracker1=AS_Query_HistoryAutoSuggest_6_0_na_na_na&fm=organic&iid=41b75971-7015-4ffb-b1d8-cf84122c6e8b.MOBGHWFHSY5K7VGA.SEARCH&ppt=hp&ppn=homepage&ssid=2b3qjf90rk0000001691575094361&qH=92575d1a42c7b9be");
        WebElement flipkartPriceElement = driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']"));
        String flipkartPrice = flipkartPriceElement.getText();

        driver.get("https://www.amazon.in/Apple-iPhone-Pro-1TB-Silver/dp/B0BDJH1NCQ/ref=sr_1_7?crid=34NU814C44Z4W&keywords=iphone+14pro&qid=1691575408&sprefix=%2Caps%2C351&sr=8-7");
        WebElement amazonPriceElement = driver.findElement(By.xpath("//span[.='1,63,990']"));
        String amazonPrice = amazonPriceElement.getText();
        //for more information contact on 8975382566
        System.out.println("Flipkart Price: " + flipkartPrice);
        System.out.println("Amazon Price: ₹" + amazonPrice);
        String f = flipkartPrice.toString();
        String a = amazonPrice.toString();
        String f1 = f.replaceAll("[^0-9]","");
        String a1 = a.replaceAll("[^0-9]","");
        int f2=Integer.parseInt(f1);
        int a2=Integer.parseInt(a1);
        if(f2-a2>0) {
        	System.out.println("Price of this phone is high by ₹"+(f2-a2)+" in flipkart than amazon" );
        }
        else if(f2-a2<0) {
        	System.out.println("Price of this phone is high by ₹"+(a2-f2)+" in amazon than flipkart" );
        }
        else {
        	System.out.println("Price of this phone is same in both flipkart and amazon");
        }
    }
}
