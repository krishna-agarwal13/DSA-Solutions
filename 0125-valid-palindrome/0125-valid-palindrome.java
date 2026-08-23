class Solution {
    public boolean isPalindrome(String str) {
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = "";
        for (int i = cleaned.length() - 1; i >= 0; i--) {
            reversed = reversed + cleaned.charAt(i);
        }

        if (cleaned.equals(reversed)) {
            return true;
        }
        else{
            return false;
        }
    }
}

