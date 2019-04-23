package factorialofnum;

public class Employee {
	String ename;
	int age;
	public void setename(String ename){
		this.ename=ename;
	}
	public String getename(){
		return ename;
	}
public String getname(){
	return ename;
}
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setename("sai");
		System.out.println(emp.getename());
		

	}

}
