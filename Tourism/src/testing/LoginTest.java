package testing;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import databaseConnection.DatabaseConnection;

public class LoginTest {
	String name;
	
	@Test
	public void test() {
		DatabaseConnection connection = new DatabaseConnection();
		
		String data = "select name, password from agents where name = '" + "Vescan" + "' and password = '" + "111" + "';";

		String login = connection.getUser(data, "Vescan", "111");
		
		assertEquals(login, "Vescan 111");
	}

}
