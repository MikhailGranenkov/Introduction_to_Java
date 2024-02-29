package Seminar6;


// 1. Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>. Поместите в него некоторое количество объектов.
// 2. Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество. Убедитесь, что все они сохранились во множество.
// 3. Создайте метод public boolean equals(Object o)
// Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод должен возвращать true, только если значения во всех полях сравниваемых объектов равны.
// 4. Создайте метод public int hashCode()
// который будет возвращать hash, вычисленный на основе полей класса Cat. (Можно использовать Objects.hash(...))
// 5. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.


// Описание класса ArrayCats:
// Этот класс представляет кота и содержит информацию о его основных характеристиках, таких как кличка, возраст, порода и цвет. Поля класса ArrayCats включают:
// name (кличка кота)
// age (возраст кота)
// breed (порода кота)
// color (цвет кота)
// Конструктор класса ArrayCats:
// Этот конструктор инициализирует новый объект ArrayCats с заданными значениями клички, возраста, породы и цвета.
// Переопределенные методы equals() и hashCode():
// Метод equals() сравнивает два объекта ArrayCats на равенство. Он возвращает true, если значения всех полей объектов совпадают.
// Метод hashCode() вычисляет хэш-код для объекта ArrayCats на основе его полей. Это важно для корректного функционирования встроенных коллекций Java, таких как HashSet.
// Метод printInfo():
// Этот метод выводит информацию о коте на консоль, включая его кличку, возраст, породу и цвет.
// Метод main():
// Создает экземпляры класса ArrayCats, представляющие разных котов.
// Добавляет эти экземпляры в HashSet<ArrayCats>, чтобы хранить их в виде множества без дубликатов.
// Выводит содержимое множества на консоль, используя метод printInfo(). Обратите внимание, что только один кот сохраняется в множестве с одинаковыми параметрами, потому что HashSet не допускает дубликатов.


import java.util.HashSet;
import java.util.Objects;

public class ArrayCats {
    private String name;
    private int age;
    private String breed;
    private String color;

    // Конструктор для класса Cat
    public ArrayCats(String name, int age, String breed, String color) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.color = color;
    }

    // Переопределяем метод equals для сравнения объектов Cat
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayCats cat = (ArrayCats) o;
        return age == cat.age &&
                Objects.equals(name, cat.name) &&
                Objects.equals(breed, cat.breed) &&
                Objects.equals(color, cat.color);
    }

    // Переопределяем метод hashCode для вычисления хэша на основе полей Cat
    @Override
    public int hashCode() {
        return Objects.hash(name, age, breed, color);
    }

    // Метод для вывода информации о коте
    public void printInfo() {
        System.out.println("Кличка: " + name);
        System.out.println("Возраст: " + age + " года");
        System.out.println("Порода: " + breed);
        System.out.println("Цвет: " + color);
    }

    public static void main(String[] args) {
        HashSet<ArrayCats> catSet = new HashSet<>();

        // Создание нескольких экземпляров класса Cat
        ArrayCats cat1 = new ArrayCats("Мурзик", 3, "Домашний", "Серый");
        ArrayCats cat2 = new ArrayCats("Барсик", 2, "Мейн-кун", "Полосатый");
        ArrayCats cat3 = new ArrayCats("Мурзик", 3, "Домашний", "Серый"); // Кот с такими же параметрами, как cat1

        // Добавление котов в множество
        catSet.add(cat1);
        catSet.add(cat2);
        catSet.add(cat3);

        // Вывод содержимого множества
        System.out.println("Содержимое множества:");
        for (ArrayCats cat : catSet) {
            cat.printInfo();
            System.out.println();
        }
    }
}
