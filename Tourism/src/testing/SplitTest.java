package testing;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SplitTest {

	@Test
	public void test() {
		String string = "this is a string";
		String[] words = string.split(" ");
		
		assertEquals("string", words[3]);
	}

}
