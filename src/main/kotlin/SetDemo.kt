val planets = setOf("Mercury", "Venus", "Earth", "Earth").toMutableSet()
val patrons = listOf("Eli Baggins", "Eli Baggins", "Eli Ironfoot").distinct() // 相当于toSet，toList

fun main() {

//    planets.add("moon")
//    planets += ("mars")
//    planets -= ("moon")

    // println(planets)
    var a = 0
    while (a < 3) {
        println(planets)
        if (planets.contains("Earth")) break
        a++
    }
  println(patrons)

}
