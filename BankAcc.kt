class BankAccount(val accountNumber: String, var balance: Double) {

    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Deposited $$amount. New balance: $$balance")
        } else {
            println("Deposit amount must be positive.")
        }
    }

    fun withdraw(amount: Double) {
        if (amount > 0 && amount <= balance) {
            balance -= amount
            println("Withdrew $$amount. New balance: $$balance")
        } else {
            println("Withdrawal amount must be positive and less than or equal to the current balance.")
        }
    }

    fun getBalance(): Double {
        return balance
    }
}

fun main() {
    val account = BankAccount("123456789", 1000.0)
    account.deposit(200.0)
    account.withdraw(150.0)
    println("Current balance: ${account.getBalance()}")
}
