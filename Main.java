import model.BankAccount;
import service.BankService;
import util.InputUtil;

public class Main {
    public static void main(String[] args) {
        System.out.println("🏦 Welcome to Bank!");
        

        String name = InputUtil.getStringInput("Enter Account Holder Name: ");
        String accNo = InputUtil.getStringInput("Enter Account Number: ");
        double balance = InputUtil.getDoubleInput("Enter Initial Balance (₹): ");

        BankAccount account = new BankAccount(name, accNo, balance);
        BankService service = new BankService(account);

        int choice;
        do {
            System.out.println("\n========== MENU ==========");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Show Account Info");
            System.out.println("5. Exit");
            choice = InputUtil.getIntChoice("Select an option (1-5): ", 1, 5);

            switch (choice) {
                case 1 -> {
                    double amount = InputUtil.getDoubleInput("Enter amount to deposit: ₹");
                    service.deposit(amount);
                }
                case 2 -> {
                    double amount = InputUtil.getDoubleInput("Enter amount to withdraw: ₹");
                    service.withdraw(amount);
                }
                case 3 -> service.checkBalance();
                case 4 -> service.displayAccountInfo();
                case 5 -> System.out.println("🙏 Thank you for banking with us!");
            }
        } while (choice != 5);
    }
}
 
    

