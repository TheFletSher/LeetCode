public class leet4 {
    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println();
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0, index1 = 0, index2 = 0;

        int length1 = nums1.length, length2 = nums2.length;

        int[] nums = new int[length1 + length2];


        while (index1 < length1 && index2 < length2) {
            if (nums1[index1] < nums2[index2]) {
                nums[i++] = nums1[index1++];
            } else {
                nums[i++] = nums2[index2++];
            }
        }

        if (index1 == length1) {
            while (index2 < length2) nums[i++] = nums2[index2++];
        } else {
            while (index1 < length1) nums[i++] = nums1[index1++];
        }

        double median = 0; 
        int fullLength = length1 + length2, index = (fullLength - 1) / 2;

        if (((fullLength) % 2) == 1) {
            median = nums[index];
        } else {
            median = (nums[index] + nums[index + 1]) / (double) 2;
        }


        return median;
    }
}
