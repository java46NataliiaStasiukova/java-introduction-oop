package telran.people;

public class SalesPerson extends Employee{
private int sales;
private int percentPay;
public SalesPerson(long id, int birthYear, String email, int basicSalary, int sales, int percentPay) {
	super(id, birthYear, email, basicSalary);
	setSales(sales);
	setPercentPay(percentPay);
}
public void setSales(int sales) {
	this.sales = sales;
}
public void setPercentPay(int persentPay) {
	this.percentPay = persentPay;
}
@Override
public int computePay() {
	return super.computePay() + Math.round(sales * percentPay) / 100;
}
}
