package testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import informations.AgentInformations;

public class TypeTest {

	@Test
	public void test() {
		AgentInformations agent = new AgentInformations("vescan", "123", "aaa", 10, 1);
		
		assertEquals("vescan", agent.getName());
	}

}
