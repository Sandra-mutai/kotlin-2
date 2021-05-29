fun main() {
    println(person(listOf(Book("blossom of the savannah","Ombijah b",234),
        Book("born a crime","trevor noah",234),
        Book("jaurney","dan kelly",278),
    )))
    println("\$accountNumber:2222 with \$balance20000 is operated by \$sandra")
    var count=5
    println(20000)

}

data class Book(var title:String,var Author:String,var pages:Int)
fun person(books:List<Book>):List<Book>{
    var arranged=books.sortedBy{ book ->book.title  }
    return arranged
    }

open class CurrentAccount(var accountNumber: String, var accountName: String, var balance: Int) {
    fun deposit(amount: Double) {
        balance = balance + amount.toInt()
    }

    fun withdraw(amount: Double) {
        balance = balance - amount.toInt()
    }

    fun details() {
        println("${accountNumber},${balance},${accountName}")
    }

}

class SavingsAccount(accountNumber: String, accountName: String, balance: Int, var withdrawals: Int) :
    CurrentAccount(accountNumber, accountName, balance) {
    var check = 0;
    fun withdrawals(amount: Int) {

        if (check <= 4) {
            check++;
        }

        println("allow withrawal ${check}")

    }
}

