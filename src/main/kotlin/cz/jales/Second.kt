package cz.jales

class Second {

    private val words = arrayOf("a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
                "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z")

    private val number = arrayOf("1", "2", "3", "4", "5", "6", "7", "8", "9", "0")

    private val symbols = arrayOf("-", "-", "*", "&", "#", "$")

    private fun password(pole: Array<String>): String {
        val index = (0..pole.size - 1).shuffled().first()
        val entry = pole[index]
        return entry
    }
    fun action(): String {
        return "${password(symbols)} ${password(words)} ${password(words).toUpperCase()} ${password(number)} " +
                "${password(symbols)} ${password(number)} ${password(words)} ${password(symbols)}"
    }



}