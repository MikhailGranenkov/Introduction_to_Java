package Java_lectures.Lecture3;


// Этот код на Java создает список list1, содержащий символы 'S', 'e', 'r', 'g', 'e', 'y'. Затем он пытается удалить элемент с индексом 1 из списка list1, что приводит к возникновению исключения UnsupportedOperationException, так как списки, созданные с помощью метода List.of(), являются неизменяемыми.

// После этого создается копия списка list1 с помощью метода List.copyOf(), который создает новый список, содержащий те же элементы, что и исходный список.


import java.util.List;

public class Ex006 {
    public static void main(String[] args) {
        Character value = null;
        List<Character> list1 = List.of('S', 'e', 'r', 'g', 'e', 'y');
        System.out.println(list1);
        list1.remove(1); // java.lang.UnsupportedOperationException
        List<Character> list2 = List.copyOf(list1);
        
    }
}
