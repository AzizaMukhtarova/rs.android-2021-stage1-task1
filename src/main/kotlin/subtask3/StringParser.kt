package subtask3

class StringParser {

    fun getResult(inputString: String): Array<String> {
        val array = mutableListOf<String>()
        var current = 0
        for (i in inputString.withIndex()) {
            if (i.value == '[' ||i.value == '<' ||  i.value == '(') {
                val end = when (i.value) {
                    '<' -> '>'
                    '[' -> ']'
                    '(' -> ')'
                    else -> ' '
                }
                for (j in i.index + 1 until inputString.length) {
                    if (inputString[j] == i.value) current++
                    if (inputString[j] == end) {
                        if (current == 0) {
                            array.add(inputString.substring(i.index + 1 until j))
                        } else current--
                    }
                }
            }
        }
        return array.toTypedArray()
    }
}
