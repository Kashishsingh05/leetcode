class Solution {
    public int totalNumbers(int[] digits) {
        Set<Integer> set = new HashSet<>();
        int n = digits.length;

        // Choose the last digit (must be even)
        for (int i = 0; i < n; i++) {

            if (digits[i] % 2 != 0) {
                continue;
            }

            // Choose the middle digit
            for (int j = 0; j < n; j++) {

                if (i == j) {
                    continue;
                }

                // Choose the first digit
                for (int k = 0; k < n; k++) {

                    if (k == i || k == j || digits[k] == 0) {
                        continue;
                    }
                    int number = digits[k] * 100
                               + digits[j] * 10
                               + digits[i];

                    set.add(number);
                }
            }
        }

        return set.size();
    }
}