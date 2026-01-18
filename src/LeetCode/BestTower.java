package LeetCode;

public class BestTower {

    /**
     * Hàm tìm tower tốt nhất có thể với tới được
     *
     * towers[i] = [xi, yi, qi]
     *   xi, yi : tọa độ của tower
     *   qi     : chất lượng (quality)
     *
     * center = [cx, cy] : vị trí hiện tại của bạn
     * radius : bán kính cho phép (theo Manhattan distance)
     *
     * Yêu cầu:
     *  - Chỉ xét những tower có distance <= radius
     *  - Chọn tower có quality lớn nhất
     *  - Nếu quality bằng nhau → chọn tọa độ nhỏ hơn theo lexicographic
     *  - Nếu không có tower nào hợp lệ → trả về [-1, -1]
     */
    public int[] bestTower(int[][] towers, int[] center, int radius) {

        // Lưu kết quả cuối cùng
        // Mặc định nếu không tìm được tower nào hợp lệ
        int[] result = {-1, -1};

        // Lưu quality lớn nhất đã gặp
        // Dùng MIN_VALUE để tránh lỗi khi quality = 0 hoặc âm
        int maxQuality = Integer.MIN_VALUE;

        // Duyệt từng tower
        for (int[] tower : towers) {

            // Tính khoảng cách Manhattan từ tower đến center
            int dist = distanceTower(tower, center);

            // Chỉ xét tower nằm trong bán kính cho phép
            if (dist <= radius) {

                // Nếu quality lớn hơn quality tốt nhất hiện tại
                if (tower[2] > maxQuality) {

                    // Cập nhật quality lớn nhất
                    maxQuality = tower[2];

                    // Cập nhật tọa độ kết quả
                    result = new int[]{tower[0], tower[1]};
                }

                // Nếu quality bằng nhau → so lexicographic
                else if (tower[2] == maxQuality) {

                    // Chọn tower có tọa độ nhỏ hơn
                    result = checkManhattan(
                            result,
                            new int[]{tower[0], tower[1]}
                    );
                }
            }
        }

        // Trả về tower tốt nhất tìm được
        return result;
    }

    /**
     * Tính Manhattan distance giữa tower và center
     *
     * |x1 - x2| + |y1 - y2|
     */
    public int distanceTower(int[] tower, int[] center) {
        return Math.abs(center[0] - tower[0])
                + Math.abs(center[1] - tower[1]);
    }

    /**
     * So sánh 2 tọa độ theo thứ tự từ điển (lexicographical)
     *
     * [x1, y1] < [x2, y2] nếu:
     *   - x1 < x2
     *   - hoặc x1 == x2 và y1 < y2
     *
     * Trả về tọa độ nhỏ hơn
     */
    public int[] checkManhattan(int[] tower1, int[] tower2) {

        if (tower2[0] < tower1[0]
                || (tower2[0] == tower1[0]
                && tower2[1] < tower1[1])) {
            return tower2;
        }

        return tower1;
    }
}
