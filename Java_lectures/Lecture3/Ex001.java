package Java_lectures.Lecture3;


// Этот код на Java демонстрирует функцию AddItemInArray, которая добавляет элемент в конец массива и возвращает новый массив с добавленным элементом. Вот пошаговое объяснение:

// Метод AddItemInArray(int[] array, int item):
// Этот метод принимает два параметра: массив array и элемент item, который нужно добавить в массив.
// Создается переменная length, содержащая длину исходного массива.
// Создается новый временный массив temp с длиной, на один большей, чем исходный массив.
// С помощью метода System.arraycopy копируются все элементы из исходного массива array во временный массив temp.
// Элемент item добавляется в конец временного массива temp.
// Возвращается новый массив temp с добавленным элементом.
// Метод main(String[] args):
// Создается массив a и инициализируется двумя элементами {0, 9}.
// С помощью цикла for-each выводятся элементы исходного массива a.
// Добавляются новые элементы в массив a, используя метод AddItemInArray.
// Снова выводятся элементы массива a, включая новые добавленные элементы.
// Вывод результатов:
// После первого цикла вывода в консоль будут выведены элементы исходного массива a.
// После добавления новых элементов в массив a и последующего второго цикла вывода в консоль будут выведены все элементы массива a, включая новые добавленные элементы.

public class Ex001 {
    static int[] AddItemInArray(int[] array, int item) {
        int length = array.length;
        
        int[] temp = new int[length + 1];
        System.arraycopy(array, 0, temp, 0, length);
        temp[length] = item;
        return temp;
    }

    public static void main(String[] args) {
        int[] a = new int[] { 0, 9 };
        for (int i : a) { System.out.printf("%d ", i); }
        a = AddItemInArray(a, 11);
        a = AddItemInArray(a, 111);
        a = AddItemInArray(a, 1111);
        System.out.println();
        for (int j : a) { System.out.printf("%d ", j); }
        System.out.println();
    }
}