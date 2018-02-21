fun main(args: Array<String>) {
    val p1 = Customer("È«±æµ¿", "010-1234-5678")
    val p2 = Customer("±è¼±´Þ", "010-5678-1234")
    println(p1 < p2)
    println(p1 > p2)
}
class Customer(val name: String, val phone: String) : Comparable<Customer> {
    override fun compareTo(other: Customer): Int {
        return compareValuesBy(this, other, Customer::name, Customer::phone) // #1
    }
}