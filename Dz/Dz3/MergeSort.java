package Dz.Dz3;

// Внутри класса MergeSort напишите метод mergeSort,
//  который принимает массив целых чисел, реализует алгоритм сортировки слиянием.
//   Метод должен возвращать отсортированный массив.

// Пример

// a = {5, 1, 6, 2, 3, 4} -> [1, 2, 3, 4, 5, 6]


import java.util.Arrays;

class MergeSort {
    // Метод mergeSort, который принимает массив целых чисел и возвращает отсортированный массив
    public static int[] mergeSort(int[] arr) {
        // Базовый случай: если массив содержит 0 или 1 элемент, он уже отсортирован
        if (arr.length <= 1) {
            return arr;
        }
        
        // Находим середину массива
        int mid = arr.length / 2;
        
        // Создаем два подмассива: левый и правый
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);
        
        // Рекурсивно сортируем левый и правый подмассивы
        left = mergeSort(left);
        right = mergeSort(right);
        
        // Сливаем отсортированные подмассивы в один отсортированный массив
        return merge(left, right);
    }
    
    // Вспомогательный метод для слияния двух отсортированных массивов в один отсортированный
    private static int[] merge(int[] left, int[] right) {
        // Создаем новый массив для хранения результата слияния
        int[] merged = new int[left.length + right.length];
        int leftIndex = 0, rightIndex = 0, mergedIndex = 0;
        
        // Пока есть элементы в обоих массивах
        while (leftIndex < left.length && rightIndex < right.length) {
            // Сравниваем текущие элементы левого и правого массивов
            // и помещаем минимальный из них в результирующий массив
            if (left[leftIndex] < right[rightIndex]) {
                merged[mergedIndex++] = left[leftIndex++];
            } else {
                merged[mergedIndex++] = right[rightIndex++];
            }
        }
        
        // Добавляем оставшиеся элементы из левого массива, если они есть
        while (leftIndex < left.length) {
            merged[mergedIndex++] = left[leftIndex++];
        }
        
        // Добавляем оставшиеся элементы из правого массива, если они есть
        while (rightIndex < right.length) {
            merged[mergedIndex++] = right[rightIndex++];
        }
        
        // Возвращаем результирующий массив после слияния
        return merged;
    }
}

// Класс Printer нужен для вывода результатов на экран и проверки
class Printer { 
    public static void main(String[] args) { 
        int[] a;

        if (args.length == 0) {
            // При отправке кода на выполнение, вы можете варьировать эти параметры
            a = new int[]{5, 1, 6, 2, 3, 4};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        // Создаем объект класса MergeSort и вызываем метод mergeSort
        int[] sortedArray = MergeSort.mergeSort(a);
        
        // Выводим отсортированный массив
        System.out.println(Arrays.toString(sortedArray));
    }
}
