	package AbstractExamp;
	//you can create obj of abstract class
	abstract class Human{
		//if you don't want define a method we can use abstract method
		
		abstract public void eat();
		public void walk(){
			
		}
	}
	
	//if another class extend  abstract class it should implements abstract method 
	class Man extends Human{ //concerete class
		public void eat(){
			System.out.println("vegie");
		}
	}
	public class SimpleAbstract {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Human h = new Man();
			//we cann't institiate abstract class
			h.eat();
		}
	
	}
