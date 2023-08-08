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

    public static void task1() {
        System.out.println("Задача 1");

        int[] salary = generateRandomArray();
        int sum = 0;

        for (int i = 0; i < salary.length; i++) {
            sum += salary[i];
        }

        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {
        System.out.println("Задача 2");

        int[] salary = generateRandomArray();
        int sum = 0;
        int min = salary[0];
        int max = salary[0];

        for (int i = 1; i < salary.length; i++) { // начинаем с индекса 1, так как уже взяли первый элемент
            if (salary[i] < min) {
                min = salary[i];
            }

            if (salary[i] > max) {
                max = salary[i];
            }
        }

        System.out.println("Минимальная сумма трат за день составила " + min + " рублей.");
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей.");

    }

    public static void task3() {
        System.out.println("Задача 3");

        int[] salary = generateRandomArray();
        int sum = 0;

        for (int i = 0; i < salary.length; i++) {
            sum += salary[i];     //сумма трат за месяц
        }

        double average = (double) sum / 30;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");

    }

    public static void task4() {
        System.out.println("Задача 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char k= 0;
        for (int i = reverseFullName.length -1 ; i >= 0; i--) {
            k = reverseFullName [i];
            System.out.print(reverseFullName [i]);
        }
    }

        }

