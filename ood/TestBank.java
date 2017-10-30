public class TestBank {
		public static	void main(String arg[]){
			BankAccount a1 = new BankAccount("Hank");
			BankAccount a2 = new BankAccount("Bob");
			System.out.println("a1 owner is " + a1.owner);
			System.out.println("a1 balance is " + a1.balance);
			System.out.println("a2 owner is " + a2.owner);
			System.out.println("a2 balance is " + a2.balance);
			
			a1.deposit(100);
			System.out.println(a1.balance);
			a1.withdraw(80);
			System.out.println(a1.balance); // 20

		}
}