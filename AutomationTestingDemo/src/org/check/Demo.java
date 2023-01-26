package org.check;


	import java.time.Duration;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	public class Demo {
		
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\SInterview\\driver\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement fstName = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		fstName.sendKeys("suriya");
		
		WebElement lastName = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		lastName.sendKeys("rajinikanth");
		
		WebElement add = driver.findElement(By.xpath("//textarea[@rows='3']"));
		add.sendKeys("11,weavers colony, tiruchengode");
		
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("elankathirskr92@gmail.com");
		
		WebElement mobile = driver.findElement(By.xpath("//input[@type='tel']"));
		mobile.sendKeys("9688854265");
		
		WebElement gender = driver.findElement(By.name("radiooptions"));
		gender.click();
		
		WebElement hobby = driver.findElement(By.id("checkbox2"));
		hobby.click();
		
		WebElement lang1 = driver.findElement(By.id("msdd"));
		lang1.click();
		
		WebElement lang = driver.findElement(By.xpath("//a[text()='English']"));
		lang.click();
		
		WebElement skill = driver.findElement(By.id("Skills"));
		
		Select s=new Select(skill);
		s.selectByVisibleText("Java");
		
		WebElement countries = driver.findElement(By.id("countries"));
		Select s1=new Select(countries);
		s1.selectByVisibleText("Select Country");
		
		WebElement countries2 = driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']"));
		countries2.click();
		WebElement write = driver.findElement(By.className("select2-search__field"));
		write.sendKeys("india",Keys.ENTER);

		WebElement year = driver.findElement(By.id("yearbox"));
		Select s2=new Select(year);
		s2.selectByVisibleText("1992");
		
		WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select s3=new Select(month);
		s3.selectByValue("July");
		
		WebElement day = driver.findElement(By.id("daybox"));
		Select s4=new Select(day);
		s4.selectByValue("11");
		
		WebElement fstPass = driver.findElement(By.id("firstpassword"));
		fstPass.sendKeys("srk");
		
		WebElement secondPass = driver.findElement(By.id("secondpassword"));
		secondPass.sendKeys("srk");
		
		WebElement submit = driver.findElement(By.id("submitbtn"));
		submit.click();
		
	}	
	

}
