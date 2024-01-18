public class Replace_All_Digits_with_Characters_1844 {
    public String replaceDigits(String s) {

        char[] A = s.toCharArray();

        for (int i = 1; i < A.length; i += 2)
            A[i] += (char) (A[i - 1] - '0');

        return String.valueOf(A);
    }
}
