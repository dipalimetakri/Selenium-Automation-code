package LiveProjects;

import java.io.IOException;

import org.testng.annotations.Test;

public class TestThreee extends Base{

	@Test
	public void Tree() throws IOException, InterruptedException {
		driver= initializedriver();
		driver.get("https://www.youtube.com");
		Thread.sleep(2000);
		driver.close();
	}
}
