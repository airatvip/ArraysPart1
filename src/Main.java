import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }


    public static void task1() {
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;

        int[] year = new int[5];
        year[0] = 35;
        year[1] = 29;
        year[2] = 23;
        year[3] = 47;
        year[4] = 52;

    }

    public static void task2() {
        System.out.println(" Задача 2");
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        int i = 0;
        while (i < weight.length) {
            if (i < weight.length - 1) {
                System.out.print(weight[i] + ",");
                i++;
            } else {
                System.out.print(weight[i]);
                i++;
            }
        }
        System.out.println();

        double[] test = {1.57, 7.654, 9.986};
        for (int j = 0; j < test.length; j++) {
            if (j < test.length - 1) {
                System.out.print(test[j] + ",");
            } else {
                System.out.print(test[j]);
            }
        }
        System.out.println();

        int[] year = new int[5];
        year[0] = 35;
        year[1] = 29;
        year[2] = 23;
        year[3] = 47;
        year[4] = 52;
        System.out.print(Arrays.toString(year));
        System.out.println();

    }

    public static void task3() {
        System.out.println(" Задача 3");
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        int i = weight.length - 1;
        while (i >= 0) {
            System.out.print(weight[i] + ",");
            i--;
        }
        System.out.println();

        double[] test = {1.57, 7.654, 9.986};
        for (int j = weight.length - 1; j >= 0; j--) {
            System.out.print(test[j] + ",");
        }
        System.out.println();

        int[] year = new int[5];
        year[0] = 35;
        year[1] = 29;
        year[2] = 23;
        year[3] = 47;
        year[4] = 52;
        for (int x = year.length - 1; x >= 0; x--) {
            System.out.print(year[x] + ",");
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println(" Задача 4");
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        int i = 0;
        while (i < weight.length) {
            if (weight[i] %2 != 0) {
                weight[i] = weight[i] + 1;}
            System.out.print( weight[i] + ", ");
            i++;
        }
    }

}



