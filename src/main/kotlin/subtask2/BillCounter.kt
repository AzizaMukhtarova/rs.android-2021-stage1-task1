package subtask2

class BillCounter {
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val paymentOfAnna = (bill.sum() - bill[k])/2
        val backToAnna = b - paymentOfAnna
        return if (b == paymentOfAnna) "Bon Appetit"
        else backToAnna.toString()
    }
}
