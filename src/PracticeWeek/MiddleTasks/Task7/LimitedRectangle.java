package PracticeWeek.MiddleTasks.Task7;
/*
Задача 7
Напишите класс LimitingRectangle ( Ограничивающий точки прямоугольник),
класс принимает точки на плоскости и строит прямоугольник минимального размера.
Если точка лежит на границе прямоугольника, то считаем, что она в него входит.

В нем должны быть:

поле points (двумерный массив целых чисел);
конструктор, принимающий двумерный массив целых чисел (массив точек на плоскости вида [[1, 0], [2, 3], ...],
0 элемент — координата по оси X, 1 элемент — по оси Y);
метод getWidth(), возвращающий целое число (ширину прямоугольника);
метод getHeight(), возвращает целое число (высоту прямоугольника);
метод getBorders, возвращает строку вида {нижняя точка по Y, верхняя точка по Y, левая точка по Х, правая точка по Х}.
Пример:
LimitingRectangle r = new LimitingRectangle(new int[][] {{-1, -2}, {3, 4}});
System.out.println(r.getWidth() +   + r.getHeight());
System.out.println(r.getBorders());
Вывод:
4 6
-2, 4, -1, 3
 */

public class LimitedRectangle {
    public int[][] array;

    public LimitedRectangle(int[][] array) {
        this.array = array;
    }

    // возвращающий целое число (ширину прямоугольника)
    public int getWidth() {
        return max(0) - min(0);
    }

    public int getHeight() {
        return max(1) - min(1);
    }

    public int min(int num) {
        int min = array[0][num];
        for (int i = 0; i < array.length; i++) {
            if (array[i][num] <= min)
                min = array[i][num];
        }
        return min;
    }

    public int max(int num) {
        int max = array[0][num];
        for (int i = 0; i < array.length; i++) {
            if (array[i][num] >= max)
                max = array[i][num];
        }
        return max;
    }

    public String getBorders() {
        return this.min(1) + ", " + this.max(1) + ", " + this.min(0) + ", " + this.max(0);
    }
}

/* Ответ:
public class LimitingRectangle {
   int[][] points;

   public LimitingRectangle(int[][] points) {
       this.points = points;
   }

   // searching min point
   int min(int ind) {
       int min = 10000;
       for (int i = 0; i < points.length; i++) {
           if (points[i][ind] <= min) min = points[i][ind];
       }
       return min;
   }
   // searching max point
   int max(int ind) {
       int max = -10000;
       for (int i = 0; i < points.length; i++) {
           if (points[i][ind] >= max) max = points[i][ind];
       }
       return max;
   }

   int getWidth() {
       return this.max(0) - this.min(0);
   }

   int getHeight() {
       return this.max(1) - this.min(1);
   }

   String getBorders() {
       return this.min(1) + ", " + this.max(1) + ", " + this.min(0) + ", " + this.max(0);
   }
}
 */