package subtask1

class HappyArray {
    fun convertToHappy(sadArray: IntArray): IntArray {
        val happy = sadArray.toCollection(ArrayList())
        var i = 1
        while (i < happy.size - 1) {
            if (happy[i - 1] + happy[i + 1] < happy[i]) {
                happy.removeAt(i)
                if (i != 1) i--
            } else i++
        }
        return happy.toIntArray()
    }
}
