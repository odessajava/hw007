package com.company;
import java.util.Scanner;

public class Main {

    public static Scanner scannerInt = new Scanner(System.in);

    public static void main(String[] args) {
        First();



    }
    public static void First(){
        // Переменніе с индексами 4-6 для промежуточніх значений.
        int n1=0;
        int n2=0;
        int n3=0;
        int n4=0;
        int n5=0;
        int n6=0;
        int d1=1;
        int d2=1;
        int d3=1;
        int d4=1;
        int d5=1;
        int d6=1;

        int[] arr={1,1};

        Fraction fraction=new Fraction();

        System.out.println("Первая дробь.");
        System.out.println("Введите числитель.");
        n1=inputNumber();
        System.out.println("Введите знаменатель.");
        d1=inputNumber();
        System.out.println("Введена дробь " + n1 + "/" + d1);

        System.out.println("Вторая дробь.");
        System.out.println("Введите числитель.");
        n2=inputNumber();
        System.out.println("Введите знаменатель.");
        d2=inputNumber();
        System.out.println("Введена дробь " + n2 + "/" + d2);

        System.out.println("Третья дробь.");
        System.out.println("Введите числитель.");
        n3=inputNumber();
        System.out.println("Введите знаменатель.");
        d3=inputNumber();
        System.out.println("Введена дробь " + n3 + "/" + d3);


        //Сложение дробей в первых скобках
        arr=fraction.plus(n1,d1,n2,d2);
        n4=arr[0];
        d4=arr[1];

        //Сложение дробей во вторых скобках
        arr=fraction.plus(n1,d1,n3,d3);
        n5=arr[0];
        d5=arr[1];

        //Умножение дробей
        arr=fraction.multi(n4,d4,n5,d5);
        n6=arr[0];
        d6=arr[1];

        System.out.println("Результирующая дробь:");
        System.out.println("" + n6 + "/" + d6);
        System.out.println("Обратная дробь:");
        System.out.println("" + d6 + "/" + n6);
            }
    public static int inputNumber() {
        int number;
        while (!scannerInt.hasNextInt()) {
            System.out.println("Введите целое число!");
            scannerInt.next();
        }
        number = scannerInt.nextInt();
        return number;
    }
    /*
    public static int inputNumberNul() {
        int number;
        while (!scannerInt.hasNextInt() && scannerInt.nextInt()==0) {
            System.out.println("Введите целое число, отличное от нуля!");
            scannerInt.next();
        }
        number = scannerInt.nextInt();
        return number;
        }
        */

    }

