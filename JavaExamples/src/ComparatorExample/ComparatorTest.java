package ComparatorExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ComparatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> list= new ArrayList<Employee>();
		
		list.add(new Employee(3,6000,"vinod"));
		list.add(new Employee(6,7500,"Rangu"));
		list.add(new Employee(1,9000,"kittu"));
		list.add(new Employee(5,5000,"bunny"));
		
		Collections.sort(list, new NameComparator());
		
		Iterator it = list.iterator();
		
		while(it.hasNext()){
			Employee emp = (Employee)it.next();
			System.out.println(emp.id+" "+emp.salaray+" "+emp.name);
			
			/*Collections.sort(list, new SalaryComparator());
			
			Iterator it = list.iterator();
			
			while(it.hasNext()){
				Employee emp = (Employee)it.next();
				System.out.println(emp.id+"  "+emp.salaray+"  "+emp.name);
		}*/
	}
	}
}
