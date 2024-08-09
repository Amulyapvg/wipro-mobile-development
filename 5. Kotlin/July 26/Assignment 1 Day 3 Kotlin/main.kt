fun main() {
    // Create some test transactions
    val transaction1 = Transaction(1, 100.0)
    val transaction2 = Transaction(2, 200.0)

    // Test generic functions
    val transactions = listOf(transaction1, transaction2)
    printTransactions(transactions)

    // Test UserManager
    val userManager = UserManager()
    val user1 = User(1, "Alice")
    val user2 = User(2, "Bob")

    userManager.addUser(user1)
    userManager.addUser(user2)
    userManager.removeUser(1)

    println("Users after removal:")
    userManager.listUsers().forEach { println(it) }
}




data class User(val id: Int, val name: String)

class UserManager {
    private val users = mutableListOf<User>()

    fun addUser(user: User) {
        if (users.none { it.id == user.id }) {
            users.add(user)
        } else {
            println("User with ID ${user.id} already exists.")
        }
    }

    fun removeUser(userId: Int) {
        val userToRemove = users.find { it.id == userId }
        if (userToRemove != null) {
            users.remove(userToRemove)
        } else {
            println("User with ID $userId not found.")
        }
    }

    fun listUsers(): List<User> {
        return users.toList()
    }
}





fun <T> printTransactions(transactions: Collection<T>) {
    transactions.forEach { println(it) }
}

fun <T> filterTransactions(transactions: Collection<T>, predicate: (T) -> Boolean): List<T> {
    return transactions.filter(predicate)
}

fun <T, K> mapTransactions(transactions: Map<K, T>, transform: (T) -> T): Map<K, T> {
    return transactions.mapValues { (_, value) -> transform(value) }
}




class Transaction(private var _id: Int, private var _amount: Double) {

    var id: Int
        get() = _id
        private set(value) {
            _id = value
        }

    var amount: Double
        get() = _amount
        set(value) {
            if (value >= 0) {
                _amount = value
            } else {
                throw IllegalArgumentException("Amount cannot be negative")
            }
        }

    // Optionally override toString for better output formatting
    override fun toString(): String {
        return "Transaction(id=$id, amount=$amount)"
    }
}



interface Exportable {
    fun exportToCSV(): String
}