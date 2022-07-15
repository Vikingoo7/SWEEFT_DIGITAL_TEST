public class SmallestPositiveInteger {
    public static void main(String[] args) {
        int[] array = {5, 1, -3, 4, 8, 90, 120, -43};
        int result = notContains(array);
        System.out.println(result);
    }


    public static int notContains(int[] array) {
        int n = array.length;
        boolean hasOne = false;

//        Case when there is no array or the array is empty.
        if (array == null || n == 0) return 1;


//      Convert all the integers that are less than 0 or more than the length of the array to 1 (one);

        for (int i = 0; i < n; i++) {
            if (array[i] == 1) {
                hasOne = true;
            } else if (array[i] <= 0 || array[i] > n) {
                array[i] = 1;
            }
        }

//        Solution Part 1: If the array doesn't contain the number 1 , That's the answer

        if (!hasOne) return 1;

//        Solution Part 2: Making all the positive integers in the array, negative.
        for (int i = 0; i < n; i++) {
            int index = Math.abs(array[i]) - 1; // Making it zero based
            if (array[index] > 0) array[index] = -1 * array[index]; // Flipping the Sign
        }

//        Solution Part 3:
        for (int i = 0; i < n; i++) {
            if (array[i] > 0) {
                return i + 1;
            }
        }
        return n + 1; // If not found in the array, the smallest missing integer will be the next [1,2,3] -> 4.
    }

}
