package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class leetcode77 {
    public static void main(String[] args) {
        int n = 4;
        int k = 2;
        Solution solution = new Solution();
        System.out.println(solution.combine(n, k));
    }
}

class Solution {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> combine(int n, int k) {
        combineHelper(n, k, 1);
        return result;
    }

    private void combineHelper(int n, int k, int startIndex) {
        if (path.size() == k) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex; i <= n - (k - path.size()) + 1; i++) {
            path.add(i);
            combineHelper(n, k, i + 1);
            path.removeLast();
        }
    }
}
