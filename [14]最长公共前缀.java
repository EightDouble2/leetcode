//编写一个函数来查找字符串数组中的最长公共前缀。 
//
// 如果不存在公共前缀，返回空字符串 ""。 
//
// 
//
// 示例 1： 
//
// 
//输入：strs = ["flower","flow","flight"]
//输出："fl"
// 
//
// 示例 2： 
//
// 
//输入：strs = ["dog","racecar","car"]
//输出：""
//解释：输入不存在公共前缀。 
//
// 
//
// 提示： 
//
// 
// 0 <= strs.length <= 200 
// 0 <= strs[i].length <= 200 
// strs[i] 仅由小写英文字母组成 
// 
// Related Topics 字符串 
// 👍 1510 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestCommonPrefix(String[] strs) {
        // 特殊情况：数组为空
        if (strs == null || strs.length == 0) {
            return "";
        }
        // 遍历第一个字符串的每一个字符
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            // 遍历之后的每一个字符串
            for (int j = 1; j < strs.length; j++) {
                // 如果遍历的字符串长度不足，或者当前字符不匹配，则之前遍历的所有字符为最大公共前缀
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }
        // 遍历结束则第一个字符串就是最大公共前缀
        return strs[0];
    }
}
//leetcode submit region end(Prohibit modification and deletion)
