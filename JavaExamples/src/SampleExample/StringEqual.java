package SampleExample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class StringEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		
		list.add ("vinod");
		list.add ("goud");
		list.add("Rangu");
		
		Iterator it = list.iterator();
		while(it.hasNext()){
			
			System.out.println(it.next());
		}
	}
}
	
