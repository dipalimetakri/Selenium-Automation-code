package Log4jAPIAndJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JDBCLogin {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Demo","root","Disha@123");
		Statement statement = connection.createStatement();
		ResultSet resultset = statement.executeQuery("select * from Logincredentials");
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
		
		
		while(resultset.next())
		{
			driver.findElement(By.id("input-email")).sendKeys(resultset.getString("username"));
			driver.findElement(By.id("input-password")).sendKeys(resultset.getString("password"));
		}
		
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		//	driver.close();


	}

}
