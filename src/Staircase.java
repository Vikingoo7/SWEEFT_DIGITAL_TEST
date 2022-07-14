public class Staircase {
    public static void main(String[] args) {
        int result = countVariants(3);
        System.out.println(result);
    }

    public static int countVariants(int stairsCount) {


        int[] array = new int[stairsCount + 1];
        array[0] = 1;
        array[1] = 1;

        for(int i = 2; i <= stairsCount; i++) {
            array[i] = array[i-1] + array[i-2];
        }
        return array[stairsCount];



    }
}
