package Seminar2;


// Задача 4.
// Напишите метод, который составит строку, состоящую из 100
// повторений слова TEST и метод, который запишет эту строку в
// простой текстовый файл, обработайте исключения.


// Этот код содержит два метода:
// repeatWord(String word, int repeat): Этот метод принимает слово word
// и количество повторений repeat, а затем генерирует строку,
// состоящую из заданного количества повторений этого слова, разделенных пробелами.
// writeToFile(String str, String fileName): Этот метод принимает
// строку str и имя файла fileName, и записывает эту строку в указанный файл.
// Он использует FileWriter для записи строки в файл.
// Любые исключения, которые могут возникнуть в процессе записи в файл,
// обрабатываются с помощью конструкции try-catch.

// Пояснения:
// repeatWord(String word, int repeat): Этот метод принимает слово word и количество
// повторений repeat, а затем генерирует строку, состоящую из заданного количества
// повторений этого слова, разделенных пробелами.
// writeToFile(String str, String fileName): Этот метод принимает строку str и имя
// файла fileName, и записывает эту строку в указанный файл.
// Он использует FileWriter для записи строки в файл. Любые исключения,
// которые могут возникнуть в процессе записи в файл, обрабатываются с помощью
// конструкции try-catch. В блоке finally происходит закрытие файла после его использования,
// чтобы избежать утечки ресурсов.


import java.io.FileWriter;
import java.io.IOException;

public class WordRepetitionFiling {
    public static void main(String[] args) {
        int repeat = 100; // Количество повторений слова
        String str = repeatWord("TEST", repeat); // Генерация строки с повторяющимся словом
        writeToFile(str, "text.txt"); // Запись строки в файл "text.txt"
    }

    // Метод для генерации строки с повторяющимся словом
    public static String repeatWord(String word, int repeat) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
            sb.append(word).append(" "); // Добавление слова в строку с пробелом после каждого повторения
        }
        return sb.toString(); // Возвращение сформированной строки
    }

    // Метод для записи строки в файл
    public static void writeToFile(String str, String fileName) {
        FileWriter fw = null; // Объявление переменной FileWriter
        try {
            fw = new FileWriter(fileName); // Создание FileWriter для указанного файла
            fw.write(str); // Запись строки в файл
            System.out.println("Данные успешно записаны в файл");
        } catch (IOException e) { // Обработка исключений, возникающих при записи в файл
            System.err.println("Ошибка при записи в файл: " + e.getMessage()); // Вывод сообщения об ошибке
        } finally {
            try {
                if (fw != null) {
                    fw.close(); // Закрытие FileWriter
                }
            } catch (IOException e) {
                System.err.println("Ошибка при закрытии файла: " + e.getMessage()); // Вывод сообщения об ошибке при закрытии файла
            }
        }
    }
}
