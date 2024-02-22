package Seminar1;
// Задача 2.

import java.util.Arrays;

// Дан массив nums = [3,2,2,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести
// эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива
// должны быть отличны от заданного, а остальные - равны ему.
public class ArrayElementTransfer {
  // Вариант 1.
  public static void main(String[] args) {
// int[] arr = { 3, 2, 2, 3, 4, 6, 76, 3, 6, -13 };
//         int val = 6;
//         int left = 0;
//         int right = arr.length - 1;

//         while (arr[right] == val) {
//             right--;
//         }

//         while (left < right) {
//             if (arr[left] == val) {
//                 arr[left] = arr[right];
//                 arr[right] = val;
//                 right--;

//             }
//             left++;
//         }
//         System.out.println(Arrays.toString(arr));
//       }
//     }

// Вариант 2.

int[] arr = { 3, 2, 2, 3, 4, 6, 76, 3, 6, -13 };
        int val = 6;
        moveToEndElem(arr, val);
        System.out.println(Arrays.toString(arr));

    }

    /**
     * @param arr
     * @param val
     */
    private static void moveToEndElem(int[] arr, int val) {
        int left = 0;
        int right = arr.length - 1;

        while (arr[right] == val) {
            right--;
        }

        while (left < right) {
            if (arr[left] == val) {
                arr[left] = arr[right];
                arr[right] = val;
                right--;

            }
            left++;
        }
      }
    }

