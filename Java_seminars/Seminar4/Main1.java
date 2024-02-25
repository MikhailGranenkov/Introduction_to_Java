package Seminar4;

// Задание №1
// Реализовать консольное приложение, которое:
// 1. Принимает от пользователя строку вида
// text~num
// 2. Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
// 3. Если введено print~num, выводит строку из позиции num в связном списке и удаляет
// её из списка.

// Краткое пояснение:
// Мы используем Scanner для считывания ввода пользователя.
// HashMap (linkedList) используется для хранения строк и их позиций.
// Мы используем бесконечный цикл while, чтобы продолжать принимать ввод от пользователя,
// пока он не введёт "exit".
// Мы разбиваем введенную строку на две части с помощью метода split("~")
// для получения команды и номера.
// В зависимости от команды (print или другой текст), мы либо добавляем текст в HashMap,
// либо выводим и удаляем его.
// Если введена неправильная строка, выводится сообщение об ошибке.
// После завершения работы с приложением сканнер закрывается.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> linkedList = new HashMap<>(); // Используем HashMap для хранения строк и их позиций

        System.out.println("Введите строки в формате 'text~num', либо 'print~num' для вывода строки из позиции num:");

        // Бесконечный цикл для обработки пользовательского ввода
        while (true) {
            System.out.print("Введите строку: ");
            String input = scanner.nextLine();

            // Проверяем условие выхода из цикла
            if (input.equals("exit")) {
                break;
            }

            // Разбиваем строку по символу '~'
            String[] parts = input.split("~");

            // Проверяем корректность формата ввода
            if (parts.length == 2) {
                String command = parts[0];
                int num = Integer.parseInt(parts[1]);

                if (command.equals("print")) {
                    // Если команда - "print", выводим строку из позиции num и удаляем её из списка
                    String text = linkedList.get(num);
                    if (text != null) {
                        System.out.println("Строка из позиции " + num + ": " + text);
                        linkedList.remove(num);
                    } else {
                        System.out.println("В списке нет строки с позицией " + num);
                    }
                } else {
                    // Если команда - не "print", сохраняем текст в связный список на позицию num
                    String text = parts[0];
                    linkedList.put(num, text);
                    System.out.println("Строка успешно добавлена в позицию " + num);
                }
            } else {
                System.out.println("Неправильный формат строки. Введите строку в формате 'text~num' или 'print~num'.");
            }
        }

        // Закрываем сканнер после завершения работы с ним
        scanner.close();
    }
}

