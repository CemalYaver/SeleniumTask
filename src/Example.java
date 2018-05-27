import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example {
	public static void main(String[] args) {
	    System.setProperty("webdriver.firefox.marionette","C:\\Users\\cemal\\workspace\\geckodriver\\geckodriver.exe");
		  
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		
		String mainPageControl = driver.findElement(By.xpath("//link[@rel='canonical']")).getText();
		
		 if(mainPageControl.contains("https://www.amazon.com/")) {
		    	System.out.println("Burası Anasayfa");
		    }
		    else {
		    	System.out.println("Burası Anasayfa Değil!");
		    }
	
		WebElement link = driver.findElement(By.className("nav-action-inner"));
		link.click();
		
		WebElement userIdName = driver.findElement(By.id("ap_email"));
		userIdName.sendKeys("cemalyaver@gmail.com");
		
		WebElement continueClassName = driver.findElement(By.className("a-button a-button-span12 a-button-primary"));
		WebElement continueIdName = continueClassName.findElement(By.id("continue"));
		continueIdName.submit();
		
		WebElement PasswordIdName = driver.findElement(By.id("ap_password"));
		PasswordIdName.sendKeys("1234567");
		
		WebElement SignInClassName = driver.findElement(By.className("a-button a-button-span12 a-button-primary"));
		WebElement SignInIdName = SignInClassName.findElement(By.id("signInSubmit"));
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
