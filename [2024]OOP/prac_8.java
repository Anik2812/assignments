xpublic class Prac_8 {
    private int balance;
    private int accountNumber;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccountNumber(12345);
        account.setBalance(1000);

        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());
    }
}
