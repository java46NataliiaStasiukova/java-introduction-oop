package telran.people;

public class WageEmployee extends Employee {
private int wage;
private int hours;
public WageEmployee(long id, int birthYear, String email, int basicSalary, int wage, int hours) {
	super(id, birthYear, email, basicSalary);
	setWage(wage);
	setHourse(hours);
}
public void setWage(int wage) {
	this.wage = wage;
}
public void setHourse(int hours) {
	this.hours = hours;
}
@Override
public int computePay() {
	return super.computePay() + wage * hours;
}
}
