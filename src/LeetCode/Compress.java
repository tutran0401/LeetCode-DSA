package LeetCode;

public class Compress {
    public int compress(char[] chars) {
        int index = 0; // vị trí ghi kết quả
        int i = 0;// biến chạy

        while (i < chars.length) {
            // tạo 2 biến 1 là biến vị trí xét kí tự và 1 biến đếm số lần xuất hiện
            char currentChar = chars[i];
            int count = 0;

            // đếm số lần xuất hiện
            //dùng vòng lặp while để đếm số lần
            // nếu kí tự tại i =  biến vị trí xét kí tự
            // tăng i lên 1 (xét kí tự tiếp theo) && tăng biến đếm lên 1
            // ví dụ "aaabbb" khi i ={0,1,2} thì biến đếm +1
            while (i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }

            // ghi ký tự
            // khi nó không bằng ví dụ chars[2] khác chars[3](a !=b)
            // thì cập nhật biến vị trí của kí tự  khác cụ thể là "b"
            // lưu ý là sửa luôn vào mảng chars ex: khi đếm xong thì
            //xét chars[index] = biến chạy;
            // xong sau đó ghi số lần xuất hiện
            // khi đó chars là a3abbb
            // nhưng biến i đang ở chỗ b
            // sau khi đếm b và lấy vị trí của nó thì cập nhật và chỗ a vì
            //lúc đó biến index đang ở vị trí 3 của a3
            // khi index++ nó sẽ là chỗ a và thay vào b
            //kết quả thu được sẽ là a3b3b
            // trả ra index thì nó chỉ là 4
            //vì index dừng ở 4
            chars[index++] = currentChar;

            // nếu count > 1 thì ghi số
            //nếu biến đếm lớn hơn 1 thì thêm nó vào mảng chars truyền vào
            // khi đó nó sẽ là a3b3b
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[index++] = c;
                }
            }
        }
        return index;
    }

}
