package Java_lectures.Lecture3;


// Этот код на Java создает список list, содержащий пять целочисленных элементов. Затем он использует цикл for-each для перебора элементов списка и вывода каждого элемента на консоль.

// Далее код создает итератор для списка list с помощью метода iterator(). После этого код пытается удалить каждый элемент списка с помощью метода remove() итератора. В процессе выполнения итератор перемещается по списку с помощью метода next() и выводит каждый элемент на консоль перед его удалением.

// Однако, это приводит к исключению UnsupportedOperationException, так как список, созданный методом List.of(), является неизменяемым, и попытка удаления элементов из него вызывает исключение.


import java.util.*;

public class Ex007 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 12, 123, 1234, 12345);

        for (int item : list) {
            System.out.println(item);
        }

        Iterator<Integer> col = list.iterator();
        System.out.println();

        while (col.hasNext()) {
            col.remove();
            System.out.println(col.next());
            //col.next();
        }

    }
}
