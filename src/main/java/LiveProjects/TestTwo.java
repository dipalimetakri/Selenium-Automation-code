package LiveProjects;

import java.io.IOException;

import org.testng.annotations.Test;

public class TestTwo extends Base {
	@Test
	public void two() throws IOException, InterruptedException {
		driver= initializedriver();
		driver.get("https://www.youtube.com");
		Thread.sleep(2000);
		driver.close();
	}

}
