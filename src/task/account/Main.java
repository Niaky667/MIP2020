package task.account;

public class Main {

	static Account ika = new Account("Toka", "Ika", 100);
	static Account lola = new Account("Moka", "Lola", 0);

	public static void main(String[] args) {
		ika.credit(100);
		lola.debit(3);
		ika.transferTo(lola, 5);
		System.out.println("ID:" + ika.getiD() + " | " + "Ika's new balance is " + ika.getBalance());
		System.out.println("ID:" + lola.getiD() + " | " + "Lola's new balance is " + lola.getBalance());
	}
}
