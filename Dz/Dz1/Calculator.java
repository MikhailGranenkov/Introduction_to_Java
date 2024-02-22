package Dz.Dz1;

// Реализуйте простой калькулятор.
// В методе calculate класса Calculator реализовать калькулятор,
// который будет выполнять математические операции (+, -, *, /)
// над двумя целыми числами и возвращать результат вещественного типа.
// В классе Printer необходимо реализовать проверку переданного оператора,
// при некорректном операторе программа должна вывести сообщение
// об ошибке "Некорректный оператор: 'оператор'".

import java.util.Scanner;

public class Calculator {
    
    public double calculate(int num1, char operator, int num2) {
        double result = 0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = (double) num1 / num2;
                } else {
                    System.out.println("Ошибка: деление на ноль");
                }
                break;
            default:
                System.out.println("Некорректный оператор: '" + operator + "'");
        }
        return result;
    }
}

class Printer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Введите оператор (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();
        
        Calculator calc = new Calculator();
        double result = calc.calculate(num1, operator, num2);
        System.out.println("Результат: " + result);
        
        scanner.close();
    }
}
