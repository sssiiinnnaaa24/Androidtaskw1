class Employee(
    val fistName: String,
    val lastName: String,
    val age: Int,
    val salary: Int
) {
    fun isWealthy(): Boolean {
        return salary > 1000
    }

}

fun main() {
    val employee = Employee("Amir", "Amiri", 25, 1050)
    println("Is ${employee.fistName} ${employee.lastName} wealthy? ${employee.isWealthy()}")
}