package Seminar1;

import java.time.LocalDateTime;

// Настроить проект, вывести в консоль “Hello world!”.
// Вывести в консоль системные дату и время.
public class HelloWorldDate {
    public static void main(String[] args) {
        System.out.println("Hello world");

        //Date
        //Caledar

        System.out.println(LocalDateTime.now());

        int num = 3;
        double d = 4.6;
        String s = "Hello!";
        char c = 't';
        boolean b = true;

        int[] array = new int[6];
        int[] array1 = {5, 5, 8, 3, 43, 7, -56 };
        int array2[] = new int[9];

        for (int i = 0; i < array.length; i++) {
            System.out.println(array1[i]);
        }

    }
}   

