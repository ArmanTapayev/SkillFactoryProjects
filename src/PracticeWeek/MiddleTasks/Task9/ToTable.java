package PracticeWeek.MiddleTasks.Task9;
/*
Напишите два класса: ToTable и ToLine.

Класс ToTable
Этот класс должен превращать одномерный массив чисел в таблицу (двумерный массив чисел x на y).
В этом классе реализуйте:
    поле data (одномерный массив);
    поле x ( число);
    поле y (число);
    конструктор, инициализирующий данные поля (data, x, y);
    метод resize(), возвращающий двумерный список x на y.
Пример:

ToTable a = new ToTable(new int[] {1, 2, 3, 4, 5, 6}, 3, 2);
int[][] arr = a.resize();
В поле arr должен попасть массив вида: [[1, 2], [3, 4], [5, 6]].
 */

public class ToTable {
    public int[] data;
    public int x, y;

    public ToTable(int[] data, int x, int y) {
        this.data = data;
        this.x = x;
        this.y = y;
    }

    public int[][] resize() {
        int[][] array = new int[x][y];
        int k = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                array[i][j] = data[k++];
            }
        }
        return array;
    }
}
