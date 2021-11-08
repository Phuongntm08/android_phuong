fun main() {
    print_menu()
}

fun print_menu() {
    println("Welcome to App Tools. Choose one of tools below. Press 0 if you want to exit")
    println("1. Draw a pine tree")
    println("2. Compute an equation")
    println("3. Print duplicate numbers")
    println("4. Get random password")
    println("5. Sorting")
    var user_choice = 0
    do {
        println("Input your choice: ")
        user_choice = readLine()!!.toInt() // catch exception here + verify...
        if (user_choice == 0) {
            println("Thank you for your visit!")
            break
        }
    } while (user_choice < 0 || user_choice > 6)

    println("Your input is: $user_choice")

    if (user_choice == 1) {
        println("Input the number of layers: ")
        var numOfLayers = readLine()!!.toInt()
        draw_a_pine_tree(numOfLayers)
    } else if (user_choice==2) {

    } else if (user_choice==3) {

    } else if (user_choice==4) {

    }else if (user_choice==5) {

    } else {
        println("Thank you for your visit!")
    }
}

fun draw_a_pine_tree(num_of_layers:Int) {
    for (x in 1..num_of_layers) {
        for (y in 1..x) {
            print("*")
        }
        println()
    }

}
fun compute_an_equation() {

}
fun print_duplicate_number() {

}
fun get_random_number() {

}
fun sorting() {

}