package Java_lectures.Lecture4;


// Этот код на Java создает очередь (Queue) с использованием связанного списка (LinkedList) для хранения целочисленных значений. Затем в очередь добавляются четыре элемента: 1, 2, 3 и 4 с помощью метода add().

// После этого выводится содержимое очереди на консоль, что показывает ее текущее состояние.

// Затем извлекается первый элемент из очереди с помощью метода remove(), и его значение сохраняется в переменной item. Выводится содержимое очереди, которое теперь не содержит удаленный элемент.

// После этого в очередь добавляется новый элемент 2809 с помощью метода offer(), и затем из очереди снова извлекается первый элемент с помощью remove() и выводится содержимое очереди.

// Этот процесс повторяется еще несколько раз для демонстрации удаления элементов из очереди. Наконец, метод peek() используется для просмотра первого элемента в очереди без его удаления, и его значение выводится на консоль.


import java.util.LinkedList;
import java.util.Queue;

public class Ex002 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue); // [1, 2, 3, 4]
        int item = queue.remove();
        System.out.println(queue); // [2, 3, 4]
        queue.offer(2809);
        item = queue.remove();
        System.out.println(queue); // [3, 4, 2809]
        item = queue.remove();
        System.out.println(queue); // [4, 2809]
        item = queue.remove();
        System.out.println(queue); // [2809]
        System.out.println(queue.peek());
        
    }
}
