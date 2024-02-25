package Seminar4;

// Задание №3
// 1) Написать метод, который принимает массив элементов, помещает их в стэк
// и выводит на консоль содержимое стэка.

// Пояснения:
// Мы создаем стек, используя класс Stack из пакета java.util.
// Метод pushAndPrintStack принимает массив элементов любого типа.
// В цикле мы помещаем каждый элемент массива в стек с помощью метода push.
// Затем мы выводим содержимое стека на консоль, извлекая элементы из стека
// с помощью метода pop.


import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Пример использования метода pushAndPrintStack
        Integer[] array = {1, 2, 3, 4, 5};
        pushAndPrintStack(array);
    }

    // Метод, который принимает массив элементов, помещает их в стек и выводит на консоль содержимое стека
    public static <T> void pushAndPrintStack(T[] array) {
        Stack<T> stack = new Stack<>();

        // Помещаем элементы массива в стек
        for (T element : array) {
            stack.push(element);
        }

        // Выводим содержимое стека на консоль
        System.out.println("Содержимое стека:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
