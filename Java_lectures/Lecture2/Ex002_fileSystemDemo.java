package Java_lectures.Lecture2;


// Этот код демонстрирует работу с файловой системой в Java с использованием класса File.
// Давайте разберем его:
// import java.io.File;: Этот оператор импортирует класс File из стандартной библиотеки Java,
// который предоставляет возможность работы с файлами и директориями.
// public class Ex002_fileSystemDemo {: Объявляется публичный класс Ex002_fileSystemDemo.
// public static void main(String[] args) {: Определяется точка входа в программу - метод
// main.
// String pathProject = System.getProperty("user.dir");: Получаем путь к текущему
// рабочему каталогу (директории проекта) с помощью метода getProperty("user.dir")
// класса System и сохраняем его в переменной pathProject.
// String pathFile = pathProject.concat("/file.txt");: Формируется путь к файлу
// "file.txt" путем объединения пути проекта (pathProject) и имени файла.
// File f3 = new File(pathFile);: Создается новый объект класса File,
// представляющий файл по указанному пути pathFile.
// System.out.println(f3.getAbsolutePath());: Выводится абсолютный путь к файлу,
// который был создан объектом f3.
// System.out.println(pathFile);: Выводится строка, содержащая путь к файлу "file.txt".
// File f1 = new File("file.txt");: Создается новый объект класса File,
// представляющий файл "file.txt" в текущей директории.
// File f2 = new File("/Users/sk/vscode/java_projects/file.txt");:
// Создается новый объект класса File, представляющий файл "file.txt" по
// указанному абсолютному пути.
// System.out.println(f1.getAbsolutePath());: Выводится абсолютный путь к файлу,
// который был создан объектом f1.
// System.out.println(f2.getAbsolutePath());: Выводится абсолютный путь к файлу,
// который был создан объектом f2.
// }: Конец метода main.
// }: Конец класса Ex002_fileSystemDemo.
// Этот код позволяет получить абсолютные пути к файлам,
// используя различные методы создания объектов класса File,
// в том числе относительные и абсолютные пути, а также путь к текущей директории.

import java.io.File;

public class Ex002_fileSystemDemo {
    public static void main(String[] args) {
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("/file.txt");
        File f3 = new File(pathFile);
        System.out.println(f3.getAbsolutePath());

        System.out.println(pathFile);
        File f1 = new File("file.txt");
        File f2 = new File("/Users/sk/vscode/java_projects/file.txt");
        System.out.println(f1.getAbsolutePath());
        System.out.println(f2.getAbsolutePath());
    }
}