import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    // Объявить метод «сгенерироватьМассив»
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray(); // объявление массива и вызов метода сгенерироватьМассив
        //System.out.println(Arrays.toString(arr)); прповерка сгенерированного массива
        int amountSpentMonth = 0; // инициализация суммы трат за месяц
        for (int i = 0; i < arr.length; i++) {
            amountSpentMonth = amountSpentMonth + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + amountSpentMonth + " рублей");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray(); // объявление массива и вызов метода сгенерироватьМассив
        //System.out.println(Arrays.toString(arr)); //проверка сгенерированного массива
        int maxSpentDay = 0;
        int minSpentDay = 1_000_000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxSpentDay) {
                maxSpentDay = arr[i];
            }
            {
                if (arr[i] < minSpentDay) {
                    minSpentDay = arr[i];
                }
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSpentDay + " рублей. Максимальная сумма трат за день составила " + maxSpentDay + " рублей.");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray(); // объявление массива и вызов метода сгенерироватьМассив
        //System.out.println(Arrays.toString(arr)); //проверка сгенерированного массива
        float amountSpentAverage = 0;
        for (int i = 0; i < arr.length; i++) {
            amountSpentAverage = (amountSpentAverage + arr[i]);
        }
        System.out.println("Средняя сумма трат за месяц составила " + amountSpentAverage / arr.length + " рублей.");
    }

    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = {'n','a','v','I',' ','v','o','n','a','v','I'};
        for (int i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[reverseFullName.length - 1 - i]);
        }
        }
    }



