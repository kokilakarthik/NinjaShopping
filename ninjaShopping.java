import java.io.IOException;
import java.nio.channels.Selector;
import org.testng.annotations.Test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;


public class NinjaShopping {
	
@Test	
	public void  ninja () throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		
		driver.get(" http://tutorialsninja.com/demo/index.php");
		
		driver.manage().window().maximize();
		
		WebElement cur=driver.findElement(By.xpath("//button[@class='btn btn-link dropdown-toggle']"));
		
		cur.click();
		
		WebElement Euro=driver.findElement(By.xpath("//button[@class='currency-select btn btn-link btn-block' and @name='EUR']"));
		
		
		Euro.click();
		
		WebElement canon=driver.findElement(By.xpath("//a[text()='Canon EOS 5D']"));
		
		canon.click();

		WebElement bug=driver.findElement(By.id("input-option226"));
		
		//please select 
		
	    Select bugs=new Select(bug);
	    
	    bugs.getOptions().size();
		 
		 
	   if(bugs.getOptions().size() <2) {
		   
		   System.out.println("No slect Options Available");
		   
	   }
	      
	
	   WebElement homescreen =driver.findElement(By.xpath("//a[text()='Your Store']"));
	   homescreen.click();
	   
	   WebElement iphone=driver.findElement(By.xpath("//a[text()='iPhone']"));
	   iphone.click();
	   
	   WebElement quantity=driver.findElement(By.id("input-quantity"));
	   quantity.clear();
	   quantity.sendKeys("3");
	   
	   Thread.sleep(3000);
	   
	    
	   // WebElement addcart=driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block']"));
	   
	   WebElement addcart=driver.findElement(By.id("button-cart"));
	   addcart.click();
	   Thread.sleep(3000);

	   //print success message 
	   
	   WebElement cart=driver.findElement(By.xpath("//*[@id=\"cart\"]/button"));
	   cart.click();
	   
	   Thread.sleep(3000);
	   
	   WebElement viewcart=driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]"));

	   viewcart.click();
	   
	   WebElement changeqty=driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/input"));
	   
	   changeqty.clear();
	   
	   changeqty.sendKeys("1");
	   
	   Thread.sleep(3000);
	   
	   WebElement Ecotax=driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/table/tbody/tr[2]/td[2]"));
	   System.out.println(Ecotax.getText());
	   
	   
	   WebElement VAT=driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/table/tbody/tr[3]/td[2]"));
	   
	   System.out.println(VAT.getText());
	   
	   WebElement checkout=driver.findElement(By.xpath("//a[text()='checkout']"));
	   checkout.click();
	   
	   WebElement errormsg=driver.findElement(By.xpath("//*[@id=\"checkout-cart\"div[1]]"));
	   
	   System.out.println(errormsg.getText());
	   
	   
	  WebElement remove1=driver.findElement(By.xpath("(//button[@class='btn btn-danger']"));
	  //remove1.click();
	  driver.executeScript("arguments[0].click()",remove1);
	  
	  Thread.sleep(2000);
	  driver.executeScript("arguments[0].click()",remove1);
	  
	  
	  //WebElement remove=driver.findElement(By.xpath("(//span[@class='input-group-btn'])[2]//button[@type='button']"));
	 // remove.click();
	  WebElement homescreen1 =driver.findElement(By.xpath("//a[text()='Your Store']"));
	  homescreen.click();
	   
	   //'//*[contains(@onclick, "showNumber")]/*'


	   
	  // [@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/span/button[2]
	   
	   WebElement homescreenj =driver.findElement(By.xpath("//a[text()='Your Store']"));
	  homescreenj.click();
	   
	   //WebElement errorMsg = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));		
	   //String error = errorMsg.getText();	
	  // System.out.println("Error message during checkout :"+error);		
	  // Thread.sleep(2000);			
	  driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
	   
	 //  WebElement macbook=driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[1]/table/tbody/tr[1]/td[2]/a"));
	  // iphone.click();
	   //WebElement changeqty1=driver.findElement(By.xpath("//*[@id=\\\"content\\\"]/div[2]/div[1]/div/div[1]/a/img"));
      // changeqty1.click();
       
       
	   
	   
	  // WebElement homescreen11=driver.findElement(By.xpath("/html/body/header/div/div/div[1]/div/h1/a"));
		//homescreen11.click();
		   
	  // WebElement macbook1=driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[1]/a/img"));
		 //  macbook1.click();
		
	   
	   WebElement mac=driver.findElement(By.xpath("//div[@id=\"logo\"]/h1/a"));
	   mac.click();
	   WebElement machome=driver.findElement(By.xpath("//div[@id=\"logo\"]/h1/a"));
	   machome.click(); 
		Thread.sleep(2000);
		 WebElement machomecl=driver.findElement(By.xpath("//h4//a[contains(text(),\"MacBook\")]"));
		 machomecl.click();
	   
		 
		 
	} 
	   
}
