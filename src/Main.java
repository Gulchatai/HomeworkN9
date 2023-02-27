import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public  static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        int amount = 0;
        for (int element : arr) {
            amount += element;
        }
        System.out.println("Сумма трат за месяц составила " + amount + " рублей.");
    }
    public  static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        int min = arr[0];
        int max = arr[0];
        for (int element : arr) {
            if (element < min) {
                min = element;
            } else if (element > max) {
                max = element;
            }
        }
            System.out.println("Минимальная сумма трат за день составила " + min + " рублей.");
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей.");
        }
    public  static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        int amount = 0;
        for (int element : arr) {
            amount += element;
        }
        double mediumAmount = amount / 30;
        System.out.println("Средняя сумма трат за день составила " + mediumAmount + " рублей.");
        }
    public  static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        System.out.println(Arrays.toString(reverseFullName));
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(reverseFullName[i]);
                break;
            }
            System.out.print(reverseFullName[i]);
        }
    }
    }


