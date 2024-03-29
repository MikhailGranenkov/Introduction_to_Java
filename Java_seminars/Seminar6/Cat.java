package Seminar6;


// 1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
// а) информационной системой ветеринарной клиники
// б) архивом выставки котов
// в) информационной системой Театра кошек Ю. Д. Куклачёва
// Можно записать в текстовом виде, не обязательно реализовывать в java.
// 2. Реализуйте 1 из вариантов класса Cat из предыдущего задания, можно использовать не все придуманные поля и методы. Создайте несколько экземпляров этого класса, выведите их в консоль.
// 3. Добейтесь того, чтобы при выводе в консоль объекта типа Cat, выводилась его кличка, цвет и возраст (или другие параметры на ваше усмотрение).


// Для информационной системы ветеринарной клиники полезными полями и методами для класса Cat могут быть:

// Поля:
// кличка;
// возраст;
// порода;
// цвет;
// список медицинских записей (например, посещения ветеринара, вакцинации и пр.);
// владелец (если известен).
// Методы:
// добавление медицинской записи;
// вывод информации о коте (кличка, возраст, порода, цвет);
// поиск по кличке или другим характеристикам;
// обновление информации о коте;
// удаление кота из базы данных.
// Для архива выставки котов поля и методы могут быть более ориентированы на характеристики красоты и характера кота:

// Поля:
// кличка;
// возраст;
// порода;
// цвет;
// награды и титулы (если есть);
// описание внешности;
// описание характера;
// фотографии.
// Методы:
// вывод информации о коте (кличка, возраст, порода, цвет, описание);
// поиск по кличке, породе или другим характеристикам;
// добавление или обновление фотографий;
// оценка кота на основе его характеристик.
// Ниже представлен пример реализации класса Cat для информационной системы ветеринарной клиники:


public class Cat {
    private String name;
    private int age;
    private String breed;
    private String color;

    // Конструктор
    public Cat(String name, int age, String breed, String color) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.color = color;
    }

    // Метод для вывода информации о коте
    public void printInfo() {
        System.out.println("Кличка: " + name);
        System.out.println("Возраст: " + age + " года");
        System.out.println("Порода: " + breed);
        System.out.println("Цвет: " + color);
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        // Создание нескольких экземпляров класса Cat и вывод их информации
        Cat cat1 = new Cat("Мурзик", 3, "Домашний", "Серый");
        Cat cat2 = new Cat("Барсик", 2, "Мейн-кун", "Полосатый");

        cat1.printInfo();
        System.out.println();
        cat2.printInfo();
    }
}
