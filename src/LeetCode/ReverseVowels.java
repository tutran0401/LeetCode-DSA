package LeetCode;

public class ReverseVowels {

    /**
     * Bài toán:
     * Cho một chuỗi s.
     * Nhiệm vụ là đảo ngược thứ tự các nguyên âm (vowels)
     * trong chuỗi mà vẫn giữ nguyên vị trí các phụ âm.
     *
     * Nguyên âm gồm:
     * a, e, i, o, u (cả chữ hoa và chữ thường)
     *
     * Ví dụ:
     * Input : "hello"
     * Output: "holle"
     *
     * Ý tưởng giải (Two Pointers):
     * 1. Dùng hai con trỏ left và right bắt đầu từ hai đầu chuỗi.
     * 2. Nếu ký tự bên trái không phải nguyên âm → left++.
     * 3. Nếu ký tự bên phải không phải nguyên âm → right--.
     * 4. Nếu cả hai đều là nguyên âm → hoán đổi và dịch cả hai con trỏ.
     * 5. Lặp lại cho đến khi left >= right.
     *
     * Độ phức tạp:
     * - Thời gian: O(n), với n là độ dài chuỗi.
     * - Không gian: O(n), do sử dụng mảng char.
     */
    public String reverseVowels(String s) {

        // Chuyển String sang mảng char vì String là immutable
        char[] a = s.toCharArray();

        int left = 0;
        int right = a.length - 1;

        while (left < right) {

            // Bỏ qua ký tự không phải nguyên âm ở bên trái
            if (!isVowel(a[left])) {
                left++;

                // Bỏ qua ký tự không phải nguyên âm ở bên phải
            } else if (!isVowel(a[right])) {
                right--;

                // Cả hai đều là nguyên âm → hoán đổi
            } else {
                char temp = a[left];
                a[left] = a[right];
                a[right] = temp;

                left++;
                right--;
            }
        }

        // Chuyển mảng char về String
        return new String(a);
    }

    /**
     * Kiểm tra một ký tự có phải nguyên âm không
     */
    public boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
