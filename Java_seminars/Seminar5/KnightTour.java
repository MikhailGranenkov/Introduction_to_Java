package Seminar5;


// Шахматную доску размером NxN обойти конём так, чтобы фигура в каждой клетке была строго один раз.


// Конструктор KnightTour(int N):
// Этот конструктор инициализирует объект KnightTour с заданным размером доски N.
// Создается двумерный массив path, представляющий доску. Инициализируются все клетки доски значением -1, что означает, что эти клетки еще не посещены рыцарем.
// Метод isSafe(int x, int y):
// Этот метод проверяет, является ли клетка с координатами (x, y) безопасной для посещения рыцарем.
// Клетка считается безопасной, если она находится в пределах доски (координаты x и y не превышают размер доски N) и еще не была посещена рыцарем (значение path[x][y] равно -1).
// Метод findPath():
// Этот метод начинает поиск пути рыцаря на доске.
// Устанавливается начальная позиция рыцаря в клетке (0, 0).
// Затем вызывается вспомогательный рекурсивный метод findPathUtil(), чтобы выполнить поиск пути.
// Метод findPathUtil(int x, int y, int move):
// Этот рекурсивный метод пытается найти путь рыцаря, начиная с клетки (x, y), и продолжая до посещения всех клеток на доске.
// Параметры метода:
// x и y: текущие координаты рыцаря.
// move: текущий номер хода рыцаря.
// Метод перебирает все возможные ходы коня из текущей позиции. Если ход допустим, то рыцарь переходит на новую клетку и продолжает поиск рекурсивно.
// Если удалось посетить все клетки доски, метод возвращает true, иначе false.
// Метод printSolution():
// Этот метод выводит на консоль найденный путь рыцаря на доске.
// Он просто перебирает все клетки доски и выводит их значения из массива path.
// Метод main(String[] args):
// Этот метод является точкой входа в программу.
// Сначала он запрашивает у пользователя размер доски.
// Создается объект KnightTour с указанным размером доски.
// Вызывается метод findPath() для поиска пути рыцаря на доске.
// Если путь рыцаря найден, то программа выводит его на консоль.
// Таким образом, код позволяет пользователю ввести размер доски, а затем находит и выводит путь рыцаря на этой доске, если он существует.


import java.util.*;

public class KnightTour {
    private int N; // Размер доски NxN
    private int[][] path; // Массив для хранения пути рыцаря
    private int[] xMove = {2, 1, -1, -2, -2, -1, 1, 2}; // Возможные шаги по оси X для коня
    private int[] yMove = {1, 2, 2, 1, -1, -2, -2, -1}; // Возможные шаги по оси Y для коня

    // Конструктор для инициализации объекта KnightTour с размером доски NxN
    public KnightTour(int N) {
        this.N = N;
        path = new int[N][N]; // Создаем массив для хранения пути рыцаря
        // Инициализируем все клетки доски значением -1 (клетка еще не посещена)
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                path[i][j] = -1;
            }
        }
    }

    // Проверка, является ли клетка с координатами (x, y) допустимой для хода рыцаря
    private boolean isSafe(int x, int y) {
        // Клетка должна быть в пределах доски и еще не должна быть посещена рыцарем
        return (x >= 0 && y >= 0 && x < N && y < N && path[x][y] == -1);
    }

    // Поиск пути рыцаря на доске
    public boolean findPath() {
        // Устанавливаем начальную позицию рыцаря в клетке (0, 0)
        path[0][0] = 0;
        // Вызываем вспомогательный метод для поиска пути начиная с клетки (0, 0)
        if (!findPathUtil(0, 0, 1)) { // Если путь не найден, возвращаем false
            System.out.println("Решение не существует");
            return false;
        } else { // Если путь найден, выводим его и возвращаем true
            printSolution();
            return true;
        }
    }

    // Рекурсивный метод для поиска пути рыцаря начиная с клетки (x, y)
    private boolean findPathUtil(int x, int y, int move) {
        int k, nextX, nextY;
        // Если рыцарь посетил все клетки доски, возвращаем true
        if (move == N * N) {
            return true;
        }
        // Перебираем все возможные ходы коня из текущей позиции
        for (k = 0; k < 8; k++) {
            nextX = x + xMove[k];
            nextY = y + yMove[k];
            // Если ход допустим, пробуем сделать его
            if (isSafe(nextX, nextY)) {
                path[nextX][nextY] = move; // Помечаем клетку как посещенную
                // Рекурсивно ищем путь начиная с новой позиции
                if (findPathUtil(nextX, nextY, move + 1)) {
                    return true; // Если путь найден, возвращаем true
                } else {
                    path[nextX][nextY] = -1; // Отмечаем клетку как непосещенную
                }
            }
        }
        return false; // Если не удалось найти путь, возвращаем false
    }

    // Вывод пути рыцаря на доске
    private void printSolution() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(path[i][j] + "\t"); // Выводим номер хода в клетке
            }
            System.out.println(); // Переходим на новую строку после вывода всех клеток в строке
        }
    }

    // Точка входа в программу
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер доски:");
        int size = scanner.nextInt(); // Считываем размер доски от пользователя
        scanner.close(); // Закрываем Scanner после ввода

        KnightTour tour = new KnightTour(size); // Создаем объект KnightTour с заданным размером доски
        tour.findPath(); // Находим и выводим путь рыцаря на доске
    }
}
