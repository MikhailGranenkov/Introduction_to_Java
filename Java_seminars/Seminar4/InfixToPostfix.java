package Seminar4;

// Задание No5 (доп)
// Реализовать алгоритм перевода из инфиксной записи в постфиксную
// для арифметического выражения.
// http://primat.org/news/obratnaja_polskaja_zapis/2016-04-09-1181
// Вычислить запись если это возможно.


// Для перевода арифметического выражения из инфиксной записи в постфиксную
// запись мы можем использовать алгоритм, известный как алгоритм "сортировочной станции"
// или алгоритм "обратной польской записи".

// Построение постфиксной записи:
// Создаем пустой стек операторов.
// Проходим по каждому символу в инфиксной записи слева направо.
// Если символ - операнд (цифра или переменная), добавляем его в выходную строку.
// Если символ - открывающая скобка "(", помещаем его в стек операторов.
// Если символ - закрывающая скобка ")", выталкиваем все операторы из стека до открывающей
// скобки и добавляем их в выходную строку.
// Если символ - оператор:
// Пока стек не пуст и приоритет оператора на вершине стека больше или равен
// приоритету текущего оператора, выталкиваем оператор из стека и добавляем его
// в выходную строку.
// Добавляем текущий оператор в стек.
// После завершения обработки всех символов выталкиваем все операторы из стека
// в выходную строку.
// Вычисление постфиксной записи:
// После того, как мы получили постфиксную запись, мы можем вычислить результат,
// используя стек. Мы проходим по каждому символу в постфиксной записи:

// Если символ - операнд, помещаем его в стек.
// Если символ - оператор, выталкиваем из стека два операнда, выполняем операцию
// и помещаем результат обратно в стек.
// После обработки всех символов в стеке останется один элемент - результат выражения.


import java.util.Stack;

public class InfixToPostfix {
    public static String infixToPostfix(String infixExpression) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> operatorStack = new Stack<>();

        for (char c : infixExpression.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                postfix.append(c);
            } else if (c == '(') {
                operatorStack.push(c);
            } else if (c == ')') {
                while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
                    postfix.append(operatorStack.pop());
                }
                operatorStack.pop(); // Удаляем '(' из стека
            } else { // Если c - оператор
                while (!operatorStack.isEmpty() && precedence(operatorStack.peek()) >= precedence(c)) {
                    postfix.append(operatorStack.pop());
                }
                operatorStack.push(c);
            }
        }

        while (!operatorStack.isEmpty()) {
            postfix.append(operatorStack.pop());
        }

        return postfix.toString();
    }

    private static int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
        }
        return -1;
    }

    public static void main(String[] args) {
        String infixExpression = "a+b*(c-d)/e";
        String postfixExpression = infixToPostfix(infixExpression);
        System.out.println("Постфиксная запись: " + postfixExpression);
    }
}

