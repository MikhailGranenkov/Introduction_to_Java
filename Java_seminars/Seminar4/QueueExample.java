package Seminar4;

// Задание №3
// 2) Написать метод, который принимает массив элементов, помещает их в очередь
// и выводит на консоль содержимое очереди.

// Пояснения:
// Мы используем интерфейс Queue и его реализацию LinkedList для работы с очередью.
// Метод enqueueAndPrintQueue принимает массив элементов любого типа.
// В цикле мы помещаем каждый элемент массива в очередь с помощью метода offer.
// Затем мы выводим содержимое очереди на консоль, извлекая элементы из очереди
// с помощью метода poll.


import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Пример использования метода enqueueAndPrintQueue
        String[] array = {"a", "b", "c", "d", "e"};
        enqueueAndPrintQueue(array);
    }

    // Метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди
    public static <T> void enqueueAndPrintQueue(T[] array) {
        Queue<T> queue = new LinkedList<>();

        // Помещаем элементы массива в очередь
        for (T element : array) {
            queue.offer(element);
        }

        // Выводим содержимое очереди на консоль
        System.out.println("Содержимое очереди:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
