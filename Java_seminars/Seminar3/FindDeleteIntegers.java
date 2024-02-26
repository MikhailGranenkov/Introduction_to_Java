package Seminar3;

// Создать список типа ArrayList<String>.
// Поместить в него как строки, так и целые числа.
// Пройти по списку, найти и удалить целые числа.


// Этот код создает список строк strList, затем вызывает два метода для
// удаления числовых строк из списка: deleteNumberIter, который использует итератор,
// и deleteNumber, который работает без использования итератора.
// Метод deleteNumberIter использует итератор для обхода списка.
// Он проверяет каждый элемент списка и, если элемент является числом,
// удаляет его из списка с помощью метода remove() итератора.
// Метод deleteNumber проходит по всем элементам списка с помощью цикла for.
// Если текущий элемент является числом, он удаляет его из списка и уменьшает счетчик i,
// чтобы не пропустить следующий элемент после удаления.
// Метод isNumber проверяет, является ли строка числом, путем попытки преобразовать
// ее в число типа int. Если преобразование успешно, возвращает true, иначе возвращает false.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class FindDeleteIntegers {
    public static void main(String[] args) {
        // Создаем список строк
        ArrayList<String> strList = new ArrayList<>(Arrays.asList("priv", "hell", "345", "ads", "12")); 
        
        // Вызываем методы для удаления чисел из списка
        deleteNumberIter(strList); // Удаление чисел с использованием итератора
        deleteNumber(strList); // Удаление чисел без использования итератора

        // Выводим измененный список
        System.out.println(strList);       
    }

    // Метод для удаления чисел с использованием итератора
    private static void deleteNumberIter(ArrayList<String> strList) {
        Iterator<String> iter = strList.iterator(); // Получаем итератор для списка
        while(iter.hasNext()){ // Пока в списке есть следующий элемент
            String elem = iter.next(); // Получаем следующий элемент
            if (isNumber(elem)) // Если элемент является числом
                iter.remove(); // Удаляем элемент из списка
        }
    }

    // Метод для удаления чисел без использования итератора
    private static void deleteNumber(ArrayList<String> strList) {
        for (int i = 0; i < strList.size(); i++) { // Проходим по всем элементам списка
            if(isNumber(strList.get(i))) { // Если текущий элемент является числом
                strList.remove(i); // Удаляем элемент из списка
                i--; // Уменьшаем счетчик, чтобы не пропустить следующий элемент после удаления
            }            
        }
    }

    // Метод для проверки, является ли строка числом
    public static boolean isNumber(String str) {
        try {
            Integer.parseInt(str); // Пытаемся преобразовать строку в число типа int
            return true; // Если успешно, возвращаем true
        } catch (Exception e) {
            return false; // Если возникает исключение (например, формат не числовой), возвращаем false
        }
    }
}