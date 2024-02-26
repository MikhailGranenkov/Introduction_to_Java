package Seminar2;


// Задача 5.
// Напишите метод, который вернет содержимое текущей папки в виде
// массива строк.
// Напишите метод, который запишет массив, возвращенный предыдущим
// методом в файл.
// Обработайте ошибки с помощью try-catch конструкции. В случае
// возникновения исключения, оно должно записаться в лог-файл.


// Пояснения к коду:

// import java.util.logging.Logger;: Импорт класса Logger из пакета java.util.logging,
// который используется для создания и управления логгерами.
// private static final Logger logger = Logger.getLogger(ContentFolder.class.getName());:
// Объявление статического логгера для класса ContentFolder.
// configLogger(): Вызов метода configLogger() для настройки логгера перед использованием.
// getContentFolder("."): Получение содержимого текущей директории.
// Метод getContentFolder принимает имя папки в виде строки,
// открывает соответствующую папку в виде объекта File и возвращает массив имен файлов
// и папок в этой папке.
// writeToFile(contentFolder, "output.txt"): Запись содержимого текущей папки в 
// файл "output.txt". Метод writeToFile принимает массив строк strs,
// который содержит имена файлов и папок, и имя файла fileName,
// в который будет производиться запись.
// try (FileWriter fw = new FileWriter(fileName)) { ... }: 
// Используется try-with-resources для автоматического закрытия FileWriter.
// Данные записываются в файл при помощи объекта FileWriter.
// logger.info("Данные успешно записаны в файл"): Запись информации об успешной
// записи в лог уровня INFO при помощи логгера.
// logger.warning("Ошибка записи файла"): Запись предупреждения об ошибке записи
// в лог уровня WARNING при помощи логгера.
// configLogger(): Метод configLogger() настраивает логгер, создавая объект
// FileHandler для записи логов в файл "log.txt". Добавляется объект FileHandler к
// логгеру logger, и устанавливается форматтер SimpleFormatter для форматирования
// записей лога.


// import java.io.File;
// import java.io.FileWriter;
// import java.util.logging.FileHandler;
// import java.util.logging.Logger;
// import java.util.logging.SimpleFormatter;

// public class ContentFolder {
    
//     // Создание объекта логгера для класса ContentFolder
//     private static final Logger logger = Logger.getLogger(ContentFolder.class.getName());
    
//     public static void main(String[] args) {
//         configLogger(); // Настройка логгера
//         String[] contentFolder = getContentFolder("."); // Получение содержимого текущей папки
//         writeToFile(contentFolder, "output.txt"); // Запись содержимого в файл "output.txt"
//     }

//     // Метод для получения содержимого папки
//     public static String[] getContentFolder(String folderName) {
//         File folder = new File(folderName);
//         return folder.list(); // Возвращает массив имен файлов и папок в указанной папке
//     }

//     // Метод для записи данных в файл
//     public static void writeToFile(String[] strs, String fileName){
//         try (FileWriter fw = new FileWriter(fileName)) {
//             for (String str : strs) {
//                 fw.write(str);
//                 fw.write(System.lineSeparator()); // Переход на новую строку после каждой записи
//             }
//             logger.info("Данные успешно записаны в файл"); // Запись информации об успешной записи в лог
//         } catch (Exception e) {
//             logger.warning("Ошибка записи файла"); // Запись предупреждения об ошибке в лог
//         }
//     } 
    
//     // Метод для настройки логгера
//     public static void configLogger() {
//         try {
//             // Создание объекта FileHandler для записи логов в файл "log.txt"
//             FileHandler fh = new FileHandler("log.txt", true);
//             logger.addHandler(fh); // Добавление FileHandler к логгеру
//             SimpleFormatter formatter = new SimpleFormatter();
//             fh.setFormatter(formatter); // Установка форматтера для форматирования записей лога
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }   
// }


// В этом коде:

// getCurrentFolderContents() - метод для получения содержимого текущей папки.
// Создается объект File для текущей папки (.), и вызывается метод list(),
// который возвращает массив имен файлов и папок в этой папке.
// writeArrayToFile(String[] array, String fileName) - метод для записи массива в файл.
// Создается объект FileWriter для файла, указанного в аргументе fileName.
// Далее в цикле записывается каждый элемент массива в файл, с переводом строки.
// В случае возникновения исключения IOException, исключение обрабатывается
// методом writeExceptionToLog(Exception e).
// writeExceptionToLog(Exception e) - метод для записи исключения в лог-файл.
// Создается объект FileWriter для лог-файла "error.log".
// Затем строковое представление переданного исключения записывается в лог-файл.
// В случае возникновения исключения при записи в лог-файл, стек вызовов исключения
// выводится на стандартный вывод ошибок.
// В методе main() создается экземпляр класса ContentFolder.
// Получается содержимое текущей папки, и записывается в файл "files.txt" при
// помощи метода writeArrayToFile().


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ContentFolder {

    // Метод для получения содержимого текущей папки
    public String[] getCurrentFolderContents() {
        File folder = new File("."); // Создание объекта File, представляющего текущую папку
        return folder.list(); // Возвращает массив имен файлов и папок в текущей папке
    }

    // Метод для записи массива в файл
    public void writeArrayToFile(String[] array, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) { // Создание FileWriter для записи в файл
            for (String item : array) {
                writer.write(item + "\n"); // Запись каждого элемента массива в файл, с переводом строки
            }
        } catch (IOException e) { // Обработка исключения ввода-вывода
            // Запись информации об исключении в лог-файл
            writeExceptionToLog(e);
        }
    }

    // Метод для записи исключения в лог-файл
    public void writeExceptionToLog(Exception e) {
        try (FileWriter writer = new FileWriter("error.log")) { // Создание FileWriter для записи в лог-файл
            writer.write(e.toString()); // Запись строкового представления исключения в лог-файл
        } catch (IOException ex) { // Обработка исключения ввода-вывода при записи в лог-файл
            ex.printStackTrace(); // Вывод стека вызовов исключения на стандартный вывод ошибок
        }
    }

    // Метод main, с которого начинается выполнение программы
    public static void main(String[] args) {
        ContentFolder fileHandling = new ContentFolder(); // Создание экземпляра класса ContentFolder
        String[] contents = fileHandling.getCurrentFolderContents(); // Получение содержимого текущей папки
        fileHandling.writeArrayToFile(contents, "files.txt"); // Запись содержимого текущей папки в файл
    }
}
