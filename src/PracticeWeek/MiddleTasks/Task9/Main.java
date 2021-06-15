package PracticeWeek.MiddleTasks.Task9;

public class Main {
    public static void main(String[] args) {
        ToTable toTable = new ToTable(new int[]{1, 2, 3, 4, 5, 6}, 3, 2);
        int[][] arr = toTable.resize();
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("]");
        }

        System.out.println();

        ToLine a = new ToLine(new int[][]{{1, 2}, {3, 4}, {5, 6}});
        int[] arr2 = a.resize();
        System.out.print("[");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.print("]");
    }
}

/* Ответ:
class ToTable {
   int[] data;
   int x, y;

   public ToTable(int[] data, int x, int y) {
       this.data = data;
       this.x = x;
       this.y = y;
   }

   int[][] resize() {
       // склеиваем двумерный массив в один при помощи start
       int[][] res = new int[x][y];
       int start = 0;
       for (int i = 0; i < x; i++) {
           for (int j = start; j < start + y; j++) {
               res[i][j - start] = data[j];
           }
           start += y;
       }
       return res;
   }
}

class ToLine {
   int[][] data;

   public ToLine(int[][] data) {
       this.data = data;
   }

   int[] resize() {
       // склеиваем двумерный массив в один при помощи start
       int[] res = new int[data.length * data[0].length];
       int start = 0;
       for (int[] datum : data) {
           for (int j = 0; j < datum.length; j++) {
               res[start + j] = datum[j];
           }
           start += datum.length;
       }
       return res;
   }
}
 */
