import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAutomation {

	public static void main(String[] args) throws InterruptedException {
		DemoAutomation obj = new DemoAutomation();
		obj.launchBrowser();

	}
	
	public  void launchBrowser() throws InterruptedException {
		// TODO Auto-generated method stub
		
//		System.out.println("Hello  World");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/railways/");
		
		System.out.println("Tittle of the page is:  "+driver.getTitle());
		
		System.out.println("URL of the page is:  "+driver.getCurrentUrl());
		
		windowMaximize(driver);
		
	
		//click on element using xpath using ID
		driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div/div[2]/div/div[1]/label/span")).click();
		
		Thread.sleep(1000);
		driver.findElement(
				By.xpath("//*[@id='root']/div/div[2]/div/div/div/div[2]/div/div[1]/div[1]/div/div/div/input"))
				.sendKeys("Delhi");
		// wait until element is not visible
		Thread.sleep(2000);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		//finding length of all element using sleector
		int length = driver.findElements(By.cssSelector("ul.react-autosuggest__suggestions-list > li")).size();
		System.out.println("Length of the list is: " + length);
		
		// define a loop to iterate through the list
		for (int i = 0; i < length; i++) {
					// find the element using index
					String element = driver.findElements(By.cssSelector(
							"ul.react-autosuggest__suggestions-list > li > div > div > p.searchedResult.font14.darkText > span"))
							.get(i)
							.getText();
					System.out.println("Element is: " + element);
					// check if the element is equal to the search term
					if (element.equals("Delhi")) {
						// click on the element
						driver.findElements(By.cssSelector(
								"ul.react-autosuggest__suggestions-list > li > div > div > p.searchedResult.font14.darkText > span"))
								.get(i).click();
						break;
					}
		}
		
		// Selecting Destination
				// click on element using xpath
				driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div/div[2]/div/div[2]/label/span")).click();
				// click on element using id

				Thread.sleep(1000);
				driver.findElement(
						By.xpath("//*[@id='root']/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/div/div/div/input"))
						.sendKeys("Lucknow");
				// wait until element is not visible
				Thread.sleep(2000);
				
		        //finding length of all element using sleector
				length = driver.findElements(By.cssSelector("ul.react-autosuggest__suggestions-list > li")).size();
				System.out.println("Length of the list is: " + length);

				// define a loop to iterate through the list
				for (int i = 0; i < length; i++) {
					// find the element using index
					String element = driver.findElements(By.cssSelector(
							"ul.react-autosuggest__suggestions-list > li > div > div > p.searchedResult.font14.darkText > span"))
							.get(i)
							.getText();
					System.out.println("Element is: " + element);
					// check if the element is equal to the search term
					if (element.equals("Lucknow")) {
						// click on the element
						driver.findElements(By.cssSelector(
								"ul.react-autosuggest__suggestions-list > li > div > div > p.searchedResult.font14.darkText > span"))
								.get(i).click();
						break;
					}
				}
				
				// Selecting Date of May 20th
			
				
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div/div[2]/div/div[3]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath(
						"//*[@id='root']/div/div[2]/div/div/div/div[2]/div/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[3]/div[6]"))
						.click();
			
				
				// Selecting Class
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div/div[2]/div/div[4]")).click();
				length = driver.findElements(By.cssSelector("ul.travelForPopup > li")).size();
				System.out.println("Length of the list is: " + length);
				for (int i = 0; i < length; i++) {
					String element = driver.findElements(By.cssSelector("ul.travelForPopup > li")).get(i).getText();
					System.out.println("Element is: " + element);
					if (element.equals("Third AC")) {
						driver.findElements(By.cssSelector("ul.travelForPopup > li")).get(i).click();
						break;
					}
				}
				
				
				// Clicking Search button
				Thread.sleep(2000);
				driver.findElement(By.xpath("// *[@id='root']/div/div[2]/div/div/div/div[2]/p/a")).click();
				
				System.out.println("All test cases passed");
				Thread.sleep(2000);
				driver.close();
				
		
		
	}

	private void windowMaximize(ChromeDriver driver) {
		// TODO Auto-generated method stub
		driver.manage().window().maximize();
		
	}

}
