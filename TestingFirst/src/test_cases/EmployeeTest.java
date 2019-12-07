package test_cases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.app.core.Employee;

public class EmployeeTest {

	Employee e;
	
	@Before
	public void setUp() throws Exception {
		e = new Employee();
	}

	@After
	public void tearDown() throws Exception {
		e=null;
	}
	
	@Test
	public void testForEmployeeIDGreaterThan7()
	{
		e.setId("1234567899");
		assertEquals(null, e.getId());
	}
	
	@Test
	public void testForEmployeeIDOnlyDigits()
	{	
		e.setId("1234567");
		assertEquals(null, e.getId());
		
		e.setId("SD12345");
		assertEquals(null, e.getId());
		
		e.setId("SD123r5");
		assertEquals(null, e.getId());
		
		e.setId("ID12345");
		assertNotEquals(null, e.getId());
	}
	
	@Test
	public void testForEmployeeIDWrongPrefix()
	{	
		e.setId("SD12345");
		assertEquals(null, e.getId());
	}
	
	@Test
	public void testForEmployeeIDWrongID()
	{	
		e.setId("SD123r5");
		assertEquals(null, e.getId());
		
		e.setId("ID12345");
		assertNotEquals(null, e.getId());
	}
	
	@Test
	public void testForEmployeeID()
	{	
		e.setId("ID12345");
		assertNotEquals(null, e.getId());
	}
	
	@Test
	public void testForCalcSalary()
	{
		assertEquals(40000, e.calcSalary(20000),1);
	}
	
	@Test
	public void testForNetSalaryNegative()
	{
		e.setBasic_salary(-100000);
		assertEquals(0, e.getBasic_salary(),3);
	}
	
	@Test
	public void testForNullName()
	{
		e.setName("");
		assertEquals("Invalid", e.getName());
	}
	
	@Test
	public void testForDeptNameNull()
	{
		e.setDepartment("");
		assertEquals("Invalid", e.getDepartment());
	}

}
