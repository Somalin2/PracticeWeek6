package mypackage;

/**
 * Employee.java <br>
 * Employee class with references to other objects.
 * 
 * @author LKW
 */

public abstract class Employee implements Payable {
	
	 /**
     * first name of employee
     */
    private String firstName;
    
    /**
     * last name of employee
     */
    private String lastName;
    
    /**
     * birth date of employee
     */
    private Date birthDate;
    
    /**
     * hire date of employee
     */
    private Date hireDate;
    
    private double salary;

    /**
     *
     * constructor to initialize name, birth date and hire date
     * 
     * @param first
     *            first name of employee
     * @param last
     *            last name of employee
     * @param dateOfBirth
     *            birth date of employee
     * @param dateOfHire
     *            date employee was hired
     */

	public Employee(String firstname, String lastname, Date birthDate, Date hireDate) {
		super();
		this.firstName = firstname;
		this.lastName = lastname;
		this.birthDate = birthDate;
		this.hireDate = hireDate;
	}
	
	public abstract double getPayment();
	 /**
     * convert Employee to String format
     * 
     * @return String represenation of this Employee object
     */

    public String toString() {
        return String.format("%s, %s  Hired: %s  Birthday: %s", firstName,
        		lastName, hireDate, birthDate);
    } // end method toEmployeeString

		

}
