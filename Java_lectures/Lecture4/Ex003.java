package Java_lectures.Lecture4;


// Этот код на Java создает двустороннюю очередь (Deque) с использованием класса ArrayDeque, предназначенного для хранения целочисленных значений. Затем в очередь добавляются элементы с помощью методов addFirst() и addLast(), и затем два последних элемента удаляются из очереди с помощью метода removeLast().

// Далее элементы добавляются и удаляются из очереди с использованием методов offerFirst(), offerLast(), pollFirst() и pollLast().

// Кроме того, код использует методы для доступа к первому и последнему элементам в очереди (getFirst(), getLast()) и методы для просмотра первого и последнего элементов без их удаления (peekFirst(), peekLast()).

// Обратите внимание, что некоторые методы, такие как getFirst(), getLast(), peekFirst() и peekLast(), могут вызвать исключение NoSuchElementException, если очередь пуста, а методы удаления (removeFirst(), removeLast(), pollFirst(), pollLast()) вернут null или false, если очередь пуста.


import java.util.*;

public class Ex003 {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1); deque.addLast(2);
        deque.removeLast(); deque.removeLast();
        deque.offerFirst(1); deque.offerLast(2);
        deque.pollFirst(); deque.pollLast();
        deque.getFirst(); deque.getLast();
        deque.peekFirst(); deque.peekLast();
    }
}