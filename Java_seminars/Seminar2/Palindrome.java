package Seminar2;

public class Palindrome {
    

// Задача 3.
// Напишите метод, который принимает на вход строку (String) и
// определяет является ли строка палиндромом (возвращает
// boolean значение).


    public static void main(String[] args) {
        String str = "qwerty ytrewq";
        System.out.println(isPalindrom(str));
    }

    public static boolean isPalindrom(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;

    }
}