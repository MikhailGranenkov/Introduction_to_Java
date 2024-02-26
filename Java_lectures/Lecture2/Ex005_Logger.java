package Java_lectures.Lecture2;


// Этот код на Java демонстрирует использование логгера для записи сообщений в файл логов. Вот пошаговое описание его работы:

// Импорт классов:
// java.io.IOException: Этот класс представляет исключение, которое может возникнуть во время операций ввода-вывода.
// java.util.logging.*: Этот пакет содержит классы и интерфейсы для реализации логгирования в Java.
// Метод main(String[] args):
// Это главный метод программы, который является точкой входа. Он может бросать исключение IOException, если произошла ошибка ввода-вывода.
// Инициализация логгера:
// Logger logger = Logger.getLogger(Ex005_Logger.class.getName());
// Создается объект Logger с именем, соответствующим имени класса Ex005_Logger. Это имя будет использоваться в записи логов для идентификации их происхождения.
// Инициализация обработчика файла:
// FileHandler fh = new FileHandler("log.txt");
// Создается объект FileHandler для записи логов в файл с именем "log.txt".
// logger.addHandler(fh);
// Обработчик файла добавляется к логгеру. Теперь все сообщения, записываемые логгером, будут направляться и сохраняться в указанный файл.
// Настройка форматирования:
// SimpleFormatter sFormat = new SimpleFormatter();
// Создается объект SimpleFormatter для форматирования записей логов.
// fh.setFormatter(sFormat);
// Устанавливается этот форматтер для объекта FileHandler, чтобы логи записывались в файл в простом текстовом формате.
// Запись логов:
// logger.log(Level.WARNING, "Тестовое логирование 1");
// logger.info("Тестовое логирование 2");
// Логгер использует различные уровни логирования (например, Level.WARNING и Level.INFO) для записи сообщений разного уровня важности. В данном примере записываются два тестовых сообщения: одно с уровнем WARNING и одно с уровнем INFO.


import java.io.IOException;
import java.util.logging.*;

public class Ex005_Logger {
    public static void main(String[] args) throws IOException {
    
        Logger logger = Logger.getLogger(Ex005_Logger.class.getName());
        //ConsoleHandler ch = new ConsoleHandler();
        FileHandler fh = new FileHandler("log.txt");
        //logger.addHandler(ch);
        logger.addHandler(fh);
        
        SimpleFormatter sFormat = new SimpleFormatter();
        //XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(sFormat);
        //fh.setFormatter(xml);
        
        //logger.setLevel(Level.INFO);
        logger.log(Level.WARNING, "Тестовое логирование 1");
        logger.info("Тестовое логирование 2");

    }
}







