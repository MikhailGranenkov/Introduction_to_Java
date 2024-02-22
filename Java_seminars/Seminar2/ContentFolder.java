package Seminar2;

// import java.io.File;
// import java.io.FileWriter;
// import java.lang.System.Logger;
// import java.lang.System.Logger.Level;
// import java.util.logging.FileHandler;
// import java.util.logging.SimpleFormatter;

// Задача 5.
// Напишите метод, который вернет содержимое текущей папки в виде
// массива строк.
// Напишите метод, который запишет массив, возвращенный предыдущим
// методом в файл.
// Обработайте ошибки с помощью try-catch конструкции. В случае
// возникновения исключения, оно должно записаться в лог-файл.
// public class ContentFolder {
    
//     private static Logger logger = Logger.getLogger(ContentFolder.class.getName());
//     public static void main(String[] args) {
//         configLogger();
//         String[] contentFolder = getContentFolder(".");        
//         writeToFile(contentFolder, ".");
        
//     }

//     public static String[] getContentFolder(String folderName) {
        
//         File folder = new File(folderName);
//         return folder.list();
//     }

//     public static void writeToFile(String[] strs, String fileName){

//         try (FileWriter fw = new FileWriter(fileName)) {
//             for (String str : strs) {
//                 fw.write(str);
//                 fw.write(System.lineSeparator());
                
//             }            
//             logger.log(Level.INFO, "Данные успешно записаны в файл");


//         } catch (Exception e) {
//             logger.warning("Ошибка записи файла");            
//         }        
//     } 
    
//     public static void configLogger() {
//        try {
//         FileHandler fh = new FileHandler("log.txt", true);
//         logger.addHandler(fh);
//         SimpleFormatter formatter = new SimpleFormatter();
//         fh.setFormatter(formatter);

//        } catch (Exception e) {
//         e.printStackTrace();
//        }
       
    
//     }   
// }


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ContentFolder {

    // Метод для получения содержимого текущей папки
    public String[] getCurrentFolderContents() {
        File folder = new File(".");
        return folder.list();
    }

    // Метод для записи массива в файл
    public void writeArrayToFile(String[] array, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (String item : array) {
                writer.write(item + "\n");
            }
        } catch (IOException e) {
            // Запись исключения в лог-файл
            writeExceptionToLog(e);
        }
    }

    // Метод для записи исключения в лог-файл
    public void writeExceptionToLog(Exception e) {
        try (FileWriter writer = new FileWriter("error.log")) {
            writer.write(e.toString());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ContentFolder fileHandling = new ContentFolder();
        String[] contents = fileHandling.getCurrentFolderContents();
        fileHandling.writeArrayToFile(contents, "files.txt");
    }
}