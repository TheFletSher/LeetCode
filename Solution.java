// class Solution {
//     public static void main(String[] args) {
//         System.out.println(findKthNumber(10, 3));
//     }

//     public static int findKthNumber(int n, int k) {
//         if (k == 1) {
//             return 1;
//         } else if (n < 10) {
//             return k;
//         }

//         int groups = String.valueOf(n).length();
//         System.out.println(groups);

//         int lastGroup = (int) (n / (Math.pow(10, groups - 1)));
//         System.out.println(lastGroup);

//         int sizeCheck = 0;
//         for (int i = 0; i < groups; i++) {
//             int groupSize = (int) Math.pow(10, i);
//             sizeCheck += groupSize;
//         }

//         if (n % sizeCheck == 0) {
//             lastGroup = -1;
//         }

//         int size = 0, currSize = 0, i = 0, startNum = 1, result = 10;
//         while (true) {
//             // reset once it reaches group size
//             if (i == groups) {
//                 i = 0;
//                 startNum++;
//             }

//             // size of group
//             int groupSize = (int) Math.pow(10, i);

//             // find area where k lies
//             if (size < k) {
//                 // on last group of starting number
//                 if (startNum == lastGroup && i == groups) {
//                     System.out.println(lastGroup + ", " + i);
//                     size += n - (groupSize * startNum) + 1;
//                     lastGroup--;
//                     groups--;

//                 // adding group size
//                 } else {
//                     size += groupSize;
//                 }

//                 // current size over group max size
//                 if (currSize > Math.pow(10, groups)) {
//                     currSize = groupSize;
//                 } else {
//                     currSize += groupSize;
//                 }

//             } else {
//                 // Result is the start number times the current size, add the current size subtracted from k minus 1
//                 result = (startNum * groupSize) + (k - currSize - 1);
//                 break;
//             }
//             System.out.println(size + ", " + currSize + ", " + i + ", " + startNum + ", " + groupSize);
//             i++;
//         }
        

//         return result;
//     }
// }