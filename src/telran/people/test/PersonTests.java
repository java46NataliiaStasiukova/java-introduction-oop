package telran.people.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.people.Employee;
import telran.people.Person;
import telran.people.SalesPerson;
import telran.people.WageEmployee;

class PersonTests {

	@Test
	void personTest() {
		long id = 123456789;
		int birthYear = 1994;
		String email = "person@gmail.com";
		Person person = new Person(id, birthYear, email);
		assertEquals(id, person.getId());
		assertEquals(email, person.getEmail());
		assertEquals(birthYear, person.getBirthYear());
		email = "user123@gmail.com";
		person.setEmail(email);
		assertEquals(email, person.getEmail());
	}
	@Test
	void employeeTest() {
		long id = 123654789;
		int birthYear = 1990;
		String email = "employee@gmail.com";
		int basicSalary = 6500;
		Employee employee = new Employee(id, birthYear, email, basicSalary);
		assertEquals(id, employee.getId());
		assertEquals(email, employee.getEmail());
		assertEquals(birthYear, employee.getBirthYear());
		assertEquals(basicSalary, employee.computePay());
		basicSalary = 8500;
		employee.setBasicSalary(basicSalary);
		assertEquals(basicSalary, employee.computePay());
		email = "newuser@gmail.com";
		employee.setEmail(email);
		assertEquals(email, employee.getEmail());
	}
	@Test
	void wageEmployeeTests() {
		long id = 321456987;
		int birthYear = 1985;
		String email = "wage_employee@gmail.com";
		int basicSalary = 5000;
		int wage = 15;
		int hours = 125;
		int expectedComputePay = basicSalary + wage * hours;
		WageEmployee wageEmployee = new WageEmployee(id, birthYear, email, basicSalary, wage, hours);
		assertEquals(id, wageEmployee.getId());
		assertEquals(email, wageEmployee.getEmail());
		assertEquals(birthYear, wageEmployee.getBirthYear());
		assertEquals(expectedComputePay, wageEmployee.computePay());
		wage = 20;
		hours = 105;
		basicSalary = 7000;
		wageEmployee.setWage(wage);
		wageEmployee.setHourse(hours);
		wageEmployee.setBasicSalary(basicSalary);
		expectedComputePay = basicSalary + wage * hours;
		assertEquals(expectedComputePay, wageEmployee.computePay());	
	}
	@Test
	void salesPersonTest() {
		long id = 321123321;
		int birthYear = 1987;
		String email = "sales_employee@gmail.com";
		int basicSalary = 6000;
		int sales = 15000;
		int persentPay = 5;
		int expectedComputePay = basicSalary + Math.round((sales * persentPay) / 100);
		SalesPerson salesPerson = new SalesPerson(id, birthYear, email, basicSalary, sales, persentPay);
		assertEquals(id, salesPerson.getId());
		assertEquals(email, salesPerson.getEmail());
		assertEquals(birthYear, salesPerson.getBirthYear());
		assertEquals(expectedComputePay, salesPerson.computePay());
		sales = 20000;
		persentPay = 10;
		basicSalary = 10000;
		salesPerson.setSales(sales);
		salesPerson.setPercentPay(persentPay);
		salesPerson.setBasicSalary(basicSalary);
		expectedComputePay = basicSalary + Math.round((sales * persentPay) / 100);
		assertEquals(expectedComputePay, salesPerson.computePay());
	}
}