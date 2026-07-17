class Solution {
    public List<String> generateParenthesis(int n) {
        // code here
        ArrayList<String> ans = new ArrayList<>();
        backtrack(ans, "", 0, 0, n);
        return ans;
    }

    private void backtrack(ArrayList<String> ans, String curr, int open, int close, int n) {
        // Base case
        if (curr.length() == 2 * n) {
            ans.add(curr);
            return;
        }

        // Add '(' if we still have opening brackets left
        if (open < n) {
            backtrack(ans, curr + "(", open + 1, close, n);
        }

        // Add ')' only if it keeps the string valid
        if (close < open) {
            backtrack(ans, curr + ")", open, close + 1, n);
        }
        
    }
}