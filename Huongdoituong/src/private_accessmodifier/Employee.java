package private_accessmodifier;

public class Employee {
	private long salary;
	
	public Employee() {
		salary=100000L;
	}
	
	private  void showSalary(){
		System.out.println("Tiền lương: "+salary);
	}

	public static void main(String[] args) {
		//Gọi phương thức showSalary()
		Employee employee=new Employee();
		employee.showSalary();
	
	}

}
