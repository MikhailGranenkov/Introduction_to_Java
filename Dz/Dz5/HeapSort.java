package Dz.Dz5;


// Необходимо разработать программу для сортировки массива целых чисел с использованием сортировки кучей (Heap Sort). Программа должна работать следующим образом:
// Принимать на вход массив целых чисел для сортировки. Если массив не предоставлен, программа использует массив по умолчанию.
// Сначала выводить исходный массив на экран.
// Затем применять сортировку кучей (Heap Sort) для сортировки элементов массива в порядке возрастания.
// Выводить отсортированный массив на экран.
// Ваше решение должно содержать два основных метода: buildTree, который строит сортирующее дерево на основе массива, и heapSort, который выполняет собственно сортировку кучей.
// Программа должна быть способной сортировать массив, даже если он состоит из отрицательных чисел и имеет дубликаты.

// На входе:
// '5 8 12 3 6 9'
// На выходе:
// Initial array:
// [5, 8, 12, 3, 6, 9]
// Sorted array:
// [3, 5, 6, 8, 9, 12]


// Метод buildTree: Строит сортирующее дерево на основе массива, начиная с последнего родительского узла и выполняя просеивание вниз для каждого узла.
// Метод heapify: Выполняет просеивание вниз для элемента с заданным индексом, чтобы восстановить свойство кучи.
// Метод heapSort: Сортирует массив с помощью сортировки кучей. Сначала строится сортирующее дерево, затем элементы извлекаются из кучи и восстанавливается свойство кучи.
// Метод main: Он сначала проверяет, предоставлен ли массив через аргументы командной строки. Если нет, запрашивает у пользователя ввод элементов массива с клавиатуры. Затем вызывает метод heapSort для сортировки массива и выводит исходный и отсортированный массивы на экран.


import java.util.Arrays;
import java.util.Scanner;

public class HeapSort {
    // Метод buildTree строит сортирующее дерево на основе массива
    public static void buildTree(int[] tree, int sortLength) {
        // Начинаем с последнего родительского узла (последний индекс массива с элементами)
        int lastParentIndex = (sortLength - 2) / 2;

        // Проходимся по всем родительским узлам и выполняем просеивание вниз (heapify) для каждого
        for (int i = lastParentIndex; i >= 0; i--) {
            heapify(tree, sortLength, i);
        }
    }

    // Метод heapify выполняет просеивание вниз для элемента с заданным индексом
    private static void heapify(int[] tree, int sortLength, int parentIndex) {
        int largestIndex = parentIndex; // Индекс самого большого элемента из родительского узла и его потомков
        int leftChildIndex = 2 * parentIndex + 1; // Индекс левого потомка
        int rightChildIndex = 2 * parentIndex + 2; // Индекс правого потомка

        // Сравниваем значение родительского узла с его левым потомком
        if (leftChildIndex < sortLength && tree[leftChildIndex] > tree[largestIndex]) {
            largestIndex = leftChildIndex;
        }

        // Сравниваем значение родительского узла с его правым потомком
        if (rightChildIndex < sortLength && tree[rightChildIndex] > tree[largestIndex]) {
            largestIndex = rightChildIndex;
        }

        // Если самый большой элемент не родительский, меняем их местами и вызываем heapify для затронутого поддерева
        if (largestIndex != parentIndex) {
            int temp = tree[parentIndex];
            tree[parentIndex] = tree[largestIndex];
            tree[largestIndex] = temp;
            heapify(tree, sortLength, largestIndex);
        }
    }

    // Метод heapSort выполняет сортировку кучей
    public static void heapSort(int[] sortArray, int sortLength) {
        // Строим сортирующее дерево на основе массива
        buildTree(sortArray, sortLength);

        // Последовательно извлекаем элементы из кучи и восстанавливаем свойство кучи
        for (int i = sortLength - 1; i > 0; i--) {
            // Меняем корень кучи (максимальный элемент) с последним элементом в массиве
            int temp = sortArray[0];
            sortArray[0] = sortArray[i];
            sortArray[i] = temp;

            // Уменьшаем размер кучи на 1 и восстанавливаем свойство кучи
            heapify(sortArray, i, 0);
        }
    }

    public static void main(String[] args) {
        int[] initArray;

        if (args.length == 0) {
            // Если массив не предоставлен, используем массив по умолчанию
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите элементы массива через пробел: ");
            String input = scanner.nextLine();
            initArray = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
            scanner.close();
        } else {
            // Иначе используем предоставленный массив
            initArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        // Выводим исходный массив
        System.out.println("Initial array:");
        System.out.println(Arrays.toString(initArray));

        // Сортируем массив с помощью сортировки кучей
        heapSort(initArray, initArray.length);

        // Выводим отсортированный массив
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(initArray));
    }
}
