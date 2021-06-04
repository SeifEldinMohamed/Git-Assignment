fun main() {

  print(practiceSingleton.name)
  print(practiceSingleton.sum(2,5))
}

// singleton
object practiceSingleton{
    const val name = "Seif Eldin Mohamed"

    fun sum(num1: Int, num2: Int):Int{
        return num1.plus(num2)
    }
}