package job_portal_system;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class CompanyTest {

	@Test
	public void test2() {
		Company test1= new Company("user1", "123", "1111", "1111");
		Company test2= new Company("user2", "222", "2222", "2222");
		Company test3= new Company("user3", "333", "3333", "3333");
		ArrayList <Company> company = new ArrayList<>();
		company.add(test1);
		company.add(test2);
		company.add(test3);
		boolean output = test2.Is_exists(company);
		assertEquals(true, output);
	}
	@Test
	public void test3() {
		Company test1= new Company("user1", "123", "1111", "1111");
		Company test2= new Company("user2", "222", "2222", "2222");
		Company test3= new Company("user3", "333", "3333", "3333");
		ArrayList <Company> company = new ArrayList<>();
		company.add(test1);
		company.add(test3);
		boolean output = test4.Is_exists(company);
		assertEquals(false, output);
	}
	
	@Test
	public void test4() {
		Company test8= new Company("user1", "123", "1111", "1111");
		Position p = new Position();
		test9.RemovePosition(p);
		boolean output = test9.getPositions.contains(9);
		assertEquals(false, output);
	}
	
	@Test
	public void test5() {
		Company test9= new Company("user1", "123", "1111", "1111");
		Position p = new Position();
		test9.AddPosition(p);
		boolean output = test9.getPositions.contains(9);
		assertEquals(true, output);
	}
	
	@Test
	public void test6() {
		Company test2= new Company("user2", " ", "2222", "2222");
		boolean output = test2.Can_Login();
		assertEquals(false, output);
	}
	@Test
	public void test7() {
		User test1= new User("user1", "user1.gmail.com", "1111", "1111");
		boolean output = test1.Can_Login();
		assertEquals(true, output);
	}
}
