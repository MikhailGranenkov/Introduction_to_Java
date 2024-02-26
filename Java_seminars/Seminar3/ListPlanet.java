package Seminar3;

import java.util.ArrayList;
import java.util.Collections;

// Заполнить список названиями планет Солнечной
// системы в произвольном порядке с повторениями.
// Вывести название каждой планеты и количество его
// повторений в списке.
// Задание состоит из двух блоков
// Задание №2.2 (если выполнено первое задание)
// Пройти по списку из предыдущего задания и удалить
// повторяющиеся элементы.


// Этот код выполняет следующие действия:

// Создает список строк, представляющих планеты солнечной системы.
// Выводит исходный список планет.
// Ищет и выводит повторяющиеся планеты в отсортированном порядке с количеством повторений.
// Удаляет повторяющиеся планеты из исходного списка.
// Выводит список планет после удаления повторений.


public class ListPlanet {
    public static void main(String[] args) {
        // Получаем список планет
        ArrayList<String> arrayList = getListPlanets();
        System.out.println(arrayList); // Выводим список планет

        // Выводим повторяющиеся планеты в отсортированном порядке
        printRepeatPlanets(arrayList);

        // Удаляем повторяющиеся планеты из списка
        deletRepeatPlanet(arrayList);

        // Выводим список после удаления повторяющихся планет
        System.out.println(arrayList);
    }

    // Метод для получения списка планет
    private static ArrayList<String> getListPlanets() {
        ArrayList<String> arrayList = new ArrayList<>();
        // Добавляем планеты в список
        arrayList.add("Меркурий");
        arrayList.add("Юпитер");
        arrayList.add("Венера");
        arrayList.add("Земля");
        arrayList.add("Марс");
        arrayList.add("Юпитер");
        arrayList.add("Сатурн");
        arrayList.add("Уран");
        arrayList.add("Земля");
        arrayList.add("Нептун");
        arrayList.add("Плутон");
        arrayList.add("Нептун");
        return arrayList; // Возвращаем список планет
    }

    // Метод для вывода повторяющихся планет
    private static void printRepeatPlanets(ArrayList<String> planets){
        // Создаем копию списка планет и сортируем его
        ArrayList<String> sortedPlanets = new ArrayList<>(planets);
        Collections.sort(sortedPlanets);

        int count = 1;
        String planet = sortedPlanets.get(0);
        for (int i = 1; i < sortedPlanets.size(); i++) {
            // Проверяем, если текущая планета совпадает с предыдущей
            if (sortedPlanets.get(i).equals(planet)) {
                count++;
            } else { // Если планета не совпадает, выводим информацию о предыдущей
                System.out.println(planet + " -> " + count);
                planet = sortedPlanets.get(i);
                count = 1;
            }
        }
        // Выводим информацию о последней планете
        System.out.println(planet + " -> " + count);
    }

    // Метод для удаления повторяющихся планет
    public static void deletRepeatPlanet(ArrayList<String> planets){
        // Удаляем повторяющиеся планеты путем прохода по списку
        for (int i = 0; i < planets.size(); i++) {
            String currentPlanet = planets.get(i);
            // Проверяем планеты, следующие после текущей
            for (int j = i + 1; j < planets.size(); j++) {
                if (planets.get(j).equals(currentPlanet)) {
                    planets.remove(j); // Удаляем повторяющуюся планету
                    j--; // Уменьшаем счетчик, чтобы не пропустить следующий элемент после удаления
                }
            }
        }
    }
}
