package uni.fmi;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import uni.fmi.models.Child;
import uni.fmi.models.Role;
import uni.fmi.models.Status;

public class TestSet {
	
	@Test
	public void testSetWithStrings() {
		final Set<String> testInstance = new HashSet<String>();
		String value1 = "value";
		testInstance.add(value1);
		String value2 = "value";
		testInstance.add(value2);
		String value3 = "value";
		testInstance.add(value3);
		assertEquals(1, testInstance.size());
	}
	
	@Test
	public void testSetWithRoles() {
		final Set<Role> testInstance = new HashSet<Role>();
		Role value1 = new Role();
		value1.setRoleCode("ADMIN");
		testInstance.add(value1);
		Role value2 = new Role();
		value2.setRoleCode("PARENT");
		testInstance.add(value2);
		Role value3 = new Role();
		value3.setRoleCode("CHILD");
		testInstance.add(value3);
		assertEquals(3, testInstance.size());
	}
	
	@Test
	public void testSetWithChild() {
		final Set<Child> testInstance = new HashSet<Child>();
		Child value1 = new Child();
		value1.setStatus("WORKING");
		testInstance.add(value1);
		Child value2 = new Child();
		value2.setStatus("WITHOUT WORK");
		testInstance.add(value2);
		assertEquals(2, testInstance.size());
	}
	
	@Test
	public void testSetWithStatus() {
		final Set<Status> testInstance = new HashSet<Status>();
		Status value1 = new Status();
		value1.setTwins("TRUE");
		testInstance.add(value1);
		Status value2 = new Status();
		value2.setDisabledPerson("FALSE");
		testInstance.add(value2);
		Status value3 = new Status();
		value3.setBrotherSister("BROSER");
		testInstance.add(value3);
		assertEquals(3, testInstance.size());
	}
}
