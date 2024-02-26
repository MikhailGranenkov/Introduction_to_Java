package Seminar2;


// Задача 1.
// Дано четное число N (>0) и символы c1 и c2.
// Написать метод, который вернет строку длины N, которая
// состоит из чередующихся символов c1 и c2, начиная с c1.


// Этот код создает строки с чередующимися символами и сравнивает
// производительность использования операции конкатенации для String
// и класса StringBuilder. В коде выполняются следующие действия:
// В методе main определяются переменные: n (количество символов в строке),
// c1 и c2 (символы, которые будут чередоваться).
// Вызываются два метода для создания строк: getAlternatingCharsString
// и getAlternatingCharsSb.
// В каждом методе создается строка с чередующимися символами,
// при помощи операции конкатенации для String или класса StringBuilder.
// Время выполнения каждого метода замеряется с помощью методов
// System.currentTimeMillis(), и выводится в консоль.


public class AlternatingChars {
    public static void main(String[] args) {
        int n = 500_000; // Количество символов в строке
        char c1 = 'a'; // Первый символ
        char c2 = 'b'; // Второй символ

        // Создание строки с чередующимися символами при помощи операции конкатенации для String
        long start = System.currentTimeMillis(); // Замеряем время начала операции
        getAlternatingCharsString(n, c1, c2); // Вызываем метод для создания строки с чередующимися символами
        System.out.println(System.currentTimeMillis() - start); // Выводим время выполнения операции

        // Создание строки с чередующимися символами при помощи StringBuilder
        start = System.currentTimeMillis(); // Замеряем время начала операции
        getAlternatingCharsSb(n, c1, c2); // Вызываем метод для создания строки с чередующимися символами
        System.out.println(System.currentTimeMillis() - start); // Выводим время выполнения операции
    }

    // Метод для создания строки с чередующимися символами при помощи операции конкатенации для String
    public static String getAlternatingCharsString(int n, char c1, char c2) {
        String str = ""; // Создаем пустую строку
        for (int i = 0; i < n / 2; i++) { // Повторяем n / 2 раз
            // Конкатенируем символы c1 и c2 в строку
            str += Character.toString(c1) + Character.toString(c2);
        }
        return str; // Возвращаем полученную строку
    }

    // Метод для создания строки с чередующимися символами при помощи StringBuilder
    public static String getAlternatingCharsSb(int n, char c1, char c2) {
        StringBuilder sb = new StringBuilder(n); // Создаем объект StringBuilder с начальной емкостью n
        for (int i = 0; i < n / 2; i++) { // Повторяем n / 2 раз
            // Добавляем символы c1 и c2 в StringBuilder
            sb.append(c1).append(c2);
        }
        return sb.toString(); // Возвращаем полученную строку
    }
}
