package Seminar4;

// Задание №4
// Реализовать стэк с помощью массива. Нужно реализовать методы:
// size(), empty(), push(), peek(), pop().

// Пояснения:
// array - массив, используемый для хранения элементов стека.
// size - переменная, отслеживающая текущий размер стека.
// DEFAULT_CAPACITY - начальная емкость массива стека.
// Методы size() и empty() возвращают текущий размер стека и проверяют,
// пуст ли он, соответственно.
// Метод push(T item) добавляет элемент в стек.
// Методы peek() и pop() просматривают верхний элемент стека и извлекают его соответственно.
// Метод resize() увеличивает размер массива, когда стек становится полным.
// В методе main() приведен пример использования стека, в котором мы добавляем элементы,
// а затем выводим их, извлекая из стека.


public class ArrayStack<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] array;
    private int size;

    // Конструктор, инициализирующий стек с начальной емкостью
    public ArrayStack() {
        this.array = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    // Метод, возвращающий размер стека
    public int size() {
        return size;
    }

    // Метод, проверяющий, пуст ли стек
    public boolean empty() {
        return size == 0;
    }

    // Метод для добавления элемента в стек
    public void push(T item) {
        // Проверяем, достаточно ли места в массиве
        if (size == array.length) {
            // Если нет, увеличиваем размер массива
            resize();
        }
        array[size++] = item;
    }

    // Метод для просмотра элемента на вершине стека
    @SuppressWarnings("unchecked")
    public T peek() {
        if (empty()) {
            throw new IllegalStateException("Стек пуст");
        }
        return (T) array[size - 1];
    }

    // Метод для извлечения элемента из стека
    @SuppressWarnings("unchecked")
    public T pop() {
        if (empty()) {
            throw new IllegalStateException("Стек пуст");
        }
        T item = (T) array[--size];
        array[size] = null; // Удаляем ссылку на удаленный элемент для избежания утечки памяти
        return item;
    }

    // Приватный метод для изменения размера массива
    private void resize() {
        int newCapacity = array.length * 2; // Увеличиваем емкость вдвое
        Object[] newArray = new Object[newCapacity];
        System.arraycopy(array, 0, newArray, 0, size); // Копируем элементы в новый массив
        array = newArray;
    }

    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<>();

        // Добавляем элементы в стек
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        // Выводим размер стека и его содержимое
        System.out.println("Размер стека: " + stack.size());
        System.out.println("Содержимое стека:");
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }
}
