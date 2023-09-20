public class Bank2{
	private CheckingAccount accountOne;
	private CheckingAccount accountTwo;

	public Bank2(){
		accountOne = new CheckingAccount("Zeus", 100, "1");
		accountTwo = new CheckingAccount("Hades", 200, "2");
	}

	public static void main(String[] args){
		Bank2 bankOfGods = new Bank2();
		System.out.println(bankOfGods.accountOne.name);
		bankOfGods.accountOne.addFunds(5);
		bankOfGods.accountOne.getInfo();
	}
}