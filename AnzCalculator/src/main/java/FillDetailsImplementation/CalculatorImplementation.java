package FillDetailsImplementation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculatorImplementation {
	public WebDriver driver;
	
	protected By YourIncome = By.xpath("//span[@id='q2q1i1']//parent::div[@class='input__wrapper']//input");
	protected By OtherIncome = By.xpath("//span[@id='q2q2i1']//parent::div//input");
	protected By LivingExpenses = By.id("expenses");
	protected By CurrentHomeLoan = By.id("homeloans");
	protected By OtherLoan = By.id("otherloans");
	protected By OtherCommitments = By.xpath("//span[@id='q3q4i1']//parent::div[@class='input__wrapper']//input");
	protected By CreditCard = By.id("credit");
	protected By BorrowCalculatorButton = By.id("btnBorrowCalculater");
	protected By StartOver = By.xpath("//div[@class='box--right']//button");
	protected By Borrowresult = By.id("borrowResultTextAmount");
	protected By UnableToBorrowMessage = By.xpath("//div[@class='box--left text--center']//span");
	
	
	public void OpenBrowser(String url) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    driver.get(url);
	}

}
