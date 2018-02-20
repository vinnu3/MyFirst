package ComaparableExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IComparable {
	public static void main(String [] args){
	User u1 = new User(3, "vinod");
	User u2 = new User(6, "Rangu");
	User u3 = new User(7, "kittu");
	User u4 = new User(1, "bunny");

	List<User> list = new ArrayList<User>();
	
	list.add(u1);
	list.add(u2);
	list.add(u3);
	list.add(u4);
	
	Collections.sort(list);
	
	for(User user : list){
		
		System.out.println(user);
	}
	}
	}
	
	

