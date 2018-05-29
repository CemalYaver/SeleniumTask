import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {
	public static void main(String[] args) {
    
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\cemal\\Desktop\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		WebElement mainPageControl = driver.findElement(By.xpath("//link[@rel='canonical' and @href='https://www.amazon.com/']"));
		
		 if(mainPageControl != null) {
		    	System.out.println("Burası Anasayfa");
		    }
		    else {
		    	System.out.println("Burası Anasayfa Değil!");
		    }
			
		WebElement SignIn = driver.findElement(By.linkText("Sign in"));
		SignIn.click();
			 
		WebElement userIdName = driver.findElement(By.id("ap_email"));
		userIdName.sendKeys("cemalyaver@gmail.com");
		
		WebElement SignInClassContinue = driver.findElement(By.className("a-section"));
		WebElement SignInContinueName = SignInClassContinue.findElement(By.id("continue-announce"));
		SignInContinueName.submit();	
		
		WebElement PasswordIdName = driver.findElement(By.id("ap_password"));
		PasswordIdName.sendKeys("123467");
		
		WebElement SignInClassName = driver.findElement(By.className("a-section"));
		WebElement SignInIdName = SignInClassName.findElement(By.id("a-autoid-0"));
		SignInIdName.submit();
		
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("samsung");
		searchBox.submit();  
		
		boolean searchVerification = driver.getTitle().contains("samsung");

	    if(searchVerification) {
	        System.out.println("samsung için arama yapıldı");
	    }
	    else {
	        System.out.println("samsung için arama yapılmadı");
	    }
	    	
	    String pageControl = driver.findElement(By.xpath("//meta[@name='keywords']")).getText();
	    
	    if(pageControl.contains("Page 2")) {
	    	System.out.println("Burası 2.sayfa");
	    }
	    else {
	    	System.out.println("Burası 2.sayfa değil!");
	    }
	    
		WebElement productIdName = driver.findElement(By.id("result_18"));
		productIdName.click();
	   
		WebElement addToListIdName = driver.findElement(By.id("add-to-wishlist-button-submit"));
		addToListIdName.submit();
		
		WebElement wishList = driver.findElement(By.xpath("//a[contains(@href='/gp/registry/wishlist/25CJDAB4SJD1J/ref=nav_wishlist_lists_2')]"));
		wishList.click();
		
		WebElement deleteButtonClassName = driver.findElement(By.className("a-button a-button-small"));
		WebElement deleteButtonName = deleteButtonClassName.findElement(By.name("submit.deleteItem"));
		deleteButtonName.submit();
		
	}
}
