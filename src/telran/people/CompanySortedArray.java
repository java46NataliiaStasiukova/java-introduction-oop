package telran.people;

import java.util.Arrays;

public class CompanySortedArray extends CompanyArray {
	@Override
public boolean addEmployee(Employee empl) {
		//TODO
		//finds index for adding with keeping array sorted
		//calls getEmployeeIndex
		if(getEmployee(empl.getId()) != null) {
		return false;
	}
	int index = getEmployeeIndex(empl.getId());
	index = -(index) -1;
	Employee[] tmp = new Employee[employees.length + 1];	
	System.arraycopy(employees, 0, tmp, 0, index);
	System.arraycopy(employees, index, tmp, index + 1, employees.length - index);
	tmp[index] = empl;
	employees = tmp;
	
		return true;
}
	
	@Override 
	protected int getEmployeeIndex(long id) {
		//TODO
		// based on Arrays.binarySearch
		Person refToPerson = new Person(id, 0, null);
		int index = Arrays.binarySearch(employees, refToPerson);
		return index;
	}

	@Override
	public Employee[] getAllEmployees() {
		return Arrays.copyOf(employees, employees.length);
	}
}


//Option without reference to Person:
//@Override 
//protected int getEmployeeIndex(long id) {
//	long emoloyeesId[] = new long[employees.length];
//	for(int i = 0; i < employees.length; i++) {
//		emoloyeesId[i] = employees[i].getId();
//	}
//	int index = Arrays.binarySearch(emoloyeesId, id);
//	return index;
//}

