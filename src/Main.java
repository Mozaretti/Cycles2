public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1(){
        System.out.println("Задача 1");
        int sum2 = 15000;
        int sum = 0;
        int month = 1;
        while (sum <= 2_459_000){
            sum = sum + sum2;
            System.out.println("Месяц"+ month +" , сумма накоплений равна"+ sum + " рублей");
            month++;
        }
        System.out.println();
    }
    public static void task2(){
        System.out.println("Задача 2");
        int num = 1;
        while (num <= 10){
            System.out.print(num++ + " " );
            }
        System.out.println();
        int number = 10;
        for (int i = 10; i >= 1; i = i - 1){
            System.out.print(i + " ");
        }
        System.out.println();

    }
    public static void task3(){
        System.out.println("Задача 3");
    }
}