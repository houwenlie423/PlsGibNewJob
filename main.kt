import binary_search.BinarySearch
import stack.ValidParentheses

/**
 * @author Houwen Lie (houwenlie98@gmail.com)
 * @version main, v 0.1 Tue 7/2/2024 8:37 PM by Houwen Lie
 */
fun main() {
    println(BinarySearch.invoke(intArrayOf(-1,0,3,5,9,12), 9))
    println(BinarySearch.invoke(intArrayOf(-1,0,3,5,9,12), 2))
}