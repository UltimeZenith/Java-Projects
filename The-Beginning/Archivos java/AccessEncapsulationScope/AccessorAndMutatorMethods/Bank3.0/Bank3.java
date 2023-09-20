public class Bank3{
	private CheckingAccount accountOne;
	private CheckingAccount accountTwo;

	public Bank3(){
		accountOne = new CheckingAccount("Zeus", 100, "1");
		accountTwo = new CheckingAccount("Hades", 200, "2");
	}

	public static void main(String[] args){
		Bank3 bankOfGods = new Bank3();
		System.out.println(bankOfGods.accountOne.getBalance());
		bankOfGods.accountOne.setBalance(5000);
		System.out.println(bankOfGods.accountOne.getBalance());
	}
}