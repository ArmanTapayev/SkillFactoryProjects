package PracticeWeek.MiddleTasks.Task9;
/*
Этот класс работает наоборот, то есть из двумерного массива делает одномерный.

В этом классе реализуйте:
    поле data (двумерный массив);
    конструктор, инициализирующий данное поле (data);
    метод resize(), возвращающий одномерный список.
Пример:

ToLine a = new ToLine(new int[][] {{1, 2}, {3, 4}, {5, 6}});
int[] arr = a.resize();
В поле arr должен попасть массив вида: [1, 2, 3, 4, 5, 6].
 */

public class ToLine {
    public int[][] data;

    public ToLine(int[][] data) {
        this.data = data;
    }

    public int[] resize() {
        int i = data.length;
        int j = data[0].length;
        int k = 0;
        int[] array = new int[i * j];

        for (int l = 0; l < i; l++) {
            for (int m = 0; m < j; m++) {
                array[k++] = data[l][m];
            }
        }
        return array;
    }
}
