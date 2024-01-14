
public class Reverse_Words_in_a_String_III_557 {

    public String reverseWords(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }

        int n = s.length();
        int i = 0;
        int j = 0;
        char[] charArray = s.toCharArray();

        while (j < n) {
            while (j < n && charArray[j] == ' ') {
                j++; // Skip consecutive spaces
            }

            if (j == n) {
                break; // Avoid reversing extra characters at the end
            }

            i = j;
            while (j < n && charArray[j] != ' ') {
                j++;
            }

            reverse(charArray, i, j - 1);
        }

        return String.valueOf(charArray);
    }

    private void reverse(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
