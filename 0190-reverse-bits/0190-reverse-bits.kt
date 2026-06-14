class Solution {
    fun reverseBits(n: Int): Int {
        var num = n
        var resu =0

        repeat(32){
            resu = resu shl 1
            resu = resu or (num and 1)
            num = num ushr 1

        }
        return resu
    }
}