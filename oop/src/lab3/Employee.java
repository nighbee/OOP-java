package lab3;
import java.util.Date;
import java.util.Objects;
import java.util.Comparator;

public class Employee extends Person implements Comparable<Employee>, Cloneable{
	private double annaualSalary; 
	private Date hireDate; 
	private String natioanalInsuranceNum;
	
	public Employee(String name, double annualSalary, Date hireDate, String nationalinsuranceNum) { 
		super(name); 
		this.annaualSalary=annualSalary; 
		this.hireDate= hireDate;
		this.natioanalInsuranceNum= natioanalInsuranceNum; 
	}
	
	public double getAnnaualSalary() {
		return annaualSalary;
	}
	public void setAnnaualSalary(double annaualSalary) {
		this.annaualSalary = annaualSalary;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public String getNatioanalInsuranceNum() {
		return natioanalInsuranceNum;
	}
	public void setNatioanalInsuranceNum(String natioanalInsuranceNum) {
		this.natioanalInsuranceNum = natioanalInsuranceNum;
	}

	@Override
	public String toString() {
		return "Employee [annaualSalary=" + annaualSalary + ", hireDate=" + hireDate + ", natioanalInsuranceNum="
				+ natioanalInsuranceNum + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(annaualSalary, hireDate, natioanalInsuranceNum);
	}

	@Override
	public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Employee employee = (Employee) obj;
        return Double.compare(employee.annaualSalary, annaualSalary) == 0
                && hireDate.equals(employee.hireDate)
                && natioanalInsuranceNum.equals(employee.natioanalInsuranceNum)
                && getName().equals(employee.getName());
    }
	
	protected Employee clone() throws CloneNotSupportedException {
        return (Employee) super.clone();
    }
	
	public int compareTo(Employee other) {
        if (this.getAnnaualSalary() > other.getAnnaualSalary()) {
            return 1;
        } else if (this.getAnnaualSalary() < other.getAnnaualSalary()) {
            return -1;
        } else {
            return 0;
        }
    }
	
	public static Comparator<Employee> NameComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee employee1, Employee employee2) {
            return employee1.getName().compareTo(employee2.getName());
        }
    };

    public static Comparator<Employee> HireDateComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee employee1, Employee employee2) {
            return employee1.getHireDate().compareTo(employee2.getHireDate());
        }
    };

	
}
