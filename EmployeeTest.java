package mypackage;
import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Date bdate=new Date(1,1,2001);
		Date hdate=new Date(2,2,2002);
		Employee employee = new Employee("Dara", "Real", bdate, hdate);
//		System.out.println(employee);
		
//		employee = new SalariedEmployee("Dara", "Men", bdate, hdate, 500.0);
//		employee= new HourlyEmployee("Carl", "Male", bdate, hdate, 20.0, 20.0);
//		employee = new CommissionEmployee ("Dara", "Men", bdate, hdate, 1000.0, 0.1);
//		
		Employee[] employees=new Employee[3];
		employees[0]=new SalariedEmployee ("Dara","Men" , bdate, hdate, 500000);
		employees[1]=new SalariedEmployee ("Piseth","Sok" , bdate, hdate, 000);
		employees[2]=new SalariedEmployee ("Wathana","V" , bdate, hdate, 500);
//		
//		//input the employees 
		
		//display all employees
	for (Employee currentEmployee: employees) {
		System.out.println(currentEmployee);
		if (currentEmployee instanceof BasePlusCommissionEmployee) {
			// downcast Employee reference to 
			// BasePlusCommissionEmployee reference
			BasePlusCommissionEmployee employee = 
					(BasePlusCommissionEmployee) currentEmployee;

			employee.setBaseSalary(1.10 * employee.getBaseSalary());

			System.out.printf( 
					"new base salary with 10%% increase is: $%,.2f%n",
					employee.getBaseSalary());
		} // end if

		System.out.printf( 
				"earned $%,.2f%n%n", currentEmployee.getPaymentAmount());
	} // end for

	// get type name of each object in employees array
	for (int j = 0; j < employees.length; j++)
		System.out.printf( "Employee %d is a %s%n", j, 
				employees[j].getClass().getName()); 
}

}
