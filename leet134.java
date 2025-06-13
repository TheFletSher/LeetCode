public class leet134 {
    public int candy(int[] ratings) {
        int size = ratings.length;

        int total = 0;

        for (int i = 0; i < size - 2; i++ ) {
            int adding = 1;
            while (ratings[i] == ratings[i + 1] && i < size - 2) {
                total += adding;
                i++;
            }
            while (ratings[i] > ratings[i + 1] && i < size - 2) {
                total += adding++;
                i++;
            }
            if (adding != 1) {
                adding = 2;
            }
            while (ratings[i] < ratings[i + 1] && i < size - 2) {
                total += adding++;
                i++;
            }
        }

        if (ratings[size - 1] > ratings[size - 2]) {
            total +=2;
        } else {
            total += 1;
        }

        return total;
    }
}
