package entrypoint;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

import utilities.Utilities;

public class FirstTest {
	
	public static Utilities utilsApp = new Utilities();
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		String username = "username";
		String password = "password";
		
		DesktopOptions options = new DesktopOptions();
		options.setApplicationPath("D:\\PROJECTS\\Path_To_Application\\Application.exe");
		
		WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"), options);
		Thread.sleep(2000);
		utilsApp.maximizeWindow(driver);	
	
		driver.findElementByClassName("ComboBox").click();
		System.out.println("Clicked on Site dropdown");
		
		driver.findElementByName("test1").click();
		System.out.println("Selected 'test1' from Site list");
		
		driver.findElementByName("LOG IN").click();
		System.out.println("Clicked on Log in button");
		
		driver.findElementByName("Enter A User Name").sendKeys(username);
		System.out.println("Entered user name");
		
		driver.findElementByName("Enter A Password").sendKeys(password);
		System.out.println("Entered Password");
		
		driver.findElementByName("LOG IN").click();
		System.out.println("Clicked on Log in button");
		
		driver.findElementByClassName("Button").click();
		driver.findElementByName("Dashboard").click();
		driver.findElement(By.xpath("//[@AutomationId='MaximizeButton']")).click();
		System.out.println("Maximised window");
		
		
		
		
		
	}

}
