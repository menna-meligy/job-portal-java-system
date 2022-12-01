package job_portal_system;

import java.util.ArrayList;
import static org.junit.Assert.assertEquals;


public class PositionTest {

	@Test
	public void test2() {
		Position test1= new Position("user1", "123", "1111");
		Position test2= new Position("user2", "222", "2222");
		Position test3= new Position("user3", "333", "3333");
		ArrayList <Position> position = new ArrayList<>();
		position.add(test1);
		position.add(test2);
		position.add(test3);
		boolean output = test2.Is_exists(position);
		assertEquals(true, output);
	}
	@Test
	public void test3() {
		Position test1= new Position("user1", "123", "1111");
		Position test2= new Position("user2", "222", "2222");
		Position test3= new Position("user3", "333", "3333");
		ArrayList <Position> position = new ArrayList<>();
		position.add(test1);
		position.add(test3);
		boolean output = test4.Is_exists(position);
		assertEquals(false, output);
	}
}
