package singelton.design.pattern;

public class EagerSingelton {
	
	
	private static EagerSingelton singletonInstance = new EagerSingelton();
	 
	private EagerSingelton(){
		 
	 }

	//Get the only object available
	   public static EagerSingelton getInstance(){
	      return singletonInstance;
	   }
	   
	   public void simpleMethod() {
		   System.out.println("hashcode of singelton object " + singletonInstance);
	   }
	   
}
