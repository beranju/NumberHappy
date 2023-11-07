import kotlin.math.abs

fun main() {
    print("Input number : ")
    val input = readln().toInt()
    val num = abs(input)
    val isHappy = if (isNumHappy(num = num)) "Happy" else "Sad"
    println("$input is $isHappy")
}

fun isNumHappy(num: Int): Boolean {
    var total = num
    val seenNumber = HashSet<Int>()
    while (total != 1 && !seenNumber.contains(total)) {
        seenNumber.add(total)
        var tempTotal = 0
        var sisa = total
        while (sisa > 0) {
            val digit = sisa % 10
            tempTotal += digit * digit
            sisa /= 10
        }
        total = tempTotal
    }
    return total == 1
}