package Dz.Dz1;

// Напишите функцию printPrimeNums, которая выведет на экран все простые числа
// в промежутке от 1 до 1000, каждое на новой строке.
// Напишите свой код в методе printPrimeNums класса Answer.


public class Answer2 {

        public static boolean isPrime(int num) {
            if (num < 2) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    
        public static void printPrimeNums() {
            for (int i = 1; i <= 1000; i++) {
                if (isPrime(i)) {
                    System.out.println(i);
                }
            }
        }
    
        public static void main(String[] args) {
            printPrimeNums();
        }
}