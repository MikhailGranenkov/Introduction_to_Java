package Dz.Dz4;

import java.util.ArrayDeque;
import java.util.Deque;

public class Calculator {
    private Deque<Double> history; // История операций калькулятора

    // Конструктор класса Calculator
    public Calculator() {
        history = new ArrayDeque<>();
    }

    // Метод для выполнения операций калькулятора
    public double calculate(char op, double a, double b) {
        double result;
        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b == 0) {
                    System.err.println("Error: Division by zero");
                    return 0; // В случае деления на ноль возвращаем 0
                }
                result = a / b;
                break;
            case '<':
                if (history.size() < 2) return 0; // Если в истории менее двух результатов, возвращаем 0
                history.pop(); // Удаляем последний результат
                result = history.peek(); // Получаем предпоследний результат
                break;
            default:
                throw new IllegalArgumentException("Unsupported operation: " + op);
        }
        history.push(result); // Добавляем результат операции в историю
        return result;
    }
}

// Класс для проверки результатов работы калькулятора
class CalculatorApp {
    public static void main(String[] args) {
        double a, b, c, d;
        char op, op2, undo;

        // Проверяем, были ли переданы аргументы командной строки
        if (args.length == 0) {
            // Если нет, то устанавливаем значения по умолчанию
            a = 3;
            op = '+';
            b = 7;
            c = 4;
            op2 = '+';
            d = 7;
            undo = '<';
        } else {
            // Если были переданы аргументы командной строки, устанавливаем их значения
            a = Double.parseDouble(args[0]);
            op = args[1].charAt(0);
            b = Double.parseDouble(args[2]);
            c = Double.parseDouble(args[3]);
            op2 = args[4].charAt(0);
            d = Double.parseDouble(args[5]);
            undo = args[6].charAt(0);
        }

        Calculator calculator = new Calculator();
        // Выполняем первую операцию
        double result = calculator.calculate(op, a, b);
        System.out.println(result);
        // Выполняем вторую операцию
        double result2 = calculator.calculate(op2, c, d);
        System.out.println(result2);
        // Отменяем последнюю операцию
        double prevResult = calculator.calculate(undo, 0, 0);
        System.out.println(prevResult);
    }
}
