package Aspire;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Xpath {
	    public static void main(String[] args) {	
	    	

	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.naukri.com");

	        // Find the email input field by its XPath
	        WebElement emailInput = driver.findElement(By.id("usernameField"));
	        emailInput.sendKeys("pranayjain1382@gmail.com");

	        // Find the password input field by its XPath	
	        WebElement passwordInput = driver.findElement(By.xpath("//INPUT[@id='passwordField']"));
	        // Enter password
	        passwordInput.sendKeys("Parthjain@123");
	        
	      
	        passwordInput.submit();
	        

	        
	        WebElement Register = driver.findElement(By.xpath("//a[text()='Register for Free']"));
	        Register.click();
     	
	    
	    }
	}

