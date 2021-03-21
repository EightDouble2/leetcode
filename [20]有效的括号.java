//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。 
//
// 有效字符串需满足： 
//
// 
// 左括号必须用相同类型的右括号闭合。 
// 左括号必须以正确的顺序闭合。 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "()"
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：s = "()[]{}"
//输出：true
// 
//
// 示例 3： 
//
// 
//输入：s = "(]"
//输出：false
// 
//
// 示例 4： 
//
// 
//输入：s = "([)]"
//输出：false
// 
//
// 示例 5： 
//
// 
//输入：s = "{[]}"
//输出：true 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 104 
// s 仅由括号 '()[]{}' 组成 
// 
// Related Topics 栈 字符串 
// 👍 2243 👎 0


import java.util.*;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isValid(String s) {
        // 特殊情况：字符串总长度为单数
        if (s.length() % 2 == 1) {
            return false;
        }

        Map<Character, Character> brackets = new HashMap<>();
        brackets.put(')', '(');
        brackets.put(']', '[');
        brackets.put('}', '{');

        // 利用栈存储左括号
        Stack<Character> stack = new Stack<>();
        // 遍历每一个字符
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // 判断字符是不是括号
            if (brackets.containsKey(c)) {
                // 当字符为右括号，栈为空或栈顶的左括号无法匹配，则失败
                if (stack.isEmpty() || stack.peek() != brackets.get(c)) {
                    return false;
                }
                // 否则弹出栈顶的左括号
                stack.pop();
            }
            // 左括号直接压入栈顶
            else {
                stack.push(c);
            }
        }

        // 若最后栈为空则判断成功
        return stack.isEmpty();
    }
}
//leetcode submit region end(Prohibit modification and deletion)
