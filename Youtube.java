package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Youtube {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		//search
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='search']")).click();
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("mallu girl song tamil");
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		driver.findElement(By.xpath("(//yt-formatted-string[text()='Mallu Girl - Lyric Video | Varalaru Mukkiyam | Jiiva | Kashmira Pardeshi | Shaan Rahman | Karky'])[2]")).click();
		//driver.findElement(By.xpath("//yt-formatted-string[text()='No thanks']")).click();
		//driver.findElement(By.xpath("//button[@class='ytp-fullscreen-button ytp-button']")).click();
		String title = driver.getTitle();
		System.out.println(title);
	}

}
