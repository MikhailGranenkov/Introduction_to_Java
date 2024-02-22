package Seminar1;
// Задача 1.

// Дан массив двоичных чисел, например [1,1,0,1,1,1],
// вывести максимальное количество подряд идущих 1.
public class MaximumRecurringNumbers {
    public static void main(String[] args) {
    int[] arr = { 1, 0, 0, 1, 0, 1, 1, 1, 1, 0, 0 };

          int max = getRepeatOnce(arr);
          System.out.println(max);
    
      }
    
      private static int getRepeatOnce(int[] arr) {
          int count = 0;
          int max = 0;
    
          for (int i = 0; i < arr.length; i++) {
              if (arr[i] == 1) {
                  count++;
                  max = max < count ? count : max;
                  // max = Math.max(count, max);
                  // if (max < count) {
                  // max = count;
                  // }
              } else {
                  count = 0;
              }
          }
          return max;
      }
    
 
}
