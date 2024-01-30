public final class SingletonClassEager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		SingletonClass singleton1 = SingletonClass.getInstance();
		SingletonClass singleton2 = SingletonClass.getInstance();

		if(singleton1 == singleton2) {
			System.out.println("Both Objects are the Same Instance");

		}
	}

	public static SingletonClass getInstance() {
		// TODO Auto-generated method stub
		return null;
		
	}
}
...............................................................................................................................................
public class Singleton {
	
	private static final Singleton instance = new Singleton();
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		// TODO Auto-generated method stub
		return instance;
		
	}
}
