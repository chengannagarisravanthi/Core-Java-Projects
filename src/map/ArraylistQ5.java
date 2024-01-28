//Create an ArrayList of Employee( id,name,address,sal) objects 
//and search for particular Employee object based on id number

package map;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

	class Employee {
		public int id;
		public String name;
		public String address;
		 Double salary;
		
		public Employee(int id, String name, String address, Double salary) {
			super();
			this.id = id;
			this.name = name;
			this.address = address;
			this.salary = salary;
		}	
		
		public int getId() {
			return id;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
		}

		public String getEmpSalary() {
			
			return null;
		}
	}

	public class ArraylistQ5 {

		public static void main(String[] args) {
			//List<Employee> list = new ArrayList<>();
			//LinkedList<Employee> list = new LinkedList<>();
			Vector<Employee> list = new Vector<>();
			
			list.add(new Employee(1, "sravani", "rayachoti, India", 20000.0));
			list.add(new Employee(2, "sravanthi", "puttur, India", 30000.0));
			list.add(new Employee(3, "deepa", "rayachoti, India", 40000.0));
			list.add(new Employee(4, "sweety", "hyderabad, India", 50000.0));
			
			Iterator<Employee> it = list.iterator();
			int searchId = 4;
			while (it.hasNext()) {
				Employee emp = it.next();
				if (emp.getId() == searchId)
					System.out.println(emp);
			}
		}

	}
