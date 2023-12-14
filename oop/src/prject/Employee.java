package prject;

import java.util.Objects;

public class Employee extends User{
	
	public String employeeID; 
	
	public Employee(String userID, String username, String email, String password) {
		super(userID, username, email, password);
		this.employeeID=employeeID; 
	}
	
	public void viewMessages() { 
		
	}
	
	public void sendRequest() { 
		
	}
	
	public void sendComplaints() { 
		
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(employeeID);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(employeeID, other.employeeID);
	}

	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + "]";
	}
	
	
	
}
