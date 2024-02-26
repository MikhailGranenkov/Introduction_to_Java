package Dz.Dz4;

// В классе MyQueue реализуйте очередь для типа данных Integer с помощью LinkedList
// со следующими методами:
// enqueue() - помещает элемент в конец очереди
// dequeue() - возвращает первый элемент из очереди и удаляет его
// first() - возвращает первый элемент из очереди, не удаляя
// getElements() - возвращает все элементы в очереди
// Пример

// queue.enqueue(1);
// queue.enqueue(10);
// queue.enqueue(15);
// queue.enqueue(5);
// System.out.println(queue.getElements()); 
// Результат:

// [1, 10, 15, 5]
// queue.dequeue();
// queue.dequeue();
// System.out.println(queue.getElements());
// Результат:

//  [15, 5]
// System.out.println(queue.first());
// Результат:

// 15


// Объяснение:
// Создается класс MyQueue, который реализует очередь для целочисленных значений (Integer)
// с использованием LinkedList.
// В конструкторе класса создается объект LinkedList, который будет хранить элементы очереди.
// Метод enqueue(int element) добавляет элемент в конец очереди с помощью метода
// add() LinkedList.
// Метод dequeue() извлекает и удаляет первый элемент из очереди с помощью метода
// poll() LinkedList.
// Метод first() возвращает первый элемент из очереди без его удаления с помощью метода
// peek() LinkedList.
// Метод getElements() возвращает все элементы в очереди в виде нового LinkedList,
// чтобы избежать изменений в оригинальном списке.


import java.util.LinkedList;

public class MyQueue {
    private LinkedList<Integer> elements; // Объявляем LinkedList для хранения элементов очереди

    // Конструктор класса MyQueue
    public MyQueue() {
        elements = new LinkedList<>(); // Инициализируем LinkedList в конструкторе
    }

    // Метод для добавления элемента в конец очереди
    public void enqueue(int element) {
        elements.add(element); // Добавляем элемент в конец списка
    }

    // Метод для извлечения и удаления первого элемента из очереди
    public int dequeue() {
        // Извлекаем и возвращаем первый элемент из списка, удаляя его из списка
        return elements.poll();
    }

    // Метод для получения первого элемента из очереди, не удаляя его
    public int first() {
        // Возвращаем первый элемент списка, не удаляя его из списка
        return elements.peek();
    }

    // Метод для получения всех элементов в очереди
    public LinkedList<Integer> getElements() {
        // Возвращаем все элементы в виде нового LinkedList, чтобы избежать изменений в оригинальном списке
        return new LinkedList<>(elements);
    }
}

// Класс для проверки результатов работы очереди
class Main {
    public static void main(String[] args) {
        // Создаем экземпляр очереди MyQueue
        MyQueue queue = new MyQueue();

        // Добавляем элементы в очередь
        queue.enqueue(1);
        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(5);

        // Выводим все элементы в очереди
        System.out.println(queue.getElements()); // Ожидаемый результат: [1, 10, 15, 5]

        // Извлекаем и удаляем первые два элемента из очереди
        queue.dequeue();
        queue.dequeue();

        // Выводим все элементы в очереди после удаления первых двух элементов
        System.out.println(queue.getElements()); // Ожидаемый результат: [15, 5]

        // Выводим первый элемент в очереди
        System.out.println(queue.first()); // Ожидаемый результат: 15
    }
}
