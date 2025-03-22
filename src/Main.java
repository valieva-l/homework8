import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Задача 1.1
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        System.out.println(weight[0]);
        System.out.println(weight[1]);
        System.out.println(weight[2]);
        // Задача 1.2
        double[] flowers = {1.57, 7.654, 9.986};
        System.out.println(flowers[0]);
        System.out.println(flowers[1]);
        System.out.println(flowers[2]);
        // Задача 1.3
        int[] paints = {35, 9, 4, 0, 0, 0, 0, 0};
        for (int i = 0; i < 8; i++) {
            System.out.println(paints[i]);
        }
        // Задача 2
        int[] candyBox = new int[5];
        candyBox[0] = 8;
        candyBox[4] = 2;
        System.out.println(Arrays.toString(candyBox));

        // Задача 3.1
        int[] avengers = new int[3];
        avengers[0] = 1;
        avengers[1] = 2;
        avengers[2] = 3;
        for (int i = avengers.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(avengers[i] + ", ");
            } else {
                System.out.println(avengers[i] + " ");
            }
        }
        //Задача 3.2
        double[] numbers = {1.57, 7.654, 9.986};
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(numbers[i] + ", ");
            } else {
                System.out.println(numbers[i] + " ");
            }
        }
        // Задача 4
        int[] weightOne = new int[3];
        weightOne[0] = 1;
        weightOne[1] = 2;
        weightOne[2] = 3;
        for (int i = 0; i < weightOne.length; i++) {
            while (weightOne[i] % 2 == 1) {
                weightOne[i] = weightOne[i] + 1;
            }
        }
        System.out.println(Arrays.toString(weightOne));

    }
}
