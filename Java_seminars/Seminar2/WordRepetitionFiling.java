package Seminar2;

import java.io.FileWriter;

// Задача 4.
// Напишите метод, который составит строку, состоящую из 100
// повторений слова TEST и метод, который запишет эту строку в
// простой текстовый файл, обработайте исключения.

public class WordRepetitionFiling {
    public static void main(String[] args) {
int repeat = 100;
    String str = repeatWord("TEST", repeat);
    writeToFile(str, "text.txt");
    }

    public static String repeatWord(String word, int repeat){

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
            sb.append(word).append(" ");
        }
        return sb.toString();
    }

    public static void writeToFile(String str, String fileName){

            try (FileWriter fw = new FileWriter(fileName)) {
                fw.write(str);
                System.out.println("Данные успешно записаны в файл");
            } catch (Exception e) {
                System.err.println("Ошибка записи файла");
            }
        //     FileWriter fw = null;
        // try {
        //     fw = new FileWriter(fileName);
        //     fw.write(str);
            
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }
        // finally{
        //     fw.close();
        // }
        }
}
