package Dz.Dz3;

// Дан произвольный массив целых чисел. Создайте список ArrayList,
// заполненный данными из этого массива. Необходимо удалить из списка четные числа
// и вернуть результирующий.
// Напишите свой код в методе removeEvenNumbers класса Answer.
// Метод removeEvenNumbers принимает на вход один параметр:
// Integer[] arr - список целых чисел, возвращает список ArrayList<Integer>

// Примеры.
// Исходный массив:

// 1, 2, 3, 4, 5, 6, 7, 8, 9
// Результат:

// [1, 3, 5, 7, 9]
// Исходный массив:

// 2, 4, 6, 8
// Результат:

// []


import java.util.ArrayList;

public class Answer {
    // Метод removeEvenNumbers принимает на вход массив целых чисел
    // и удаляет из него все четные числа, а затем возвращает и выводит список ArrayList
    public static ArrayList<Integer> removeEvenNumbers(Integer[] arr) {
        // Создаем список ArrayList для хранения результата
        ArrayList<Integer> resultList = new ArrayList<>();
        
        // Проходим по каждому элементу в массиве
        for (Integer num : arr) {
            // Проверяем, является ли текущее число четным
            if (num % 2 != 0) { // Если число нечетное, добавляем его в результирующий список
                resultList.add(num);
            }
        }
        
        // Выводим результат
        System.out.println(resultList);
        
        // Возвращаем список ArrayList с нечетными числами
        return resultList;
    }
    
    public static void main(String[] args) {
        Integer[] arr;

        // Проверяем, были ли переданы аргументы командной строки
        if (args.length == 0) {
            // Если нет, создаем массив с произвольными значениями
            arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        } else {
            // Если аргументы были переданы, преобразуем их в массив Integer
            arr = new Integer[args.length];
            for (int i = 0; i < args.length; i++) {
                arr[i] = Integer.parseInt(args[i]);
            }
        }
        
        // Вызываем метод removeEvenNumbers с переданным массивом и печатаем результат
        removeEvenNumbers(arr);
    }

    public void analyzeNumbers(Integer[] arr) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'analyzeNumbers'");
    }

    public void analyzeNumbers1(Integer[] arr) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'analyzeNumbers1'");
    }

    public void analyze(Integer[] arr) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'analyze'");
    }
}
