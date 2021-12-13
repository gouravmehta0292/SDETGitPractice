package Practice;

import org.testng.annotations.Test;

public class ReadDataFromCmdTest {
@Test
public void readTest() {
	
	System.out.println("reading data from cmd line");
	
	String url = System.getProperty("url");
	String browser = System.getProperty("browser");
	String username = System.getProperty("username");
	String password = System.getProperty("password");
	
	System.out.println(url);
	System.out.println(browser);
	System.out.println(username);
	System.out.println(password);
	
	
}
	
	
}
