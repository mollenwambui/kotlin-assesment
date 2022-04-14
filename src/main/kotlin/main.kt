fun main() {
    var currentaccount = CurrentAccount(120, "Mollen savings", 2000.50)
    currentaccount.deposit(500.00)
    println(currentaccount.balance)
    currentaccount.withdraw(200.00)
    println(currentaccount.balance)
    currentaccount.details()

    var savingsaccount = SavingsAccount(150, "lucys saving", 600.50)
    savingsaccount.deposit(700.00)
    println(savingsaccount.balance)

    println(savingsaccount.balance)
    savingsaccount.details()
    savingsaccount.withdraw(2)
    savingsaccount.withdraw(50.00)
    println(savingsaccount.balance)
    var product = Product("Dettol", 2, 200, "hygiene")
    var hygiene = Product("Beans", 5, 150, "grocery")
    var anything = Product("juice", 7, 50, "other")
    when (product.Category) {
        "hygiene" -> println(listOf(product))
    }
    when (hygiene.Category) {
        "grocery" -> println(listOf(hygiene))
    }
    when (anything.Category) {
        "other" -> println(listOf(anything))
    }


}

//
//Create a classCurrentAccount with the following attributes:account
//number, account name, balance. It has the following functions:
//a.deposit(amount: Double) - Increments the balance bythe
//amount deposited
//b.withdraw(amount: Double) - Decrements the balanceby the
//amount withdrawn
//c.details() - Prints out the account number and balanceand
//name in this format: “Account number x with balance y is
//operated by z”(5points)
open class CurrentAccount(var accountnumber: Int, var accountname: String, var balance: Double) {
    fun deposit(amount: Double) {
        balance += amount
    }

    fun withdraw(amount: Double) {
        balance -= amount
    }

    fun details() {
        println("Account number $accountnumber with balance $balance")
    }
}

/*Create another classSavingsAccount. It has the samefunctions and
attributes as the current account except for one attribute,
withdrawals: Int. Withdrawals is a counter variablethat is used to
keep track of how many withdrawals have been made from the account
in a year. The only other difference is that the savings account
withdraw() method first checks if the number of withdrawalsis less
than 4 for it to allow one to withdraw money from the account. It also
increments the withdrawals attribute after a successful withdrawal
*/
class SavingsAccount(accountnumber: Int, accountname: String, balance: Double) :
    CurrentAccount(accountnumber, accountname, balance) {
    fun withdraw(withdrawals: Int) {
        if (withdrawals < 4) {
            println(balance)
            balance += withdrawals
        }
    }
}

//3.A product is represented by a data class with these attributes: name,
//weight, price, category. Category can either be groceries, hygiene or
//other. Write a function that takes in a product and uses a when
//statement to assign each product to a list based on its categories
data class Product(var name: String, var weight: Int, var price: Int, var Category: String)


//Write a function that given a string returns a string composed of only
//the characters in even indices. For example given “banana” it will return
//"bnn"
//fun Students(name:String):String{

//}