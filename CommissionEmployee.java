package mypackage;

/**
 * CommissionEmployee.java <br>
 * CommissionEmployee class extends Employee.
 * @author lkw.
 */
public class CommissionEmployee extends Employee {
	private double grossSales; // gross weekly sales
	private double commissionRate; // commission percentage

	/**
	 * five-argument constructor
	 * @param first first name of employee
	 * @param last last name of employee
	 * @param sales gross sales of employee
	 * @param rate commission rate of employee
	 */
	public CommissionEmployee(String first, String last, Date bdate, Date hdate,
			double sales, double rate) {
		super(first, last, bdate, hdate);
		setGrossSales(sales);
		setCommissionRate(rate);
	} // end five-argument CommissionEmployee constructor

	/**
	 * set commission rate
	 * @param rate commission rate of employee
	 */
	public void setCommissionRate(double rate) {
		if (rate > 0.0 && rate < 1.0)
			commissionRate = rate;
		else
			throw new IllegalArgumentException( 
					"Commission rate must be > 0.0 and < 1.0");
	} // end method setCommissionRate

	/**
	 * return commission rate
	 * @return commission rate of employee
	 */
	public double getCommissionRate() {
		return commissionRate;
	} // end method getCommissionRate

	/**
	 * set gross sales amount
	 * @param sales gross sales of employee
	 */
	// set gross sales amount
	public void setGrossSales(double sales) {
		if (sales >= 0.0)
			grossSales = sales;
		else
			throw new IllegalArgumentException( 
					"Gross sales must be >= 0.0" );
	} // end method setGrossSales

	/**
	 * return gross sales amount
	 * @return gross sales of employee
	 */
	public double getGrossSales() {
		return grossSales;
	} // end method getGrossSales

	/**
	 * return String representation of CommissionEmployee object
	 * @return String representation of CommissionEmployee object
	 */
	@Override
	public String toString() {
		return String.format("%s: %s%n%s: $%,.2f; %s: %.2f", 
				"commission employee", super.toString(), 
				"gross sales", getGrossSales(), 
				"commission rate", getCommissionRate());
	} // end method toString

	@Override
	public double getPayment() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * calculate pay; implements Payable interface method getPaymentAmount
	 * @return pay of employee
	 */
	@Override
	public double getPaymentAmount() {
		return getCommissionRate() * getGrossSales();
	} // end method getPaymentAmount

} // end class CommissionEmployee
