//实现 strStr() 函数。 
//
// 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如
//果不存在，则返回 -1。 
//
// 示例 1: 
//
// 输入: haystack = "hello", needle = "ll"
//输出: 2
// 
//
// 示例 2: 
//
// 输入: haystack = "aaaaa", needle = "bba"
//输出: -1
// 
//
// 说明: 
//
// 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。 
//
// 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。 
// Related Topics 双指针 字符串 
// 👍 749 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int strStr(String haystack, String needle) {
        // 特殊情况：needle长度为0
        if (needle.length() == 0) {
            return 0;
        }
        // 遍历haystack每一个字符，直到能匹配的最后一个字符
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            // 遍历到的字符，与needle首字符匹配，则截取之后的字符串进行比较，若匹配成功则返回下标
            if (haystack.charAt(i) == needle.charAt(0) && haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
