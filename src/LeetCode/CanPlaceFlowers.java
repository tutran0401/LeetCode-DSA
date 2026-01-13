package LeetCode;

public class CanPlaceFlowers {
    /**
     * Bài toán: Cho một mảng flowerbed gồm 0 và 1.
     * - 0: ô trống (chưa có hoa)
     * - 1: ô đã có hoa
     * Quy tắc: Không được trồng hoa ở hai ô liền kề.
     * <p>
     * Nhiệm vụ: Kiểm tra xem có thể trồng thêm n bông hoa mới
     * vào flowerbed mà vẫn tuân thủ quy tắc hay không.
     * <p>
     * Ý tưởng giải:
     * 1. Duyệt qua từng ô trong mảng.
     * 2. Nếu ô hiện tại là 0:package LeetCode;
     * <p>
     * public class CanPlaceFlowers {
     * /**
     * * Bài toán: Cho một mảng flowerbed gồm 0 và 1.
     * * - 0: ô trống (chưa có hoa)
     * * - 1: ô đã có hoa
     * * Quy tắc: Không được trồng hoa ở hai ô liền kề.
     * *
     * * Nhiệm vụ: Kiểm tra xem có thể trồng thêm n bông hoa mới
     * * vào flowerbed mà vẫn tuân thủ quy tắc hay không.
     * *
     * * Ý tưởng giải:
     * * 1. Duyệt qua từng ô trong mảng.
     * * 2. Nếu ô hiện tại là 0:
     * *    - Kiểm tra ô bên trái (i-1) và ô bên phải (i+1).
     * *    - Nếu cả hai đều là 0 hoặc không tồn tại (biên mảng),
     * *      thì có thể trồng hoa tại ô này.
     * * 3. Khi trồng hoa:
     * *    - Giảm n đi 1.
     * *    - Đánh dấu ô đó thành 1 để tránh trồng tiếp liền kề.
     * * 4. Nếu n giảm về 0 → return true.
     * * 5. Nếu duyệt hết mảng mà n > 0 → return false.
     * *
     * * Độ phức tạp:
     * * - Thời gian: O(m) với m là độ dài mảng.
     * * - Không gian: O(1).
     */

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                boolean checkLeft = (i == 0 || flowerbed[i - 1] == 0);
                boolean checkRight = (i == flowerbed.length - 1 || flowerbed[i + 1] == 0);
                if (checkLeft && checkRight) {
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }
        return n <= 0;
    }
//    public  boolean checkFlower()
}
