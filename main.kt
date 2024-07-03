import stack.ValidParentheses

/**
 * @author Houwen Lie (houwenlie98@gmail.com)
 * @version main, v 0.1 Tue 7/2/2024 8:37 PM by Houwen Lie
 */
fun main() {
    println(ValidParentheses.invoke("()"))
    println(ValidParentheses.invoke("()[]{}"))
    println(ValidParentheses.invoke("({[]})"))
    println(ValidParentheses.invoke("({[})"))
}