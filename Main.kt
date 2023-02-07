fun main() {
   do {
        val inputStr = readLine()
        when (inputStr) {
            "/start" -> println("Hello, Guest!")
            "/help" -> println("/start - programm start, \n/end - end of programm")
            "/end" -> break
            else -> println("Program is unable to process the request, call /help")
        }
   } while(true)
    println("Goodbye, Guest")
}