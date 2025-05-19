package lld.structuraldesignpattern.adapter;

public class Main {

	public static void main(String[] args) {

		BusinessCardDesigner businessCardDesigner = new BusinessCardDesigner();

		/** Using Class/Two-way adapter **/ 
		EmployeeClassAdapter employeeClassAdapter = new EmployeeClassAdapter();
		populateEmployeeData(employeeClassAdapter);
		var card = businessCardDesigner.designCard(employeeClassAdapter);
		System.out.println(card);
		System.out.println("*************************************************************");

		/** Using Object Adapter **/
		Employee employee = new Employee();
		populateEmployeeData(employee);
		EmployeeObjectAdapter employeeObjectAdapter = new EmployeeObjectAdapter(employee);
		var cardO = businessCardDesigner.designCard(employeeObjectAdapter);
		System.out.println(cardO);
		
	}

	private static void populateEmployeeData(Employee employee) {
		employee.setFullName("Elliot Alderson");
		employee.setJobTitle("Security Engineer");
		employee.setOfficeLocation("Allsafe Cybersecurity, New York City, New York");
	}
}
