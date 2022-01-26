val nameList: List<String> = listOf("Eva", "SoEn", "Tiff")
val mutableNameList = mutableListOf("Eva", "SoEn", "Tiff")
val xMutableNames = nameList.toMutableList()

fun main() {
    //println(nameList.getOrElse(4){ "K"})
    // println( nameList.getOrNull(4) ?: "Alan")

    mutableNameList.add("Diana")
    mutableNameList.add(0, "Diana")
    mutableNameList.remove("SoEn")

    mutableNameList += "Sophie"

    xMutableNames.add(0, "Luna")

//        println(xMutableNames[0])
//        println(mutableNameList[0])
//        println(mutableNameList.last())
//        mutableNameList.removeIf { it.contains("a") }
//        println(mutableNameList)

        for (name in mutableNameList){
            println(name)
        }

    mutableNameList.forEach { name -> println(name) }

    mutableNameList.forEachIndexed { index, name -> println("element $name's index is $index") }



}

