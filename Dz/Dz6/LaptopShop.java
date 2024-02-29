package Dz.Dz6;


// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии)
// фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
// “Введите цифру, соответствующую необходимому критерию: 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система 4 - Цвет ...
// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.


// Структура класса Laptop включает в себя поля для модели ноутбука, объема оперативной памяти (ОЗУ), объема жесткого диска (ЖД), операционной системы (OS), цвета корпуса и цены. Для каждого поля реализован соответствующий геттер.

// Метод filterLaptops фильтрует список ноутбуков по заданным критериям, хранящимся в Map<String, Object> criteria. Пользователю предоставляется возможность выбрать критерий фильтрации и ввести минимальное значение для этого критерия. Полученные результаты выводятся на экран.


// Определение класса LaptopShop:
// Класс LaptopShop содержит поля, которые описывают характеристики ноутбука, такие как модель, объем оперативной памяти, объем жесткого диска, операционная система, цвет и цена.
// Конструктор класса используется для инициализации объектов класса при создании экземпляров.
// Метод filterLaptops():
// Этот метод принимает в качестве аргументов множество ноутбуков laptops и карту критериев criteria, по которым необходимо отфильтровать ноутбуки.
// Проходится по каждому ноутбуку в множестве и проверяет его соответствие каждому критерию фильтрации, указанному в карте criteria.
// Если ноутбук соответствует всем критериям, он добавляется в список отфильтрованных ноутбуков.
// Метод main():
// Создается множество laptops, содержащее информацию о ноутбуках.
// Запрашиваются у пользователя критерии фильтрации и минимальные значения для этих критериев.
// Вызывается метод filterLaptops() для фильтрации ноутбуков по заданным критериям.
// Результаты фильтрации выводятся в консоль, представляя информацию о ноутбуках, которые удовлетворяют заданным критериям.
// Геттеры:
// Добавлены методы-геттеры для получения значений полей объекта класса LaptopShop.
// Эти методы позволяют получать значения полей извне класса.
// Ввод критериев фильтрации:
// В методе main() запрашивается у пользователя ввод критериев фильтрации и их минимальных значений.
// Пользователь выбирает критерий по номеру, а затем вводит минимальное значение для этого критерия.
// Фильтрация и вывод результатов:
// Вызывается метод filterLaptops(), чтобы отфильтровать ноутбуки согласно заданным критериям.
// Результаты фильтрации выводятся в консоль, представляя информацию о ноутбуках, которые соответствуют заданным критериям.


import java.util.*;

public class LaptopShop {
    private String model;           // модель ноутбука
    private int ram;                // объем оперативной памяти в ГБ
    private int storageCapacity;    // объем жесткого диска в ГБ
    private String os;              // операционная система
    private String color;           // цвет корпуса
    private double price;           // цена

    // Конструктор для создания экземпляра класса Laptop
    public LaptopShop(String model, int ram, int storageCapacity, String os, String color, double price) {
        this.model = model;
        this.ram = ram;
        this.storageCapacity = storageCapacity;
        this.os = os;
        this.color = color;
        this.price = price;
    }

    // Геттеры для получения значений полей
    public String getModel() {
        return model;
    }

    public int getRam() {
        return ram;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    // Метод для фильтрации списка ноутбуков по заданным критериям
    public static List<LaptopShop> filterLaptops(Set<LaptopShop> laptops, Map<String, Object> criteria) {
        List<LaptopShop> filteredLaptops = new ArrayList<>();

        // Проходим по всем ноутбукам
        for (LaptopShop laptop : laptops) {
            boolean matchesCriteria = true;
            // Проходим по всем критериям фильтрации
            for (Map.Entry<String, Object> entry : criteria.entrySet()) {
                String criterion = entry.getKey();
                Object value = entry.getValue();

                // Проверяем соответствие каждого критерия фильтрации для текущего ноутбука
                switch (criterion) {
                    case "ram":
                        if (laptop.getRam() < (int) value) {
                            matchesCriteria = false;
                        }
                        break;
                    case "storageCapacity":
                        if (laptop.getStorageCapacity() < (int) value) {
                            matchesCriteria = false;
                        }
                        break;
                    case "os":
                        if (!laptop.getOs().equalsIgnoreCase((String) value)) {
                            matchesCriteria = false;
                        }
                        break;
                    case "color":
                        if (!laptop.getColor().equalsIgnoreCase((String) value)) {
                            matchesCriteria = false;
                        }
                        break;
                    // Добавление дополнительных критериев фильтрации, если необходимо
                }
            }

            // Если ноутбук соответствует всем критериям фильтрации, добавляем его в список отфильтрованных ноутбуков
            if (matchesCriteria) {
                filteredLaptops.add(laptop);
            }
        }

        return filteredLaptops;
    }

    public static void main(String[] args) {
        // Создание множества ноутбуков
        Set<LaptopShop> laptops = new HashSet<>();
        laptops.add(new LaptopShop("Lenovo IdeaPad", 8, 512, "Windows 10", "Black", 800.0));
        laptops.add(new LaptopShop("Dell Inspiron", 16, 1000, "Windows 11", "Silver", 1200.0));
        laptops.add(new LaptopShop("Asus ZenBook", 16, 512, "Windows 10", "Blue", 1100.0));

        // Запрос критериев фильтрации у пользователя
        Scanner scanner = new Scanner(System.in);
        Map<String, Object> criteria = new HashMap<>();

        System.out.println("Выберите критерии фильтрации:");
        System.out.println("1 - Оперативная память (ОЗУ)");
        System.out.println("2 - Объем жесткого диска (ЖД)");
        System.out.println("3 - Операционная система (OS)");
        System.out.println("4 - Цвет корпуса");

        int choice;
        do {
            System.out.print("Введите цифру критерия: ");
            choice = scanner.nextInt();
        } while (choice < 1 || choice > 4);

        String[] criteriaNames = {"ram", "storageCapacity", "os", "color"};
        String criterion = criteriaNames[choice - 1];

        System.out.print("Введите минимальное значение для критерия \"" + criterion + "\": ");
        Object value;
        if (choice == 1 || choice == 2) {
            value = scanner.nextInt();
        } else {
            value = scanner.next();
        }

        criteria.put(criterion, value);

        // Фильтрация ноутбуков и вывод результатов
        List<LaptopShop> filteredLaptops = filterLaptops(laptops, criteria);
        if (filteredLaptops.isEmpty()) {
            System.out.println("По заданным критериям ноутбуков не найдено.");
        } else {
            System.out.println("Найденные ноутбуки:");
            for (LaptopShop laptop : filteredLaptops) {
                System.out.println(laptop.getModel() + ", ОЗУ: " + laptop.getRam() + "ГБ, ЖД: " +
                        laptop.getStorageCapacity() + "ГБ, ОС: " + laptop.getOs() +
                        ", Цвет: " + laptop.getColor() + ", Цена: $" + laptop.getPrice());
            }
        }
    }
}

