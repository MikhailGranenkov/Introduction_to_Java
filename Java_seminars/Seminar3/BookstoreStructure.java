package Seminar3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Каталог товаров книжного магазина сохранен в виде двумерного
// списка List<ArrayList<String>> так, что на 0й позиции каждого
// внутреннего списка содержится название жанра, а на остальных
// позициях - названия книг. Напишите метод для заполнения данной
// структуры.

public class BookstoreStructure {

	public static void main(String[] args) {
		List<ArrayList<String>> catalog = new ArrayList<>();
		ArrayList<String> genre1 = new ArrayList<>(Arrays.asList("Роман", "книга 1", "книга 2", "книга 3"));
		ArrayList<String> genre2 = new ArrayList<>(Arrays.asList("Триллер", "книга 4", "книга 5", "книга 6"));
		ArrayList<String> genre3 = new ArrayList<>(Arrays.asList("Приключения", "книга 6", "книга 7", "книга 8"));
		catalog.add(genre1);
		catalog.add(genre2);
		catalog.add(genre3);
		for (ArrayList<String> genre : catalog) {
			System.out.println(genre);
		}
	}

}  

