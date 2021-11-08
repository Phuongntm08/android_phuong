import kotlin.math.sqrt

class Utilizer {

    fun draw_a_pine_tree(num_of_layers: Int) {
        for (x in 1..num_of_layers) {
            for (y in 1..x) {
                print("*")
            }
            println()
        }

    }

    fun compute_an_equation(a: Float, b: Float, c: Float) {
        // kiểm tra các hệ số
        // kiểm tra các hệ số
        if (a.equals(0)) {
            println("Phương trình có một nghiệm: x = ${-c / b}")
            return
        }
        if (b.equals(0)) {
            println("Phương trình vô nghiệm!")
            return
        }

        // tính delta
        // tính delta
        val delta: Float = b * b - 4 * a * c
        val x1: Float
        val x2: Float
        // tính nghiệm
        // tính nghiệm
        if (delta > 0) {
            x1 = (((-b + sqrt(delta.toFloat())) / (2 * a)).toFloat())
            x2 = (((-b - sqrt(delta.toFloat())) / (2 * a)).toFloat())
            println(
                ("Phương trình có 2 nghiệm là: "
                        + "x1 = " + x1 + " và x2 = " + x2)
            )
        } else if (delta == 0f) {
            x1 = (-b / (2 * a))
            println(
                ("Phương trình có nghiệm kép: "
                        + "x1 = x2 = " + x1)
            )
        } else {
            println("Phương trình vô nghiệm!")
        }

    }

    fun print_duplicate_number(numbers: Array<Int>) {
        var set_of_numbers: MutableSet<Int> = mutableSetOf()
        for (number in numbers)
            if (set_of_numbers.add(number)) {
                print(number.toString() + " ")
            }
        println("Finished!")
    }

    fun generateRandomPassword(): String {
        val chars = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
        var passWord = ""
        for (i in 0..31) {
            passWord += chars[Math.floor(Math.random() * chars.length).toInt()]
        }
        return passWord
    }

    fun sorting() {

    }

    fun isNumeric(str: String?) = str?.all { it in '0'..'9' }
}