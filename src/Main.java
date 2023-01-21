public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] number = new int[3];
        for (int i = 0; i < number.length; i++) {
            number[i] = i + 1;
            System.out.println(number[i]);
        }
        double[] fractionalNumber = {1.57, 7.654, 9.986};
        for (int i = 0; i < fractionalNumber.length; i++) {
            System.out.println(fractionalNumber[i]);
        }
        char[] chars = new char[3];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = 'A';
            System.out.println(chars[i]);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] number = new int[3];
        for (int i = 0; i < number.length; i++) {
            number[i] = i + 1;
            System.out.print(number[i]);
            if (i != number.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        double[] fractionalNumber = {1.57, 7.654, 9.986};
        for (int i = 0; i < fractionalNumber.length; i++) {
            System.out.print(fractionalNumber[i]);
            if (i != fractionalNumber.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        char[] chars = new char[3];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = 'A';
            System.out.print(chars[i]);
            if (i != chars.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();


    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] number = new int[3];
        for (int i = number.length - 1; i >= 0; i--) {
            number[i] = i + 1;
            System.out.print(number[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
        System.out.println();
        double[] fractionalNumber = {1.57, 7.654, 9.986};
        for (int i = fractionalNumber.length - 1; i >= 0; i--) {
            System.out.print(fractionalNumber[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
        System.out.println();
        char[] chars = {'a', 'b', 'c'};
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            if (arr[i] % 2 != 0) {
                arr[i] += 1;
                System.out.print(arr[i]);
                if (i != arr.length-2) {
                System.out.print(",");
                }
            }
        }
    }
}


