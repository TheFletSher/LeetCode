public class leet11 {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int max = 0;
        while (right - left > 0) {
            int minHeight = Math.min(height[left], height[right]);
            int area = minHeight * (right - left);
            if (area > max) {
                max = area;
            }
            if (height[left] == minHeight) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }
}
