package abstraction;

public class SingleTon {
	public static void main(String[] args) {
		Account.createobj();
		Account.createobj();
	}

}
class Account{
	private static Account a;
	
	private Account() {
		System.out.println("Object created");
	}
	public static Account createobj() {
		if(a==null) {
			System.out.println("Done");
			return a = new Account();
		} else {
			System.out.println("Object already created");
		}
		return a;
	}
}