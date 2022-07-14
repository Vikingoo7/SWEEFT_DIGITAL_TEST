public class MinSplit {

    public static void main(String[] args) {
        int result = minSplit(150);
        System.out.println(result);
    }

    public static int minSplit(int amount) {
        int count = 0;

        while(amount > 0) {
            if(amount - 50 >= 0) {
                amount -= 50;
                count++;
            } else if(amount - 20 >= 0) {
                amount -= 20;
                count++;
            } else if(amount - 10 >= 0) {
                amount -= 10;
                count++;
            } else if(amount - 5 >= 0) {
                amount -= 5;
                count++;
            } else {
                amount -= 1;
                count++;
            }

        }

        return count;

    }

}
