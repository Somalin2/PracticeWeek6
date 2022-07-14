package mypackage;

/**
 * SalariedEmployee.java <br>
 * SalariedEmployee class extends Employee and implements Payable.
 * @author LKW
 */
public class SalariedEmployee extends Employee {
	private double weeklySalary;

	/**
	 * four-argument constructor
	 * @param first first name of the employee
	 * @param last last name of the employee
	 * @param ssn SSN of the employee
	 * @param salary the salary the employee
	 */
	public SalariedEmployee(String first, String last, Date bdate, Date hdate,
			double salary) {
		super(first, last, bdate, hdate); // pass to Employee constructor
		setWeeklySalary(salary); // validate and store salary
	} // end four-argument SalariedEmployee constructor

	/**
	 * set salary
	 * @param salary the salary of the employee
	 */
	public void setWeeklySalary(double salary) {
		if ( salary >= 0.0 )
			weeklySalary = salary;
		else
			throw new IllegalArgumentException( 
					"Weekly salary must be >= 0.0" );
	} // end method setWeeklySalary

	/**
	 * return salary
	 * @return the salary of the employee
	 */
	public double getWeeklySalary() {
		return weeklySalary;
	} // end method getWeeklySalary

	@Override
	public double getPayment() {
		return weeklySalary*4;
	}

	/**
	 * return String representation of SalariedEmployee object
	 * @return String representation of SalariedEmployee object
	 */
	@Override
	public String toString() {
		return String.format("salaried employee: %s%n%s: $%,.2f", 
				super.toString(), "weekly salary", getWeeklySalary());
	} // end method toString

	@Override
	public double getPaymentAmount() {
		return getWeeklySalary();
	} // end method getPaymentAmount

} // end class SalariedEmployee

