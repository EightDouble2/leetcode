//给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。 
//
// 如果反转后整数超过 32 位的有符号整数的范围 [−231, 231 − 1] ，就返回 0。 
//假设环境不允许存储 64 位整数（有符号或无符号）。
//
// 
//
// 示例 1： 
//
// 
//输入：x = 123
//输出：321
// 
//
// 示例 2： 
//
// 
//输入：x = -123
//输出：-321
// 
//
// 示例 3： 
//
// 
//输入：x = 120
//输出：21
// 
//
// 示例 4： 
//
// 
//输入：x = 0
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// -231 <= x <= 231 - 1 
// 
// Related Topics 数学 
// 👍 2610 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int reverse(int x) {
        int ans = 0;
        while (x != 0) {
            // 源数不断弹出最后一个数子放入目标数末尾
            int rem = x % 10;
            x /= 10;
            // 7或-8是因为最大值2的31次方是2147483648，最小值负2的31次方减一是-2147483647，这两个数值的个位数是7和-8。
            if (ans > Integer.MAX_VALUE/10 || (ans == Integer.MAX_VALUE / 10 && rem > 7)) return 0;
            if (ans < Integer.MIN_VALUE/10 || (ans == Integer.MIN_VALUE / 10 && rem < -8)) return 0;
            ans = ans * 10 + rem;
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
