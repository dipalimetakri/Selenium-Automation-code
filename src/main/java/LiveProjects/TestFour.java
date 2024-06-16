package LiveProjects;

import java.io.IOException;

import org.testng.annotations.Test;

public class TestFour extends Base {
	@Test
	public void Four() throws IOException, InterruptedException {
		driver= initializedriver();
		driver.get("https://www.youtube.com");
		Thread.sleep(2000);
		driver.close();
	}

}
