package stack

import java.util.Stack


/**
 * @author Houwen Lie (houwenlie98@gmail.com)
 * @version 01.valid_parentheses, v 0.1 Wed 7/3/2024 7:53 PM by Houwen Lie
 * @problem Valid Parentheses - https://leetcode.com/problems/valid-parentheses
 */
object ValidParentheses {

    operator fun invoke(s: String): Boolean {
        val matches = mapOf(
            ')' to '(',
            '}' to '{',
            ']' to '['
        )

        val stack = Stack<Char>()

        for (bracket in s){
            // Always push bracket to stack if it's an opening bracket
            if (bracket in matches.values) {
                stack.push(bracket)
                continue
            }

            // Otherwise, if it's a closing bracket :
            //      - Stack can't be empty (means no opening bracket has been inserted)
            //      - Stack's peek has to match this bracket
            if (bracket !in matches.keys || stack.isEmpty() || stack.peek() != matches[bracket]) {
                return false
            }

            stack.pop()
        }

        return stack.isEmpty()
    }
}