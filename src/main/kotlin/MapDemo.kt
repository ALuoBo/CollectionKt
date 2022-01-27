val friendMap = mapOf<String, String>("classmate" to "Kaven", "colleague" to "Chen","classmate" to "NiuBoss",)
val friendMaps = mapOf<String, String>(Pair("classmate","Kaven"))


fun main() {
  //  println(friendMap)
   // println("friendMaps $friendMaps")
 val xx = friendMap.toMutableMap().getOrPut("dd"){"dd"}

    println(friendMap["classmate"])
    println(friendMap.keys)
    println(friendMap.values)
    println(xx)

}