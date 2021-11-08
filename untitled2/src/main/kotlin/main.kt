import kotlin.math.sqrt
import Utilizer

fun main() {
    val util = Utilizer()

    // 1. print option menu:
    print_menu()
    var user_choice: String? = "0"
    var user_choice_int: Int = 0

    do {
    // 2. receive inputs from users
        do {
            print("Input your choice: ")
            user_choice = readLine() // catch exception here + verify...
            if (user_choice.isNullOrEmpty() || !util.isNumeric(user_choice)!!) {
                user_choice_int = 0
                break
            }
            user_choice_int = user_choice.toInt()
            if (user_choice_int < 0 || user_choice_int > 6) {
                println("Just input number from 1 to 5. Please try again")
            } else {
                break
            }
        } while (true)

        // 3. action
        when (user_choice_int) {
            1 -> {
                println("Input the number of layers: ")
                var numOfLayers = readLine()!!.toInt()
                util.draw_a_pine_tree(numOfLayers)
            }
            2 -> {
                println("Input parameters (parameters are splitted by a space): ")
                var a = Array<Float>(100) { readLine()!!.toFloat() }
                util.compute_an_equation(
                    (a?.get(0)?.toFloat() ?: 1) as Float,
                    (a?.get(1)?.toFloat() ?: 2) as Float,
                    (a?.get(2)?.toFloat() ?: 1) as Float
                )
            }
            3 -> {
                println("Not finished yet!!")
//                var arr = Array<Int> { readLine()!!.toInt() }
//                util.print_duplicate_number(arr)
            }
            4 -> {
                println(util.generateRandomPassword())
            }
            5 -> {
                println("Not finished yet!!")
            }
            else -> {
                println("Thank you for your visit!")
                break
            }
        }
        //4. Ask for continuing permission
        println("Do you want to continue (Y/N)")
        var ynAnswer = readLine()
        if (ynAnswer.isNullOrEmpty() || ynAnswer?.uppercase() != "Y") {
            break
        }
    } while (true)

}

fun print_menu() {
    println("Welcome to App Tools. Choose one of tools below. Press 0 if you want to exit")
    println("1. Draw a pine tree")
    println("2. Compute an equation")
    println("3. Print duplicate numbers")
    println("4. Get random password")
    println("5. Sorting")
    println("Other. Exit")
}

