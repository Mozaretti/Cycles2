public class Main {
    public static void main(String[] args) {
       task1();
       task2();
       task3();
       task4();
       task5();
       task6();
       task7();
       task8();
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
        int population = 12_000_000;
        int fertilityPopulation = population * 17 / 1000;
        int deadPopulation = population * 8 / 1000;
        for (int year = 1; year <= 10; year = year + 1){
            population = population + (fertilityPopulation - deadPopulation);
            System.out.println("Год " + year + " , численность населения составляет "+ population);
        }

    }

    public static void task4(){
        System.out.println("Задача 4");
        int sum = 15000;
        int month = 1;
        while (sum < 12_000_000){
            sum = sum + sum * 7 / 100;
            System.out.println("Месяц " + month + " , сумма ." + sum);
            month++;
        }
        System.out.println();
    }
    public static void task5() {
        System.out.println("Задача 5");
        int sum = 15000;
        int month = 1;
        while (sum < 12_000_000){
            sum = sum + sum * 7 / 100;
            month++;
            if (month % 6 == 0) {
                System.out.print("Месяц " + month + " , сумма " + sum);
                System.out.println();
            }
        }
        System.out.println(month + " суммарное количество месяцев");
        System.out.println();
    }
    public static void task6(){
        System.out.println("Задача 6");
        {
            int sum = 15000;
            int month = 0;
            while (month < 9 * 12) {
                sum = sum + sum * 7 / 100;
                month++;
                if (month % 6 == 0) {
                    System.out.print("Месяц " + month + " , сумма " + sum);
                    System.out.println();
                }
            }
        }
        System.out.println();
    }
    public static void task7(){
        System.out.println("Задача 7");
        int friday = 3;
        for (friday = 3;friday <=31; friday = friday + 7)
            System.out.println("Сегодня пятница, " + friday +" -е число. Необходимо подготовить отчет");
        System.out.println();
    }
    public static void task8(){
        System.out.println("Задача 8");
        int totalEayr = 2023 - 200;
        int totalEyarEnd = 2023 + 100;
        for (int eyar = totalEayr; eyar <= totalEyarEnd; eyar ++){
            if (eyar % 79 == 0)
            System.out.println(eyar);

        }
    }

}