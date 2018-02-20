package ComparatorExample;

public class SalaryComparator {

	@Override
	public int compare(Employee o1, Employee o2){
		Employee e1 = (Employee)o1;
		Employee e2 = (Employee)o2;
		
		if(e1.salaray==e2.salaray){
			return 0;
	
		}else if(e1.salaray>e2.salaray){
			return 1;
			return -1;
		}
	}
}
