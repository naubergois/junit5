import static org.junit.jupiter.api.Assertions.*;

public class Test {

	@org.junit.jupiter.api.Test
	void exceptionTesting() {
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
			throw new IllegalArgumentException("a message");
		});
		assertEquals("a message", exception.getMessage());
	}

	@org.junit.jupiter.api.Test
	public void test() {
		fail("Not yet implemented");
	}

}
