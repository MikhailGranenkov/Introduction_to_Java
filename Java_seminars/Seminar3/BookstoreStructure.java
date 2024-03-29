package Seminar3;

// Каталог товаров книжного магазина сохранен в виде двумерного
// списка List<ArrayList<String>> так, что на 0й позиции каждого
// внутреннего списка содержится название жанра, а на остальных
// позициях - названия книг. Напишите метод для заполнения данной
// структуры.


// Этот код создает структуру книжного магазина, представленную в виде списка списков строк.
// Каждый внутренний список представляет собой список книг определенного жанра.
// Создается список catalog, который будет содержать списки строк для каждого жанра книг.
// Создаются списки строк genre1, genre2, genre3, содержащие книги разных жанров.
// Каждый из этих списков инициализируется с помощью метода Arrays.asList,
// который создает список из переданных элементов.
// Затем эти списки добавляются в общий каталог catalog.
// Цикл for-each перебирает каждый список в каталоге и выводит его содержимое на экран
// с помощью метода System.out.println(). Каждый внутренний список (жанр книг) выводится
// на новой строке.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookstoreStructure {

    public static void main(String[] args) {
        // Создаем список, который будет содержать списки строк для каждого жанра книг
        List<ArrayList<String>> catalog = new ArrayList<>();
        
        // Создаем списки строк для каждого жанра книг и добавляем их в общий каталог
        ArrayList<String> genre1 = new ArrayList<>(Arrays.asList("Роман", "книга 1", "книга 2", "книга 3"));
        ArrayList<String> genre2 = new ArrayList<>(Arrays.asList("Триллер", "книга 4", "книга 5", "книга 6"));
        ArrayList<String> genre3 = new ArrayList<>(Arrays.asList("Приключения", "книга 6", "книга 7", "книга 8"));
        catalog.add(genre1);
        catalog.add(genre2);
        catalog.add(genre3);
        
        // Выводим содержимое каждого списка (жанра книг) из каталога
        for (ArrayList<String> genre : catalog) {
            System.out.println(genre);
        }
    }

}