package Java_lectures.Lecture2;


// Этот код демонстрирует использование блока try-catch-finally для обработки исключений
// при работе с файлами в Java. Давайте разберем его построчно:

// import java.io.*;: Этот оператор импортирует все классы из пакета java.io, который предоставляет классы для работы с потоками ввода-вывода, включая файлы.
// public class Ex003_tryDemo {: Объявляется публичный класс Ex003_tryDemo.
// public static void main(String[] args) {: Определяется точка входа в программу - метод main.
// String line = "empty";: Создается строковая переменная line, инициализированная значением "empty".
// try {: Начало блока try, в котором помещается код, который может привести к возникновению исключений.
// String pathProject = System.getProperty("user.dir");: Получаем путь к текущему рабочему каталогу (директории проекта) с помощью метода getProperty("user.dir") класса System и сохраняем его в переменной pathProject.
// String pathFile = pathProject.concat("/file.txt");: Формируется путь к файлу "file.txt" путем объединения пути проекта (pathProject) и имени файла.
// File file = new File(pathFile);: Создается новый объект класса File, представляющий файл по указанному пути pathFile.
// if (file.createNewFile()) {: Пытаемся создать новый файл. Если файл успешно создан, то...
// System.out.println("file.created");: Выводится сообщение о том, что файл был создан.
// else {: Если файл уже существует, то...
// System.out.println("file.existed");: Выводится сообщение о том, что файл уже существует.
// FileWriter fileWriter = new FileWriter(file, true);: Создается объект FileWriter для записи данных в файл file. Параметр true указывает, что новые данные будут добавлены в конец файла.
// fileWriter.write("new line");: Записывается строка "new line" в файл.
// fileWriter.append(System.lineSeparator());: Добавляется разделитель строк в файл с использованием платформозависимого символа новой строки.
// fileWriter.write("new line");: Записывается еще одна строка "new line" в файл.
// fileWriter.append("new line");: Добавляется еще одна строка "new line" в файл.
// fileWriter.flush();: Принудительно записываются все буферизованные данные в файл.
// fileWriter.close();: Закрывается поток записи в файл.
// } catch (Exception e) {: Если возникает исключение, оно перехватывается, и код внутри этого блока выполняется.
// //e.printStackTrace();: Если нужно, можно распечатать стек вызовов исключения.
// } finally {: Блок finally выполняется всегда, независимо от того, возникали ли исключения или нет.
// System.out.println(line);: Выводится содержимое переменной line, которая в данном случае всегда содержит строку "empty".
// }: Конец блока try-catch-finally.
// }: Конец метода main.
// }: Конец класса Ex003_tryDemo.
// Этот код создает файл "file.txt" в текущей директории проекта, и если файл уже существует, он добавляет в него три строки текста.

import java.io.*;

public class Ex003_tryDemo {
    public static void main(String[] args) {
        String line = "empty";
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file.txt");
            File file = new File(pathFile);

            if (file.createNewFile()) {
                System.out.println("file.created");
            }
            else {
                System.out.println("file.existed");
                FileWriter fileWriter = new FileWriter(file, true);
                fileWriter.write("new line");

                //#region lineSeparator
                // A string containing "\r\n" for non-Unix 
                // platforms, or a string containing 
                // "\n" for Unix platforms.
                fileWriter.append(System.lineSeparator());
                //#endregion

                fileWriter.write("new line");
                fileWriter.append("new line");
                fileWriter.flush();
                fileWriter.close();
                // BufferedReader bufReader = new BufferedReader(new FileReader(file));
                // line = bufReader.readLine();
                // bufReader.close();
            }
        } catch (Exception e) {
            //e.printStackTrace();
        } finally {
            System.out.println(line);
        }
    }
}
